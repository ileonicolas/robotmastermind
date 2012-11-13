package fr.umlv.robomastermind.grammar.lexer;

import fr.umlv.robomastermind.grammar.lexer.RuleEnum;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.lexer.rules.RuleData;
import fr.umlv.tatoo.runtime.regex.CharRegexTable;
import java.util.EnumMap;
/** 
 *  This class is generated - please do not edit it 
 */
public class LexerDataTable {

  public static LexerTable<RuleEnum> createTable() {
    return new LexerDataTable().table;
  }

  private LexerDataTable() {
    initlparMainAccepts();
    initlparMainTransitions();
    CharRegexTable lparMain = new CharRegexTable(1, lparMainTransitions, lparMainAccepts);
    RuleData lpar = new RuleData(lparMain, null, 0, false);
    initrparMainAccepts();
    initrparMainTransitions();
    CharRegexTable rparMain = new CharRegexTable(1, rparMainTransitions, rparMainAccepts);
    RuleData rpar = new RuleData(rparMain, null, 1, false);
    initlcurlMainAccepts();
    initlcurlMainTransitions();
    CharRegexTable lcurlMain = new CharRegexTable(1, lcurlMainTransitions, lcurlMainAccepts);
    RuleData lcurl = new RuleData(lcurlMain, null, 2, false);
    initrcurlMainAccepts();
    initrcurlMainTransitions();
    CharRegexTable rcurlMain = new CharRegexTable(1, rcurlMainTransitions, rcurlMainAccepts);
    RuleData rcurl = new RuleData(rcurlMain, null, 3, false);
    initnotMainAccepts();
    initnotMainTransitions();
    CharRegexTable notMain = new CharRegexTable(1, notMainTransitions, notMainAccepts);
    RuleData not = new RuleData(notMain, null, 4, false);
    initandMainAccepts();
    initandMainTransitions();
    CharRegexTable andMain = new CharRegexTable(3, andMainTransitions, andMainAccepts);
    RuleData and = new RuleData(andMain, null, 5, false);
    initorMainAccepts();
    initorMainTransitions();
    CharRegexTable orMain = new CharRegexTable(1, orMainTransitions, orMainAccepts);
    RuleData or = new RuleData(orMain, null, 6, false);
    initcommaMainAccepts();
    initcommaMainTransitions();
    CharRegexTable commaMain = new CharRegexTable(0, commaMainTransitions, commaMainAccepts);
    RuleData comma = new RuleData(commaMain, null, 7, false);
    initprocedureMainAccepts();
    initprocedureMainTransitions();
    CharRegexTable procedureMain = new CharRegexTable(3, procedureMainTransitions, procedureMainAccepts);
    RuleData procedure = new RuleData(procedureMain, null, 8, false);
    init_ifMainAccepts();
    init_ifMainTransitions();
    CharRegexTable _ifMain = new CharRegexTable(0, _ifMainTransitions, _ifMainAccepts);
    RuleData _if = new RuleData(_ifMain, null, 9, false);
    init_elseMainAccepts();
    init_elseMainTransitions();
    CharRegexTable _elseMain = new CharRegexTable(4, _elseMainTransitions, _elseMainAccepts);
    RuleData _else = new RuleData(_elseMain, null, 10, false);
    initrepeatMainAccepts();
    initrepeatMainTransitions();
    CharRegexTable repeatMain = new CharRegexTable(4, repeatMainTransitions, repeatMainAccepts);
    RuleData repeat = new RuleData(repeatMain, null, 11, false);
    initrepeatWhileMainAccepts();
    initrepeatWhileMainTransitions();
    CharRegexTable repeatWhileMain = new CharRegexTable(10, repeatWhileMainTransitions, repeatWhileMainAccepts);
    RuleData repeatWhile = new RuleData(repeatWhileMain, null, 12, false);
    init_breakMainAccepts();
    init_breakMainTransitions();
    CharRegexTable _breakMain = new CharRegexTable(5, _breakMainTransitions, _breakMainAccepts);
    RuleData _break = new RuleData(_breakMain, null, 13, false);
    initendMainAccepts();
    initendMainTransitions();
    CharRegexTable endMain = new CharRegexTable(1, endMainTransitions, endMainAccepts);
    RuleData end = new RuleData(endMain, null, 14, false);
    initidMainAccepts();
    initidMainTransitions();
    CharRegexTable idMain = new CharRegexTable(1, idMainTransitions, idMainAccepts);
    RuleData id = new RuleData(idMain, null, 15, false);
    initnumberMainAccepts();
    initnumberMainTransitions();
    CharRegexTable numberMain = new CharRegexTable(1, numberMainTransitions, numberMainAccepts);
    RuleData number = new RuleData(numberMain, null, 16, false);
    initboolMainAccepts();
    initboolMainTransitions();
    CharRegexTable boolMain = new CharRegexTable(6, boolMainTransitions, boolMainAccepts);
    RuleData bool = new RuleData(boolMain, null, 17, false);
    initspaceMainAccepts();
    initspaceMainTransitions();
    CharRegexTable spaceMain = new CharRegexTable(0, spaceMainTransitions, spaceMainAccepts);
    RuleData space = new RuleData(spaceMain, null, 18, false);
    initcommentMainAccepts();
    initcommentMainTransitions();
    CharRegexTable commentMain = new CharRegexTable(2, commentMainTransitions, commentMainAccepts);
    RuleData comment = new RuleData(commentMain, null, 19, false);

    EnumMap<RuleEnum,RuleData> datas = new EnumMap<RuleEnum,RuleData>(RuleEnum.class);
    datas.put(RuleEnum.lpar, lpar);
    datas.put(RuleEnum.rpar, rpar);
    datas.put(RuleEnum.lcurl, lcurl);
    datas.put(RuleEnum.rcurl, rcurl);
    datas.put(RuleEnum.not, not);
    datas.put(RuleEnum.and, and);
    datas.put(RuleEnum.or, or);
    datas.put(RuleEnum.comma, comma);
    datas.put(RuleEnum.procedure, procedure);
    datas.put(RuleEnum._if, _if);
    datas.put(RuleEnum._else, _else);
    datas.put(RuleEnum.repeat, repeat);
    datas.put(RuleEnum.repeatWhile, repeatWhile);
    datas.put(RuleEnum._break, _break);
    datas.put(RuleEnum.end, end);
    datas.put(RuleEnum.id, id);
    datas.put(RuleEnum.number, number);
    datas.put(RuleEnum.bool, bool);
    datas.put(RuleEnum.space, space);
    datas.put(RuleEnum.comment, comment);
    table = new LexerTable<RuleEnum>(datas);
  }

  
  private boolean[] lparMainAccepts;
  private void initlparMainAccepts() {
    lparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lparMainTransitions;
  private void initlparMainTransitions() {
    lparMainTransitions = new int[][] {{0,-1},{0,-1,40,0,41,-1}};
  }
  
  private boolean[] rparMainAccepts;
  private void initrparMainAccepts() {
    rparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rparMainTransitions;
  private void initrparMainTransitions() {
    rparMainTransitions = new int[][] {{0,-1},{0,-1,41,0,42,-1}};
  }
  
  private boolean[] lcurlMainAccepts;
  private void initlcurlMainAccepts() {
    lcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lcurlMainTransitions;
  private void initlcurlMainTransitions() {
    lcurlMainTransitions = new int[][] {{0,-1},{0,-1,123,0,124,-1}};
  }
  
  private boolean[] rcurlMainAccepts;
  private void initrcurlMainAccepts() {
    rcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rcurlMainTransitions;
  private void initrcurlMainTransitions() {
    rcurlMainTransitions = new int[][] {{0,-1},{0,-1,125,0,126,-1}};
  }
  
  private boolean[] notMainAccepts;
  private void initnotMainAccepts() {
    notMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] notMainTransitions;
  private void initnotMainTransitions() {
    notMainTransitions = new int[][] {{0,-1},{0,-1,126,0,127,-1}};
  }
  
  private boolean[] andMainAccepts;
  private void initandMainAccepts() {
    andMainAccepts = new boolean[] {false,false,true,false};
  }
    
  private int[][] andMainTransitions;
  private void initandMainTransitions() {
    andMainTransitions = new int[][] {{0,-1,100,2,101,-1},{0,-1,110,0,111,-1},{0,-1},{0,-1,38,2,39,-1,97,1,98,-1}};
  }
  
  private boolean[] orMainAccepts;
  private void initorMainAccepts() {
    orMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] orMainTransitions;
  private void initorMainTransitions() {
    orMainTransitions = new int[][] {{0,-1},{0,-1,111,2,112,-1,124,0,125,-1},{0,-1,114,0,115,-1}};
  }
  
  private boolean[] commaMainAccepts;
  private void initcommaMainAccepts() {
    commaMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] commaMainTransitions;
  private void initcommaMainTransitions() {
    commaMainTransitions = new int[][] {{0,-1,44,1,45,-1},{0,-1}};
  }
  
  private boolean[] procedureMainAccepts;
  private void initprocedureMainAccepts() {
    procedureMainAccepts = new boolean[] {false,false,true,false,false,false,false,false,false,false};
  }
    
  private int[][] procedureMainTransitions;
  private void initprocedureMainTransitions() {
    procedureMainTransitions = new int[][] {{0,-1,100,9,101,-1},{0,-1,101,2,102,-1},{0,-1},{0,-1,112,4,113,-1},{0,-1,114,6,115,-1},{0,-1,114,1,115,-1},{0,-1,111,8,112,-1},{0,-1,101,0,102,-1},{0,-1,99,7,100,-1},{0,-1,117,5,118,-1}};
  }
  
  private boolean[] _ifMainAccepts;
  private void init_ifMainAccepts() {
    _ifMainAccepts = new boolean[] {false,true,false};
  }
    
  private int[][] _ifMainTransitions;
  private void init_ifMainTransitions() {
    _ifMainTransitions = new int[][] {{0,-1,105,2,106,-1},{0,-1},{0,-1,102,1,103,-1}};
  }
  
  private boolean[] _elseMainAccepts;
  private void init_elseMainAccepts() {
    _elseMainAccepts = new boolean[] {false,true,false,false,false};
  }
    
  private int[][] _elseMainTransitions;
  private void init_elseMainTransitions() {
    _elseMainTransitions = new int[][] {{0,-1,101,1,102,-1},{0,-1},{0,-1,108,3,109,-1},{0,-1,115,0,116,-1},{0,-1,101,2,102,-1}};
  }
  
  private boolean[] repeatMainAccepts;
  private void initrepeatMainAccepts() {
    repeatMainAccepts = new boolean[] {false,true,false,false,false,false,false};
  }
    
  private int[][] repeatMainTransitions;
  private void initrepeatMainTransitions() {
    repeatMainTransitions = new int[][] {{0,-1,112,2,113,-1},{0,-1},{0,-1,101,3,102,-1},{0,-1,97,6,98,-1},{0,-1,114,5,115,-1},{0,-1,101,0,102,-1},{0,-1,116,1,117,-1}};
  }
  
  private boolean[] repeatWhileMainAccepts;
  private void initrepeatWhileMainAccepts() {
    repeatWhileMainAccepts = new boolean[] {false,false,true,false,false,false,false,false,false,false,false,false};
  }
    
  private int[][] repeatWhileMainTransitions;
  private void initrepeatWhileMainTransitions() {
    repeatWhileMainTransitions = new int[][] {{0,-1,104,9,105,-1},{0,-1,87,0,88,-1},{0,-1},{0,-1,112,4,113,-1},{0,-1,101,11,102,-1},{0,-1,101,3,102,-1},{0,-1,116,1,117,-1},{0,-1,108,8,109,-1},{0,-1,101,2,102,-1},{0,-1,105,7,106,-1},{0,-1,114,5,115,-1},{0,-1,97,6,98,-1}};
  }
  
  private boolean[] _breakMainAccepts;
  private void init_breakMainAccepts() {
    _breakMainAccepts = new boolean[] {false,false,true,false,false,false};
  }
    
  private int[][] _breakMainTransitions;
  private void init_breakMainTransitions() {
    _breakMainTransitions = new int[][] {{0,-1,107,2,108,-1},{0,-1,97,0,98,-1},{0,-1},{0,-1,101,1,102,-1},{0,-1,114,3,115,-1},{0,-1,98,4,99,-1}};
  }
  
  private boolean[] endMainAccepts;
  private void initendMainAccepts() {
    endMainAccepts = new boolean[] {false,false,false,true};
  }
    
  private int[][] endMainTransitions;
  private void initendMainTransitions() {
    endMainTransitions = new int[][] {{0,-1,100,3,101,-1},{0,-1,101,2,102,-1},{0,-1,110,0,111,-1},{0,-1}};
  }
  
  private boolean[] idMainAccepts;
  private void initidMainAccepts() {
    idMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] idMainTransitions;
  private void initidMainTransitions() {
    idMainTransitions = new int[][] {{0,-1,48,0,58,-1,65,0,91,-1,95,0,96,-1,97,0,123,-1},{0,-1,65,0,91,-1,95,0,96,-1,97,0,123,-1}};
  }
  
  private boolean[] numberMainAccepts;
  private void initnumberMainAccepts() {
    numberMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] numberMainTransitions;
  private void initnumberMainTransitions() {
    numberMainTransitions = new int[][] {{0,-1,48,0,58,-1},{0,-1,48,0,58,-1}};
  }
  
  private boolean[] boolMainAccepts;
  private void initboolMainAccepts() {
    boolMainAccepts = new boolean[] {false,false,false,false,false,false,false,true};
  }
    
  private int[][] boolMainTransitions;
  private void initboolMainTransitions() {
    boolMainTransitions = new int[][] {{0,-1,108,4,109,-1},{0,-1,97,0,98,-1},{0,-1,114,5,115,-1},{0,-1,101,7,102,-1},{0,-1,115,3,116,-1},{0,-1,117,3,118,-1},{0,-1,102,1,103,-1,116,2,117,-1},{0,-1}};
  }
  
  private boolean[] spaceMainAccepts;
  private void initspaceMainAccepts() {
    spaceMainAccepts = new boolean[] {false,true};
  }
    
  private int[][] spaceMainTransitions;
  private void initspaceMainTransitions() {
    spaceMainTransitions = new int[][] {{0,-1,9,1,11,-1,13,1,14,-1,32,1,33,-1},{0,-1,9,1,11,-1,13,1,14,-1,32,1,33,-1}};
  }
  
  private boolean[] commentMainAccepts;
  private void initcommentMainAccepts() {
    commentMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] commentMainTransitions;
  private void initcommentMainTransitions() {
    commentMainTransitions = new int[][] {{0,-1},{0,-1,10,0,11,-1},{0,-1,35,3,36,-1},{0,3,10,0,11,3,13,1,14,3}};
  }
  
  private final LexerTable<RuleEnum> table;
}
