package fr.umlv.robomastermind.grammar.ast;

public class BreakNode extends AbstractNode implements InstructionNode {
	public BreakNode(Location location) {
		super(location);
	}

	@Override
	public <R, P> R accept(InstructionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitBreak(this, parameter);
	}
}
