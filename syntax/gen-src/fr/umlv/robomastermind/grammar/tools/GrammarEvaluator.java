package fr.umlv.robomastermind.grammar.tools;

import fr.umlv.robomastermind.grammar.ast.BlockNode;
import fr.umlv.robomastermind.grammar.ast.ExpressionNode;
import fr.umlv.robomastermind.grammar.ast.FunctionCallNode;
import fr.umlv.robomastermind.grammar.ast.InstructionNode;
import fr.umlv.robomastermind.grammar.ast.ItemNode;
import fr.umlv.robomastermind.grammar.ast.ProcedureNode;
import fr.umlv.robomastermind.grammar.ast.ScriptNode;
import fr.umlv.robomastermind.grammar.ast.Token;
import java.util.List;

/** 
 *  This class is generated - please do not edit it 
 */
public interface GrammarEvaluator {
  /** This methods is called after the reduction of the non terminal script
   *  by the grammar production script.
   *  <code>script ::= item_star_0</code>
   */
  public ScriptNode script(List<ItemNode> item_star);
  /** This methods is called after the reduction of the non terminal item
   *  by the grammar production item_instr.
   *  <code>item ::= instr</code>
   */
  public ItemNode item_instr(InstructionNode instr);
  /** This methods is called after the reduction of the non terminal item
   *  by the grammar production item_proc.
   *  <code>item ::= proc</code>
   */
  public ItemNode item_proc(ProcedureNode proc);
  /** This methods is called after the reduction of the non terminal proc
   *  by the grammar production proc.
   *  <code>proc ::= procedure id lpar id_star_1 rpar block</code>
   */
  public ProcedureNode proc(Token<String> id,List<Token<String>> id_star,BlockNode block);
  /** This methods is called after the reduction of the non terminal block
   *  by the grammar production block.
   *  <code>block ::= lcurl instr_star_2 rcurl</code>
   */
  public BlockNode block(Token<?> lcurl,List<InstructionNode> instr_star);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_funcall.
   *  <code>instr ::= funcall</code>
   */
  public InstructionNode instr_funcall(FunctionCallNode funcall);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_repeat.
   *  <code>instr ::= repeat lpar number_optional_3 rpar block</code>
   */
  public InstructionNode instr_repeat(Token<?> repeat,Token<Integer> number_optional,BlockNode block);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_repeat_while.
   *  <code>instr ::= repeatWhile lpar expr rpar block</code>
   */
  public InstructionNode instr_repeat_while(Token<?> repeatWhile,ExpressionNode expr,BlockNode block);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_break.
   *  <code>instr ::= _break</code>
   */
  public InstructionNode instr_break(Token<?> _break);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_if.
   *  <code>instr ::= _if lpar expr rpar block</code>
   */
  public InstructionNode instr_if(Token<?> _if,ExpressionNode expr,BlockNode block);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_if_else.
   *  <code>instr ::= _if lpar expr rpar block _else block</code>
   */
  public InstructionNode instr_if_else(Token<?> _if,ExpressionNode expr,BlockNode block,BlockNode block2);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_end.
   *  <code>instr ::= end</code>
   */
  public InstructionNode instr_end(Token<?> end);
  /** This methods is called after the reduction of the non terminal funcall
   *  by the grammar production funcall.
   *  <code>funcall ::= id lpar expr_star_4 rpar</code>
   */
  public FunctionCallNode funcall(Token<String> id,List<ExpressionNode> expr_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_number.
   *  <code>expr ::= number</code>
   */
  public ExpressionNode expr_number(Token<Integer> number);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_bool.
   *  <code>expr ::= bool</code>
   */
  public ExpressionNode expr_bool(Token<Boolean> bool);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_id.
   *  <code>expr ::= id</code>
   */
  public ExpressionNode expr_id(Token<String> id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_parens.
   *  <code>expr ::= lpar expr rpar</code>
   */
  public ExpressionNode expr_parens(ExpressionNode expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_not.
   *  <code>expr ::= not expr</code>
   */
  public ExpressionNode expr_not(ExpressionNode expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_and.
   *  <code>expr ::= expr and expr</code>
   */
  public ExpressionNode expr_and(ExpressionNode expr,ExpressionNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_or.
   *  <code>expr ::= expr or expr</code>
   */
  public ExpressionNode expr_or(ExpressionNode expr,ExpressionNode expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_funcall.
   *  <code>expr ::= funcall</code>
   */
  public ExpressionNode expr_funcall(FunctionCallNode funcall);

  public void acceptScript(ScriptNode script);
}
