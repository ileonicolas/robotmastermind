package fr.umlv.robomastermind.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import fr.umlv.robomastermind.grammar.lexer.RuleEnum;
import fr.umlv.robomastermind.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum._break,RuleEnum.lpar,RuleEnum.not,RuleEnum.repeat,RuleEnum.end,RuleEnum.procedure,RuleEnum.bool,RuleEnum.rpar,RuleEnum.rcurl,RuleEnum.or,RuleEnum.number,RuleEnum.comma,RuleEnum.lcurl,RuleEnum.and,RuleEnum.comment,RuleEnum._if,RuleEnum._else,RuleEnum.repeatWhile,RuleEnum.id);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.or,TerminalEnum.or);
              terminal.put(RuleEnum.number,TerminalEnum.number);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum._else,TerminalEnum._else);
              terminal.put(RuleEnum.and,TerminalEnum.and);
              terminal.put(RuleEnum.repeatWhile,TerminalEnum.repeatWhile);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum._break,TerminalEnum._break);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.repeat,TerminalEnum.repeat);
              terminal.put(RuleEnum.not,TerminalEnum.not);
              terminal.put(RuleEnum.procedure,TerminalEnum.procedure);
              terminal.put(RuleEnum.end,TerminalEnum.end);
              terminal.put(RuleEnum.bool,TerminalEnum.bool);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.comment,RuleEnum.space);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}