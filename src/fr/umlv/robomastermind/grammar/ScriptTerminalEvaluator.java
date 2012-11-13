package fr.umlv.robomastermind.grammar;

import fr.umlv.robomastermind.grammar.ast.Location;
import fr.umlv.robomastermind.grammar.ast.Location.Factory;
import fr.umlv.robomastermind.grammar.ast.Token;
import fr.umlv.robomastermind.grammar.tools.TerminalEvaluator;
import fr.umlv.tatoo.runtime.buffer.impl.CharSequenceWrapper;
import fr.umlv.tatoo.runtime.parser.ParsingException;

class ScriptTerminalEvaluator implements TerminalEvaluator<CharSequence> {
	private final CharSequenceWrapper buffer;
	private final Factory locationFactory;

	ScriptTerminalEvaluator(CharSequenceWrapper buffer, Factory locationFactory) {
		this.buffer = buffer;
		this.locationFactory = locationFactory;
	}

	private Location currentLocation() {
		return locationFactory.createLocation(buffer.getPosition());
	}

	@Override
	public void comment(CharSequence data) {
		// do nothing
	}

	@Override
	public Token<Integer> number(CharSequence data) {
		int value;
		try {
			value = Integer.parseInt(data.toString());
		} catch (NumberFormatException e) {
			throw new ParsingException(e);
		}
		return new Token<>(currentLocation(), value);
	}
	@Override
	public Token<String> id(CharSequence data) {
		return new Token<>(currentLocation(), data.toString());
	}
	@Override
	public Token<Boolean> bool(CharSequence data) {
		return new Token<>(currentLocation(), Boolean.parseBoolean(data.toString()));
	}

	@Override
	public Token<?> repeat(CharSequence data) {
		return new Token<>(currentLocation(), null);
	}
	@Override
	public Token<?> repeatWhile(CharSequence data) {
		return new Token<>(currentLocation(), null);
	}
	@Override
	public Token<?> lcurl(CharSequence data) {
		return new Token<>(currentLocation(), null);
	}
	@Override
	public Token<?> _break(CharSequence data) {
		return new Token<>(currentLocation(), null);
	}
	@Override
	public Token<?> _if(CharSequence data) {
		return new Token<>(currentLocation(), null);
	}
	@Override
	public Token<?> end(CharSequence data) {
		return new Token<>(currentLocation(), null);
	}
}