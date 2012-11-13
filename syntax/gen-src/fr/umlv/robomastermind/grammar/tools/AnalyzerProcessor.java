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
  
import fr.umlv.robomastermind.grammar.lexer.RuleEnum;
import fr.umlv.robomastermind.grammar.parser.TerminalEnum;
import fr.umlv.robomastermind.grammar.parser.NonTerminalEnum;
import fr.umlv.robomastermind.grammar.parser.ProductionEnum;
import fr.umlv.robomastermind.grammar.tools.TerminalEvaluator;
import fr.umlv.robomastermind.grammar.tools.GrammarEvaluator;

import fr.umlv.tatoo.runtime.buffer.LexerBuffer;
import fr.umlv.tatoo.runtime.tools.AnalyzerListener;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.SemanticStack;

/**  This class is called by the parser when
 *  <ol>
 *    <li>a terminal is shifted</li>
 *    <li>a non terminal is reduced</li>
 *    <li>a non terminal is accepted</li>
 *   </ol>
 *   In that case, depending on the information of the .xtls, terminal and non-terminal
 *   values are pushed/pop from a semantic stack.
 *   
 *   Furthermore, in case of error recovery, values of the stack can be pop out
 *   depending if the last recognized element is a terminal or a non-terminal.
 * 
 *  This class is generated - please do not edit it 
 */
public class AnalyzerProcessor<B extends LexerBuffer,D>
  implements AnalyzerListener<RuleEnum,B,TerminalEnum,NonTerminalEnum,ProductionEnum> {
          
  private final GrammarEvaluator grammarEvaluator;
  private final TerminalEvaluator<? super D> terminalEvaluator;
  private final DataViewer<? super B,? extends D> dataViewer;
  private final SemanticStack stack;
  
  protected AnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    this.terminalEvaluator=terminalEvaluator;
    this.grammarEvaluator=grammarEvaluator;
    this.dataViewer=dataViewer;
    this.stack=stack;
  }
  
  /** Creates a tools listener that redirect accept/shift/reduce and comment to the terminal Evaluator
      and the grammar evaluator..
      This constructor allows to share the same stack between more
      than one parser processor.
      @param terminalEvaluator the terminal evaluator.
      @param grammarEvaluator the grammar evaluator.
      @param stack the stack used by the processor
   */
  public static <B extends LexerBuffer,D> AnalyzerProcessor<B,D>
    createAnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    
    return new AnalyzerProcessor<B,D>(terminalEvaluator,grammarEvaluator,dataViewer,stack);
  }
  
  public void comment(RuleEnum rule, B buffer) {
    D data;
    switch(rule) {           case comment:
            data=dataViewer.view(buffer);
            terminalEvaluator.comment(data);
            return;
              default:
    }
    throw new AssertionError("unknown rule "+rule);
  }
 
   public void shift(TerminalEnum terminal, RuleEnum rule, B buffer) {
     D data;
     switch(terminal) {      case lpar: {
                       return;
           }
                 case rpar: {
                       return;
           }
                 case lcurl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<?> lcurl=terminalEvaluator.lcurl(data);
                                      stack.push_Object(lcurl);
                                 return;
           }
                 case rcurl: {
                       return;
           }
                 case not: {
                       return;
           }
                 case and: {
                       return;
           }
                 case or: {
                       return;
           }
                 case comma: {
                       return;
           }
                 case procedure: {
                       return;
           }
                 case _if: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<?> _if=terminalEvaluator._if(data);
                                      stack.push_Object(_if);
                                 return;
           }
                 case _else: {
                       return;
           }
                 case repeat: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<?> repeat=terminalEvaluator.repeat(data);
                                      stack.push_Object(repeat);
                                 return;
           }
                 case repeatWhile: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<?> repeatWhile=terminalEvaluator.repeatWhile(data);
                                      stack.push_Object(repeatWhile);
                                 return;
           }
                 case _break: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<?> _break=terminalEvaluator._break(data);
                                      stack.push_Object(_break);
                                 return;
           }
                 case end: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<?> end=terminalEvaluator.end(data);
                                      stack.push_Object(end);
                                 return;
           }
                 case id: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<String> id=terminalEvaluator.id(data);
                                      stack.push_Object(id);
                                 return;
           }
                 case number: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<Integer> number=terminalEvaluator.number(data);
                                      stack.push_Object(number);
                                 return;
           }
                 case bool: {
         data=dataViewer.view(buffer);
                                  fr.umlv.robomastermind.grammar.ast.Token<Boolean> bool=terminalEvaluator.bool(data);
                                      stack.push_Object(bool);
                                 return;
           }
                 case __eof__: {
                       return;
           }
                 }
     throw new AssertionError("unknown terminal "+terminal);
   }
    
    
    @SuppressWarnings("unchecked")
    public void reduce(ProductionEnum production) {
      switch(production) {           case item_star_0_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case item_star_0_rec: { // STAR_RECURSIVE_LEFT
                            
                    ItemNode item=(ItemNode)stack.pop_Object();
                    List<ItemNode> item_star_0=(List<ItemNode>)stack.pop_Object();
                     item_star_0.add(item);
                     stack.push_Object(item_star_0);
                       
          }
          return;
                    case script: { // not synthetic
                                 List<ItemNode> item_star_0=(List<ItemNode>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.script(item_star_0));
                      
          }
          return;
                    case item_instr: { // not synthetic
                                 InstructionNode instr=(InstructionNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.item_instr(instr));
                      
          }
          return;
                    case item_proc: { // not synthetic
                                 ProcedureNode proc=(ProcedureNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.item_proc(proc));
                      
          }
          return;
                    case id_star_1_element: { // STAR_SINGLETON
                             java.util.ArrayList<Token<String>> list=
                     new java.util.ArrayList<Token<String>>();
                   list.add((Token<String>)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case id_star_1_rec: { // STAR_RECURSIVE_LEFT
                            
                    Token<String> id=(Token<String>)stack.pop_Object();
                    List<Token<String>> id_star_1_sub=(List<Token<String>>)stack.pop_Object();
                     id_star_1_sub.add(id);
                     stack.push_Object(id_star_1_sub);
                       
          }
          return;
                    case id_star_1_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case id_star_1_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case proc: { // not synthetic
                                 BlockNode block=(BlockNode)stack.pop_Object();
                                          List<Token<String>> id_star_1=(List<Token<String>>)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.proc(id,id_star_1,block));
                      
          }
          return;
                    case instr_star_2_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case instr_star_2_rec: { // STAR_RECURSIVE_LEFT
                            
                    InstructionNode instr=(InstructionNode)stack.pop_Object();
                    List<InstructionNode> instr_star_2=(List<InstructionNode>)stack.pop_Object();
                     instr_star_2.add(instr);
                     stack.push_Object(instr_star_2);
                       
          }
          return;
                    case block: { // not synthetic
                                 List<InstructionNode> instr_star_2=(List<InstructionNode>)stack.pop_Object();
                                          Token<?> lcurl=(Token<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.block(lcurl,instr_star_2));
                      
          }
          return;
                    case instr_funcall: { // not synthetic
                                 FunctionCallNode funcall=(FunctionCallNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_funcall(funcall));
                      
          }
          return;
                    case number_optional_3_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case number_optional_3_number: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case instr_repeat: { // not synthetic
                                 BlockNode block=(BlockNode)stack.pop_Object();
                                          Token<Integer> number_optional_3=(Token<Integer>)stack.pop_Object();
                                          Token<?> repeat=(Token<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_repeat(repeat,number_optional_3,block));
                      
          }
          return;
                    case instr_repeat_while: { // not synthetic
                                 BlockNode block=(BlockNode)stack.pop_Object();
                                          ExpressionNode expr=(ExpressionNode)stack.pop_Object();
                                          Token<?> repeatWhile=(Token<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_repeat_while(repeatWhile,expr,block));
                      
          }
          return;
                    case instr_break: { // not synthetic
                                 Token<?> _break=(Token<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_break(_break));
                      
          }
          return;
                    case instr_if: { // not synthetic
                                 BlockNode block=(BlockNode)stack.pop_Object();
                                          ExpressionNode expr=(ExpressionNode)stack.pop_Object();
                                          Token<?> _if=(Token<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_if(_if,expr,block));
                      
          }
          return;
                    case instr_if_else: { // not synthetic
                                 BlockNode block2=(BlockNode)stack.pop_Object();
                                          BlockNode block=(BlockNode)stack.pop_Object();
                                          ExpressionNode expr=(ExpressionNode)stack.pop_Object();
                                          Token<?> _if=(Token<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_if_else(_if,expr,block,block2));
                      
          }
          return;
                    case instr_end: { // not synthetic
                                 Token<?> end=(Token<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_end(end));
                      
          }
          return;
                    case expr_star_4_element: { // STAR_SINGLETON
                             java.util.ArrayList<ExpressionNode> list=
                     new java.util.ArrayList<ExpressionNode>();
                   list.add((ExpressionNode)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_4_rec: { // STAR_RECURSIVE_LEFT
                            
                    ExpressionNode expr=(ExpressionNode)stack.pop_Object();
                    List<ExpressionNode> expr_star_4_sub=(List<ExpressionNode>)stack.pop_Object();
                     expr_star_4_sub.add(expr);
                     stack.push_Object(expr_star_4_sub);
                       
          }
          return;
                    case expr_star_4_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_4_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case funcall: { // not synthetic
                                 List<ExpressionNode> expr_star_4=(List<ExpressionNode>)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.funcall(id,expr_star_4));
                      
          }
          return;
                    case expr_number: { // not synthetic
                                 Token<Integer> number=(Token<Integer>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_number(number));
                      
          }
          return;
                    case expr_bool: { // not synthetic
                                 Token<Boolean> bool=(Token<Boolean>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_bool(bool));
                      
          }
          return;
                    case expr_id: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_id(id));
                      
          }
          return;
                    case expr_parens: { // not synthetic
                                 ExpressionNode expr=(ExpressionNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_parens(expr));
                      
          }
          return;
                    case expr_not: { // not synthetic
                                 ExpressionNode expr=(ExpressionNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_not(expr));
                      
          }
          return;
                    case expr_and: { // not synthetic
                                 ExpressionNode expr2=(ExpressionNode)stack.pop_Object();
                                          ExpressionNode expr=(ExpressionNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_and(expr,expr2));
                      
          }
          return;
                    case expr_or: { // not synthetic
                                 ExpressionNode expr2=(ExpressionNode)stack.pop_Object();
                                          ExpressionNode expr=(ExpressionNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_or(expr,expr2));
                      
          }
          return;
                    case expr_funcall: { // not synthetic
                                 FunctionCallNode funcall=(FunctionCallNode)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_funcall(funcall));
                      
          }
          return;
                    default:
             throw new AssertionError("unknown production "+production);
       }
    }

     public void accept(NonTerminalEnum nonterminal) {
       switch(nonterminal) {            case script:
             grammarEvaluator.acceptScript((ScriptNode)stack.pop_Object());
             return;
                     default:
       }
        throw new AssertionError("unknown start nonterminal "+nonterminal);
     }

      public void popTerminalOnError(TerminalEnum terminal) {
        switch(terminal) {             case lpar:
              
              return;
                         case rpar:
              
              return;
                         case lcurl:
              stack.pop_Object();
              return;
                         case rcurl:
              
              return;
                         case not:
              
              return;
                         case and:
              
              return;
                         case or:
              
              return;
                         case comma:
              
              return;
                         case procedure:
              
              return;
                         case _if:
              stack.pop_Object();
              return;
                         case _else:
              
              return;
                         case repeat:
              stack.pop_Object();
              return;
                         case repeatWhile:
              stack.pop_Object();
              return;
                         case _break:
              stack.pop_Object();
              return;
                         case end:
              stack.pop_Object();
              return;
                         case id:
              stack.pop_Object();
              return;
                         case number:
              stack.pop_Object();
              return;
                         case bool:
              stack.pop_Object();
              return;
                         case __eof__:
              
              return;
                     }
        throw new AssertionError("unknown terminal "+terminal);
      }
 
      public void popNonTerminalOnError(NonTerminalEnum nonTerminal) {
        switch(nonTerminal) {             case script:
              stack.pop_Object();
              return;
                         case item:
              stack.pop_Object();
              return;
                         case proc:
              stack.pop_Object();
              return;
                         case block:
              stack.pop_Object();
              return;
                         case instr:
              stack.pop_Object();
              return;
                         case funcall:
              stack.pop_Object();
              return;
                         case expr:
              stack.pop_Object();
              return;
                         case item_star_0:
              stack.pop_Object();
              return;
                         case id_star_1:
              stack.pop_Object();
              return;
                         case id_star_1_sub:
              stack.pop_Object();
              return;
                         case instr_star_2:
              stack.pop_Object();
              return;
                         case number_optional_3:
              stack.pop_Object();
              return;
                         case expr_star_4:
              stack.pop_Object();
              return;
                         case expr_star_4_sub:
              stack.pop_Object();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}