package fr.umlv.robomastermind.grammar.ast;

public interface ExpressionVisitor<R, P> {
	public R visitLiteral(LiteralNode node, P parameter);
	public R visitOperator(OperatorNode node, P parameter);
	public R visitVarAccess(VarAccessNode node, P parameter);
	public R visitFunctionCall(FunctionCallNode node, P parameter);
}
