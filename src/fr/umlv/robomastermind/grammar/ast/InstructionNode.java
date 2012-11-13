package fr.umlv.robomastermind.grammar.ast;

public interface InstructionNode extends ItemNode {
	public <R, P> R accept(InstructionVisitor<? extends R, ? super P> visitor, P parameter);
}
