package fr.umlv.robomastermind.grammar.ast;

public interface InstructionVisitor<R, P> {
	public R visitBreak(BreakNode node, P parameter);
	public R visitEnd(EndNode node, P parameter);
	public R visitIf(IfNode node, P parameter);
	public R visitRepeat(RepeatNode node, P parameter);
	public R visitRepeatWhile(RepeatWhileNode node, P parameter);
	public R visitFunctionCall(FunctionCallNode node, P parameter);
}
