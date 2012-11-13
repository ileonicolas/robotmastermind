package fr.umlv.robomastermind.grammar.ast;

public class EndNode extends AbstractNode implements InstructionNode {
	public EndNode(Location location) {
		super(location);
	}

	@Override
	public <R, P> R accept(InstructionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitEnd(this, parameter);
	}
}
