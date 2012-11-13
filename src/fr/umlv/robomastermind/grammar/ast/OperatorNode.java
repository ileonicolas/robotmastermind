package fr.umlv.robomastermind.grammar.ast;

import java.util.Objects;

public class OperatorNode extends AbstractNode implements ExpressionNode {
	private final ExpressionNode left;
	private final ExpressionNode right;
	private final Kind kind;

	public enum Kind {
		NOT,
		OR,
		AND
	}

	public OperatorNode(Location location, ExpressionNode left, ExpressionNode right, Kind kind) {
		super(location);
		this.left = Objects.requireNonNull(left);
		this.right = right;
		this.kind = Objects.requireNonNull(kind);
	}

	public ExpressionNode getLeft() {
		return left;
	}
	public ExpressionNode getRight() {
		return right;
	}
	public Kind getKind() {
		return kind;
	}

	@Override
	public <R, P> R accept(ExpressionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitOperator(this, parameter);
	}
}
