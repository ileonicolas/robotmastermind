package fr.umlv.robomastermind.grammar.ast;

import java.util.List;
import java.util.Objects;

public class ProcedureNode extends AbstractNode implements ItemNode {
	private final String name;
	private final List<String> parameters;
	private final BlockNode block;

	public ProcedureNode(Location position, String name, List<String> parameters, BlockNode block) {
		super(position);
		this.name = Objects.requireNonNull(name);
		this.parameters = Objects.requireNonNull(parameters);
		this.block = Objects.requireNonNull(block);
	}

	public String getName() {
		return name;
	}
	public List<String> getParameters() {
		return parameters;
	}
	public BlockNode getBlock() {
		return block;
	}
}
