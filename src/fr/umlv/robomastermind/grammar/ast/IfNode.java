package fr.umlv.robomastermind.grammar.ast;

import java.util.Objects;

public class IfNode extends AbstractNode implements InstructionNode {
	private final ExpressionNode condition;
	private final BlockNode ifBlock;
	private final BlockNode elseBlock;

	public IfNode(Location location, ExpressionNode condition, BlockNode ifBlock, BlockNode elseBlock) {
		super(location);
		this.condition = Objects.requireNonNull(condition);
		this.ifBlock = Objects.requireNonNull(ifBlock);
		this.elseBlock = elseBlock;
	}

	public ExpressionNode getCondition() {
		return condition;
	}
	public BlockNode getIfBlock() {
		return ifBlock;
	}
	public BlockNode getElseBlock() {
		return elseBlock;
	}

	@Override
	public <R, P> R accept(InstructionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitIf(this, parameter);
	}
}
