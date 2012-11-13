package fr.umlv.robomastermind.grammar.ast;

import java.util.Objects;

public class RepeatWhileNode extends AbstractNode implements InstructionNode {
	private final ExpressionNode condition;
	private final BlockNode block;

	public RepeatWhileNode(Location location, ExpressionNode condition, BlockNode block) {
		super(location);
		this.condition = Objects.requireNonNull(condition);
		this.block = Objects.requireNonNull(block);
	}

	public ExpressionNode getCondition() {
		return condition;
	}
	public BlockNode getBlock() {
		return block;
	}

	@Override
	public <R, P> R accept(InstructionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitRepeatWhile(this, parameter);
	}
}
