package fr.umlv.robomastermind.grammar;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Position;

import fr.umlv.robomastermind.grammar.ast.Location;
import fr.umlv.robomastermind.grammar.ast.Location.Factory;
import fr.umlv.robomastermind.grammar.ast.ScriptNode;
import fr.umlv.robomastermind.grammar.tools.Analyzers;
import fr.umlv.tatoo.runtime.buffer.impl.CharSequenceWrapper;
import fr.umlv.tatoo.runtime.lexer.LexingException;
import fr.umlv.tatoo.runtime.parser.ParsingException;

public class Scripts {
	static class PositionLocation implements Location {
		private final Position position;

		PositionLocation(Position position) {
			this.position = position;
		}

		@Override
		public int position() {
			return (position == null)? 0: position.getOffset();
		}
	}

	public static ScriptNode parse(final Document document, ErrorListener errorListener) {
		String text;
		try {
			text = document.getText(0, document.getLength());
		} catch (BadLocationException e) {
			throw new AssertionError(e);
		}
		CharSequenceWrapper buffer = new CharSequenceWrapper(text, null);
		Factory factory = new Factory() {
			@Override
			public Location createLocation(int sourcePosition) {
				try {
					// Position courante mot
					// System.out.println(sourcePosition);
					return new PositionLocation(document.createPosition(sourcePosition));
				} catch (BadLocationException e) {
					return new PositionLocation(null);
				}
			}
		};
		ScriptTerminalEvaluator terminalEvaluator = new ScriptTerminalEvaluator(buffer, factory);
		ASTGrammarEvaluator grammarEvaluator = new ASTGrammarEvaluator();
		try {
			Analyzers.run(buffer, terminalEvaluator, grammarEvaluator, null, null);
		} catch(LexingException | ParsingException e) {
			errorListener.error(e.getMessage());
			return null;
		}
		return grammarEvaluator.getScript();
	}
}
