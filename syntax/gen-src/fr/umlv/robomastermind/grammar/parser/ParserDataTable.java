package fr.umlv.robomastermind.grammar.parser;

import fr.umlv.robomastermind.grammar.parser.NonTerminalEnum;
import fr.umlv.robomastermind.grammar.parser.ProductionEnum;
import fr.umlv.robomastermind.grammar.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.BranchAction;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ExitAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

/** 
 *  This class is generated - please do not edit it 
 */
public class ParserDataTable {
  private ParserDataTable() {
   accept = AcceptAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
   exit = ExitAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
    initprocGotoes();
    initnumber_optional_3Gotoes();
    inititemGotoes();
    initexprGotoes();
    initinstr_star_2Gotoes();
    initid_star_1Gotoes();
    initexpr_star_4_subGotoes();
    initscriptGotoes();
    initinstrGotoes();
    initexpr_star_4Gotoes();
    initid_star_1_subGotoes();
    initfuncallGotoes();
    inititem_star_0Gotoes();
    initblockGotoes();
    reduceitem_star_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.item_star_0_empty,0,item_star_0Gotoes);
    reduceinstr_end = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_end,1,instrGotoes);
    reducenumber_optional_3_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.number_optional_3_empty,0,number_optional_3Gotoes);
    reduceitem_proc = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.item_proc,1,itemGotoes);
    reduceexpr_star_4_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_empty,0,expr_star_4Gotoes);
    reduceblock = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block,3,blockGotoes);
    reduceinstr_break = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_break,1,instrGotoes);
    reduceid_star_1_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_1_rec,3,id_star_1_subGotoes);
    reduceid_star_1_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_1_through,1,id_star_1Gotoes);
    reduceinstr_if_else = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_if_else,7,instrGotoes);
    reduceexpr_and = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_and,3,exprGotoes);
    reducefuncall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.funcall,4,funcallGotoes);
    reduceexpr_star_4_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_rec,3,expr_star_4_subGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceitem_instr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.item_instr,1,itemGotoes);
    reduceexpr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall,1,exprGotoes);
    reduceexpr_or = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_or,3,exprGotoes);
    reduceinstr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_funcall,1,instrGotoes);
    reduceitem_star_0_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.item_star_0_rec,2,item_star_0Gotoes);
    reduceinstr_star_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_2_empty,0,instr_star_2Gotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_not,2,exprGotoes);
    reduceexpr_number = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_number,1,exprGotoes);
    reduceexpr_star_4_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_element,1,expr_star_4_subGotoes);
    reduceid_star_1_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_1_empty,0,id_star_1Gotoes);
    reduceinstr_repeat_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_repeat_while,5,instrGotoes);
    reduceproc = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.proc,6,procGotoes);
    reduceinstr_repeat = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_repeat,5,instrGotoes);
    reducenumber_optional_3_number = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.number_optional_3_number,1,number_optional_3Gotoes);
    reduceinstr_star_2_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_star_2_rec,2,instr_star_2Gotoes);
    reduceexpr_bool = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_bool,1,exprGotoes);
    reduceexpr_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_id,1,exprGotoes);
    reduceexpr_star_4_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_through,1,expr_star_4Gotoes);
    reduceinstr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_if,5,instrGotoes);
    reduceid_star_1_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_1_element,1,id_star_1_subGotoes);
    shift45 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(45);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift46 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(46);
    shift47 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(47);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift9 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(9);
    shift56 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(56);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift49 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(49);
    shift24 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(24);
    shift52 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(52);
    shift32 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(32);
    shift20 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(20);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift22 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(22);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift28 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(28);
    shift54 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(54);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift30 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(30);
    shift51 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(51);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift36 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(36);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift41 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(41);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initnumberArray();
    initrepeatArray();
    initboolArray();
    init_ifArray();
    initnotArray();
    init_breakArray();
    initorArray();
    initcommaArray();
    initrepeatWhileArray();
    initandArray();
    initlparArray();
    initrcurlArray();
    init_elseArray();
    initendArray();
    initrparArray();
    initidArray();
    initlcurlArray();
    init__eof__Array();
    initprocedureArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.number,numberArray);
    tableMap.put(TerminalEnum.repeat,repeatArray);
    tableMap.put(TerminalEnum.bool,boolArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum.not,notArray);
    tableMap.put(TerminalEnum._break,_breakArray);
    tableMap.put(TerminalEnum.or,orArray);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum.repeatWhile,repeatWhileArray);
    tableMap.put(TerminalEnum.and,andArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.rcurl,rcurlArray);
    tableMap.put(TerminalEnum._else,_elseArray);
    tableMap.put(TerminalEnum.end,endArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.lcurl,lcurlArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.procedure,procedureArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),63,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0number_metadata0reducenumber_optional_3_number = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.number,reducenumber_optional_3_number);
    metadata0not_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.not,null);
    metadata0bool_metadata0reduceexpr_bool = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bool,reduceexpr_bool);
    metadata0rpar_metadata0reducefuncall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reducefuncall);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0_else_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._else,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0expr_star_4_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_4_sub,null);
    metadata0expr_metadata0reduceexpr_and = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,reduceexpr_and);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0instr_metadata0reduceitem_instr = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceitem_instr);
    metadata0id_metadata0reduceid_star_1_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_1_element);
    metadata0end_metadata0reduceinstr_end = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.end,reduceinstr_end);
    metadata0or_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.or,null);
    metadata0item_metadata0reduceitem_star_0_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.item,reduceitem_star_0_rec);
    metadata0rcurl_metadata0reduceblock = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rcurl,reduceblock);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0expr_metadata0reduceexpr_or = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,reduceexpr_or);
    metadata0repeatWhile_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.repeatWhile,null);
    metadata0and_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.and,null);
    metadata0block_metadata0reduceinstr_repeat = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceinstr_repeat);
    metadata0repeat_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.repeat,null);
    metadata0id_star_1_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_1,null);
    metadata0lcurl_metadata0reduceinstr_star_2_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lcurl,reduceinstr_star_2_empty);
    metadata0null_metadata0reduceitem_star_0_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,reduceitem_star_0_empty);
    metadata0block_metadata0reduceproc = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceproc);
    metadata0funcall_metadata0reduceinstr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.funcall,reduceinstr_funcall);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0number_metadata0reduceexpr_number = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.number,reduceexpr_number);
    metadata0block_metadata0reduceinstr_repeat_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceinstr_repeat_while);
    metadata0_break_metadata0reduceinstr_break = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._break,reduceinstr_break);
    metadata0expr_star_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_4,null);
    metadata0id_metadata0reduceid_star_1_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_1_rec);
    metadata0proc_metadata0reduceitem_proc = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.proc,reduceitem_proc);
    metadata0item_star_0_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.item_star_0,null);
    metadata0rpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,null);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0procedure_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.procedure,null);
    metadata0block_metadata0reduceinstr_if_else = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceinstr_if_else);
    metadata0number_optional_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.number_optional_3,null);
    metadata0instr_star_2_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr_star_2,null);
    metadata0instr_metadata0reduceinstr_star_2_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceinstr_star_2_rec);
    metadata0funcall_metadata0reduceexpr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.funcall,reduceexpr_funcall);
    metadata0expr_metadata0reduceexpr_not = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,reduceexpr_not);
    metadata0id_star_1_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_1_sub,null);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0reduceitem_star_0_empty,metadata0script_metadata0null,metadata0__eof___metadata0null,metadata0item_star_0_metadata0null,metadata0procedure_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0reduceid_star_1_element,metadata0id_star_1_sub_metadata0null,metadata0comma_metadata0null,metadata0id_metadata0reduceid_star_1_rec,metadata0id_star_1_metadata0null,metadata0rpar_metadata0null,metadata0lcurl_metadata0reduceinstr_star_2_empty,metadata0instr_star_2_metadata0null,metadata0rcurl_metadata0reduceblock,metadata0end_metadata0reduceinstr_end,metadata0_break_metadata0reduceinstr_break,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0not_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0number_metadata0reduceexpr_number,metadata0bool_metadata0reduceexpr_bool,metadata0funcall_metadata0reduceexpr_funcall,metadata0expr_star_4_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0or_metadata0null,metadata0expr_metadata0reduceexpr_or,metadata0and_metadata0null,metadata0expr_metadata0reduceexpr_and,metadata0expr_metadata0null,metadata0expr_star_4_metadata0null,metadata0rpar_metadata0reducefuncall,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0expr_metadata0reduceexpr_not,metadata0expr_metadata0null,metadata0rpar_metadata0null,metadata0block_metadata0null,metadata0_else_metadata0null,metadata0block_metadata0reduceinstr_if_else,metadata0repeat_metadata0null,metadata0lpar_metadata0null,metadata0number_metadata0reducenumber_optional_3_number,metadata0number_optional_3_metadata0null,metadata0rpar_metadata0null,metadata0block_metadata0reduceinstr_repeat,metadata0repeatWhile_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0null,metadata0block_metadata0reduceinstr_repeat_while,metadata0id_metadata0null,metadata0funcall_metadata0reduceinstr_funcall,metadata0instr_metadata0reduceinstr_star_2_rec,metadata0block_metadata0reduceproc,metadata0proc_metadata0reduceitem_proc,metadata0instr_metadata0reduceitem_instr,metadata0item_metadata0reduceitem_star_0_rec};
  }

  
  private int[] procGotoes;

  private void initprocGotoes() {
    procGotoes = 
      new int[]{-1,-1,-1,60,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] number_optional_3Gotoes;

  private void initnumber_optional_3Gotoes() {
    number_optional_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,48,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] itemGotoes;

  private void inititemGotoes() {
    itemGotoes = 
      new int[]{-1,-1,-1,62,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,40,39,37,-1,34,-1,-1,-1,-1,29,-1,31,-1,33,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instr_star_2Gotoes;

  private void initinstr_star_2Gotoes() {
    instr_star_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_1Gotoes;

  private void initid_star_1Gotoes() {
    id_star_1Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_4_subGotoes;

  private void initexpr_star_4_subGotoes() {
    expr_star_4_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{-1,-1,-1,61,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,58,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_4Gotoes;

  private void initexpr_star_4Gotoes() {
    expr_star_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,35,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_1_subGotoes;

  private void initid_star_1_subGotoes() {
    id_star_1_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,8,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] funcallGotoes;

  private void initfuncallGotoes() {
    funcallGotoes = 
      new int[]{-1,-1,-1,57,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,57,-1,-1,-1,-1,26,26,26,-1,26,-1,-1,-1,-1,26,-1,26,-1,26,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,26,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] item_star_0Gotoes;

  private void inititem_star_0Gotoes() {
    item_star_0Gotoes = 
      new int[]{3,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,59,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,42,-1,44,-1,-1,-1,-1,-1,50,-1,-1,-1,-1,55,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] numberArray;
  @SuppressWarnings("unchecked")
  private void initnumberArray() {
    numberArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift24,shift24,shift24,branch0,shift24,branch0,branch0,branch0,branch0,shift24,branch0,shift24,branch0,shift24,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift47,branch0,branch0,branch0,branch0,branch0,shift24,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] repeatArray;
  @SuppressWarnings("unchecked")
  private void initrepeatArray() {
    repeatArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,branch0,branch0,shift45,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_2_empty,shift45,reduceblock,reduceinstr_end,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,branch0,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,reduceinstr_star_2_rec,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] boolArray;
  @SuppressWarnings("unchecked")
  private void initboolArray() {
    boolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift25,shift25,shift25,branch0,shift25,branch0,branch0,branch0,branch0,shift25,branch0,shift25,branch0,shift25,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift25,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_2_empty,shift18,reduceblock,reduceinstr_end,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,branch0,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,reduceinstr_star_2_rec,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] notArray;
  @SuppressWarnings("unchecked")
  private void initnotArray() {
    notArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,shift20,shift20,branch0,shift20,branch0,branch0,branch0,branch0,shift20,branch0,shift20,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _breakArray;
  @SuppressWarnings("unchecked")
  private void init_breakArray() {
    _breakArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,branch0,branch0,shift17,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_2_empty,shift17,reduceblock,reduceinstr_end,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,branch0,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,reduceinstr_star_2_rec,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] orArray;
  @SuppressWarnings("unchecked")
  private void initorArray() {
    orArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,reduceexpr_number,reduceexpr_bool,reduceexpr_funcall,branch0,branch0,shift30,branch0,reduceexpr_or,branch0,reduceexpr_and,shift30,branch0,reducefuncall,shift30,reduceexpr_parens,reduceexpr_not,shift30,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift30,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceid_star_1_element,shift9,branch0,reduceid_star_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,reduceexpr_number,reduceexpr_bool,reduceexpr_funcall,shift28,branch0,reduceexpr_star_4_rec,branch0,reduceexpr_or,branch0,reduceexpr_and,reduceexpr_star_4_element,branch0,reducefuncall,branch0,reduceexpr_parens,reduceexpr_not,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] repeatWhileArray;
  @SuppressWarnings("unchecked")
  private void initrepeatWhileArray() {
    repeatWhileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_2_empty,shift51,reduceblock,reduceinstr_end,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,branch0,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,reduceinstr_star_2_rec,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] andArray;
  @SuppressWarnings("unchecked")
  private void initandArray() {
    andArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,reduceexpr_number,reduceexpr_bool,reduceexpr_funcall,branch0,branch0,shift32,branch0,reduceexpr_or,branch0,reduceexpr_and,shift32,branch0,reducefuncall,shift32,reduceexpr_parens,reduceexpr_not,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift19,shift21,shift21,shift21,shift23,shift21,branch0,branch0,branch0,branch0,shift21,branch0,shift21,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift46,branch0,branch0,branch0,branch0,branch0,shift52,shift21,branch0,branch0,branch0,shift23,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rcurlArray;
  @SuppressWarnings("unchecked")
  private void initrcurlArray() {
    rcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_2_empty,shift15,reduceblock,reduceinstr_end,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,branch0,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,reduceinstr_star_2_rec,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _elseArray;
  @SuppressWarnings("unchecked")
  private void init_elseArray() {
    _elseArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] endArray;
  @SuppressWarnings("unchecked")
  private void initendArray() {
    endArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_2_empty,shift16,reduceblock,reduceinstr_end,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,branch0,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,reduceinstr_star_2_rec,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceid_star_1_empty,reduceid_star_1_element,reduceid_star_1_through,branch0,reduceid_star_1_rec,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,reduceexpr_star_4_empty,reduceexpr_number,reduceexpr_bool,reduceexpr_funcall,reduceexpr_star_4_through,branch0,reduceexpr_star_4_rec,branch0,reduceexpr_or,branch0,reduceexpr_and,reduceexpr_star_4_element,shift36,reducefuncall,shift38,reduceexpr_parens,reduceexpr_not,shift41,branch0,branch0,branch0,branch0,branch0,reducenumber_optional_3_empty,reducenumber_optional_3_number,shift49,branch0,branch0,branch0,branch0,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,branch0,branch0,shift56,shift5,branch0,shift7,branch0,branch0,shift10,branch0,branch0,branch0,reduceinstr_star_2_empty,shift56,reduceblock,reduceinstr_end,reduceinstr_break,branch0,shift22,shift22,shift22,branch0,shift22,branch0,branch0,branch0,branch0,shift22,branch0,shift22,branch0,shift22,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,shift22,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,reduceinstr_star_2_rec,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lcurlArray;
  @SuppressWarnings("unchecked")
  private void initlcurlArray() {
    lcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,shift13,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,accept,accept,reducescript,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock,reduceinstr_end,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,branch0,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,branch0,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] procedureArray;
  @SuppressWarnings("unchecked")
  private void initprocedureArray() {
    procedureArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock,reduceinstr_end,reduceinstr_break,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall,branch0,branch0,branch0,branch0,branch0,reduceinstr_if,branch0,reduceinstr_if_else,branch0,branch0,branch0,branch0,branch0,reduceinstr_repeat,branch0,branch0,branch0,branch0,reduceinstr_repeat_while,branch0,reduceinstr_funcall,branch0,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceitem_star_0_empty,exit,exit,reducescript,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceblock,reduceinstr_end,reduceinstr_break,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefuncall,error0,error0,error0,error0,error0,reduceinstr_if,error0,reduceinstr_if_else,error0,error0,error0,error0,error0,reduceinstr_repeat,error0,error0,error0,error0,reduceinstr_repeat_while,error0,reduceinstr_funcall,error0,reduceproc,reduceitem_proc,reduceitem_instr,reduceitem_star_0_rec};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceitem_star_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_end;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducenumber_optional_3_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceitem_proc;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_break;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_1_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_1_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_if_else;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_and;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefuncall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceitem_instr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_or;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceitem_star_0_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_number;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_1_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_repeat_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceproc;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_repeat;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducenumber_optional_3_number;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_star_2_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_bool;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_1_element;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift45;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift46;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift47;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift9;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift56;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift49;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift24;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift52;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift32;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift20;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift22;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift28;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift54;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift30;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift51;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift36;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift41;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0number_metadata0reducenumber_optional_3_number;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0not_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bool_metadata0reduceexpr_bool;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reducefuncall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_else_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_4_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0reduceexpr_and;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceitem_instr;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_1_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0end_metadata0reduceinstr_end;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0or_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0item_metadata0reduceitem_star_0_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rcurl_metadata0reduceblock;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0reduceexpr_or;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0repeatWhile_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0and_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceinstr_repeat;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0repeat_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_1_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lcurl_metadata0reduceinstr_star_2_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0reduceitem_star_0_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceproc;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0funcall_metadata0reduceinstr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0number_metadata0reduceexpr_number;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceinstr_repeat_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_break_metadata0reduceinstr_break;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_1_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0proc_metadata0reduceitem_proc;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0item_star_0_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0procedure_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceinstr_if_else;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0number_optional_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_star_2_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceinstr_star_2_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0funcall_metadata0reduceexpr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0reduceexpr_not;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_1_sub_metadata0null;
}
