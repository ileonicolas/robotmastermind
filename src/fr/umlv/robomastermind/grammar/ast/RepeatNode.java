package fr.umlv.robomastermind.grammar.ast;

import java.util.Objects;

public class RepeatNode extends AbstractNode implements InstructionNode {
	private final Integer count;
	private final BlockNode block;

	public RepeatNode(Location location, Integer count, BlockNode block) {
		super(location);
		this.count = count;
		this.block = Objects.requireNonNull(block);
	}

	public Integer getCount() {
		return count;
	}
	public BlockNode getBlock() {
		return block;
	}

	@Override
	public <R, P> R accept(InstructionVisitor<? extends R, ? super P> visitor, P parameter) {
		return visitor.visitRepeat(this, parameter);
	}
}
