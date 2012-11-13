package fr.umlv.robomastermind.grammar.ast;

import java.util.List;
import java.util.Objects;

public class ScriptNode {
	private final List<InstructionNode> instructions;
	private final List<ProcedureNode> procedures;

	public ScriptNode(List<InstructionNode> instructions, List<ProcedureNode> procedures) {
		this.instructions = Objects.requireNonNull(instructions);
		this.procedures = Objects.requireNonNull(procedures);
	}

	public List<InstructionNode> getInstructions() {
		return instructions;
	}
	public List<ProcedureNode> getProcedures() {
		return procedures;
	}
}
