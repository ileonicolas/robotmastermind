package fr.umlv.robomastermind.grammar.ast;

import java.util.List;

public class BlockNode extends AbstractNode {
	private final List<InstructionNode> instructions;

	public BlockNode(Location location, List<InstructionNode> instructions) {
		super(location);
		this.instructions = instructions;
	}

	public List<InstructionNode> getInstructions() {
		return instructions;
	}
}
