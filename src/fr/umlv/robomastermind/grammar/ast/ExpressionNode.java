package fr.umlv.robomastermind.grammar.ast;

public interface ExpressionNode extends Node {
	public <R, P> R accept(ExpressionVisitor<? extends R, ? super P> visitor, P parameter);
}
