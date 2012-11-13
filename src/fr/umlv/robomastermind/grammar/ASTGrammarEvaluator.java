package fr.umlv.robomastermind.grammar;

import java.util.ArrayList;
import java.util.List;

import fr.umlv.robomastermind.grammar.ast.BlockNode;
import fr.umlv.robomastermind.grammar.ast.BreakNode;
import fr.umlv.robomastermind.grammar.ast.EndNode;
import fr.umlv.robomastermind.grammar.ast.ExpressionNode;
import fr.umlv.robomastermind.grammar.ast.FunctionCallNode;
import fr.umlv.robomastermind.grammar.ast.IfNode;
import fr.umlv.robomastermind.grammar.ast.InstructionNode;
import fr.umlv.robomastermind.grammar.ast.ItemNode;
import fr.umlv.robomastermind.grammar.ast.LiteralNode;
import fr.umlv.robomastermind.grammar.ast.OperatorNode;
import fr.umlv.robomastermind.grammar.ast.ProcedureNode;
import fr.umlv.robomastermind.grammar.ast.RepeatNode;
import fr.umlv.robomastermind.grammar.ast.RepeatWhileNode;
import fr.umlv.robomastermind.grammar.ast.ScriptNode;
import fr.umlv.robomastermind.grammar.ast.Token;
import fr.umlv.robomastermind.grammar.ast.VarAccessNode;
import fr.umlv.robomastermind.grammar.ast.OperatorNode.Kind;
import fr.umlv.robomastermind.grammar.tools.GrammarEvaluator;

import static java.util.Collections.*;

class ASTGrammarEvaluator implements GrammarEvaluator {
	private ScriptNode script;

	public ScriptNode getScript() {
		return script;
	}


	// --- script

	@Override
	public void acceptScript(ScriptNode script) {
		this.script = script;
	}

	@Override
	public ScriptNode script(List<ItemNode> item_star) {
		ArrayList<InstructionNode> instructions = new ArrayList<>();
		ArrayList<ProcedureNode> procedures = new ArrayList<>();
		for(ItemNode item: item_star) {
			if (item instanceof ProcedureNode) {
				procedures.add((ProcedureNode)item);
			} else {
				instructions.add((InstructionNode)item);
			}
		}
		return new ScriptNode(unmodifiableList(instructions), unmodifiableList(procedures));
	}

	@Override
	public ItemNode item_instr(InstructionNode instr) {
		return instr;
	}
	@Override
	public ItemNode item_proc(ProcedureNode proc) {
		return proc;
	}


	// --- procedure

	@Override
	public ProcedureNode proc(Token<String> id, java.util.List<Token<String>> id_star, BlockNode block) {
		ArrayList<String> parameters = new ArrayList<>();
		for(Token<String> token: id_star) {
			parameters.add(token.getValue());
		}
		return new ProcedureNode(id.getSourceLocation(), id.getValue(), unmodifiableList(parameters), block);
	}


	// --- instructions

	@Override
	public InstructionNode instr_repeat(Token<?> repeat, Token<Integer> number_optional, BlockNode block) {
		Integer count = (number_optional == null)? null: number_optional.getValue(); 
		return new RepeatNode(repeat.getSourceLocation(), count, block);
	}
	@Override
	public InstructionNode instr_repeat_while(Token<?> repeatWhile, ExpressionNode expr, BlockNode block) {
		return new RepeatWhileNode(repeatWhile.getSourceLocation(), expr, block);
	}
	@Override
	public InstructionNode instr_break(Token<?> _break) {
		return new BreakNode(_break.getSourceLocation());
	}

	@Override
	public InstructionNode instr_if(Token<?> _if, ExpressionNode expr, BlockNode block) {
		return new IfNode(_if.getSourceLocation(), expr, block, null);
	}
	@Override
	public InstructionNode instr_if_else(Token<?> _if, ExpressionNode expr, BlockNode block, BlockNode block2) {
		return new IfNode(_if.getSourceLocation(), expr, block, block2);
	}

	@Override
	public InstructionNode instr_end(Token<?> end) {
		return new EndNode(end.getSourceLocation());
	}

	@Override
	public InstructionNode instr_funcall(FunctionCallNode funcall) {
		return funcall;
	}



	// --- function call

	@Override
	public FunctionCallNode funcall(Token<String> id, List<ExpressionNode> expr_star) {
		return new FunctionCallNode(id.getSourceLocation(), id.getValue(), expr_star);
	}

	@Override
	public BlockNode block(Token<?> lcurl, List<InstructionNode> instr_star) {
		return new BlockNode(lcurl.getSourceLocation(), instr_star);
	}


	// --- expressions

	@Override
	public ExpressionNode expr_bool(Token<Boolean> bool) {
		return new LiteralNode(bool.getSourceLocation(), bool.getValue());
	}
	@Override
	public ExpressionNode expr_number(Token<Integer> number) {
		return new LiteralNode(number.getSourceLocation(), number.getValue());
	}

	@Override
	public ExpressionNode expr_id(Token<String> id) {
		return new VarAccessNode(id.getSourceLocation(), id.getValue());
	}

	@Override
	public ExpressionNode expr_parens(ExpressionNode expr) {
		return expr;
	}

	@Override
	public ExpressionNode expr_not(ExpressionNode expr) {
		return new OperatorNode(expr.getSourceLocation(), expr, null, Kind.NOT);
	}
	@Override
	public ExpressionNode expr_and(ExpressionNode expr, ExpressionNode expr2) {
		return new OperatorNode(expr.getSourceLocation(), expr, expr2, Kind.AND);
	}
	@Override
	public ExpressionNode expr_or(ExpressionNode expr, ExpressionNode expr2) {
		return new OperatorNode(expr.getSourceLocation(), expr, expr2, Kind.OR);
	}

	@Override
	public ExpressionNode expr_funcall(FunctionCallNode funcall) {
		return funcall;
	}
}
