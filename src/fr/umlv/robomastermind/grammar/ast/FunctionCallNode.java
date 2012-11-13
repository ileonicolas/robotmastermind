package fr.umlv.robomastermind.grammar.ast;

import java.util.List;
import java.util.Objects;

public class FunctionCallNode extends AbstractNode implements ExpressionNode, InstructionNode {
	private final String name;
	private final List<ExpressionNode> arguments;

	public FunctionCallNode(Location location, String name, List<ExpressionNode> arguments) {
		super(location);
		this.name = Objects.requireNonNull(name);
		this.arguments = Objects.requireNonNull(arguments);
	}

	public String getName() {
		return name;
	}
	public List<ExpressionNode> getArguments() {
		return arguments;
	}

	@Override
	public <R, P> R accept(ExpressionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitFunctionCall(this, parameter);
	}

	@Override
	public <R, P> R accept(InstructionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitFunctionCall(this, parameter);
	}
}
