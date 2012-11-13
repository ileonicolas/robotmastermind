package fr.umlv.robomastermind.grammar.ast;

public class LiteralNode extends AbstractNode implements ExpressionNode {
	private final Object value;

	public LiteralNode(Location location, Object value) {
		super(location);
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public <R, P> R accept(ExpressionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitLiteral(this, parameter);
	}
}
