package fr.umlv.robomastermind.grammar.analysis;

import java.util.Collection;

import fr.umlv.robomastermind.grammar.ast.BlockNode;
import fr.umlv.robomastermind.grammar.ast.BreakNode;
import fr.umlv.robomastermind.grammar.ast.EndNode;
import fr.umlv.robomastermind.grammar.ast.ExpressionNode;
import fr.umlv.robomastermind.grammar.ast.ExpressionVisitor;
import fr.umlv.robomastermind.grammar.ast.FunctionCallNode;
import fr.umlv.robomastermind.grammar.ast.IfNode;
import fr.umlv.robomastermind.grammar.ast.InstructionNode;
import fr.umlv.robomastermind.grammar.ast.InstructionVisitor;
import fr.umlv.robomastermind.grammar.ast.LiteralNode;
import fr.umlv.robomastermind.grammar.ast.OperatorNode;
import fr.umlv.robomastermind.grammar.ast.OperatorNode.Kind;
import fr.umlv.robomastermind.grammar.ast.ProcedureNode;
import fr.umlv.robomastermind.grammar.ast.RepeatNode;
import fr.umlv.robomastermind.grammar.ast.RepeatWhileNode;
import fr.umlv.robomastermind.grammar.ast.ScriptNode;
import fr.umlv.robomastermind.grammar.ast.VarAccessNode;

public class PrettyPrinter implements InstructionVisitor<PrettyPrinter.Printer, PrettyPrinter.Printer>, ExpressionVisitor<PrettyPrinter.Printer, PrettyPrinter.Printer> {
	interface Applier<T> {
		void apply(T element);
	}

	static class Printer {
		private final StringBuilder builder = new StringBuilder();
		private int margin;
		private boolean startOfLine = true;

		public Printer append(Object o) {
			if (startOfLine) {
				for(int i=0; i<margin; i++) {
					builder.append(' ');
				}
				startOfLine = false;
			}
			builder.append(o);
			return this;
		}

		public <E> Printer join(Collection<? extends E> collection, String separator, Applier<? super E> mapper) {
			if (collection.isEmpty()) {
				return this;
			}
			for(E element: collection) {
				if (mapper != null) {
					mapper.apply(element);
				} else {
					append(element);  
				}
				builder.append(separator);
			}
			builder.setLength(builder.length() - separator.length());
			return this;
		}

		public Printer eoln() {
			builder.append(LINE_SEPARATOR);
			startOfLine = true;
			return this;
		}

		public Printer enter() {
			margin += 2;
			return this;
		}

		public Printer exit() {
			margin -= 2;
			return this;
		}

		@Override
		public String toString() {
			return builder.toString();
		}

		private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	}

	public String print(ScriptNode script) {
		Printer builder = new Printer();

		for(ProcedureNode procedure: script.getProcedures()) {
			print(procedure, builder);			
		}
		for(InstructionNode instruction: script.getInstructions()) {
			instruction.accept(this, builder).eoln();
		}
		return builder.toString();
	}


	private void print(ProcedureNode procedure, Printer printer) {
		printer.append("procedure ").append(procedure.getName()).append('(');
		printer.join(procedure.getParameters(), ", ",  null).append(") ");
		print(procedure.getBlock(), printer);
		printer.eoln().eoln();
	}

	private void print(BlockNode block, final Printer printer) {
		printer.append("{").eoln();
		printer.enter();
		printer.join( block.getInstructions(), "", new Applier<InstructionNode>() {
			@Override
			public void apply(InstructionNode instruction) {
				instruction.accept(PrettyPrinter.this, printer);
				printer.eoln();
			}
		});
		printer.exit().append('}');
	}

	@Override
	public Printer visitBreak(BreakNode node, Printer printer) {
		return printer.append("break");
	}
	@Override
	public Printer visitEnd(EndNode node, Printer printer) {
		return printer.append("end");
	}
	@Override
	public Printer visitIf(IfNode node, Printer printer) {
		printer.append("if (");
		node.getCondition().accept(this, printer).append(") ");
		print(node.getIfBlock(), printer);
		BlockNode elseBlock = node.getElseBlock();
		if (elseBlock != null) {
			printer.append("else ");
			print(node.getIfBlock(), printer);
		}
		return printer;
	}
	@Override
	public Printer visitRepeat(RepeatNode node, Printer printer) {
		Integer count = node.getCount();
		printer.append("repeat (").append((count == null)? "": count).append(") ");
		print(node.getBlock(), printer);
		return printer;
	}
	@Override
	public Printer visitRepeatWhile(RepeatWhileNode node, Printer printer) {
		printer.append("repeatWhile (");
		node.getCondition().accept(this, printer).append(") ");
		print(node.getBlock(), printer);
		return printer;
	}

	@Override
	public Printer visitLiteral(LiteralNode node, Printer printer) {
		return printer.append(node.getValue());
	}
	@Override
	public Printer visitVarAccess(VarAccessNode node, Printer printer) {
		return printer.append(node.getId());
	}
	@Override
	public Printer visitOperator(OperatorNode node, Printer printer) {
		Kind kind = node.getKind();
		switch(kind) {
		case NOT:
			printer.append("not ");
			node.getLeft().accept(this, printer);
			return printer;
		default:
		}
		node.getLeft().accept(this, printer);
		printer.append((kind == Kind.AND)? " and ": " or ");
		node.getRight().accept(this, printer);
		return printer;
	}
	@Override
	public Printer visitFunctionCall(FunctionCallNode node, final Printer printer) {
		printer.append(node.getName()).append('(');
		printer.join(node.getArguments(), ", ", new Applier<ExpressionNode>() {
			@Override
			public void apply(ExpressionNode element) {
				element.accept(PrettyPrinter.this, printer);
			}
		});
		return printer.append(')');
	}
}
