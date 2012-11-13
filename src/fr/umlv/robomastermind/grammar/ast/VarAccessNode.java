package fr.umlv.robomastermind.grammar.ast;

public class VarAccessNode extends AbstractNode implements ExpressionNode {
	private final String id;

	public VarAccessNode(Location location, String id) {
		super(location);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@Override
	public <R, P> R accept(ExpressionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitVarAccess(this, parameter);
	}
}
