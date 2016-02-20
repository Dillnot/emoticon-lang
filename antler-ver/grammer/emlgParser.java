// Generated from grammer/emlg.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class emlgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, ASSN=2, BOOL=3, INT=4, LPAR=5, RPAR=6, IF=7, ELSE=8, WHILE=9, 
		EOE=10, EQ=11, LT=12, GT=13, PLUS=14, MINUS=15, TIMES=16, DIV=17, FALSE=18, 
		TRUE=19, NOT=20, NUM=21, ID=22, SPACE=23, EOL=24;
	public static final int
		RULE_program = 0, RULE_var_decl = 1, RULE_type = 2, RULE_com = 3, RULE_seq_com = 4, 
		RULE_expr = 5, RULE_sec_expr = 6, RULE_prim_expr = 7;
	public static final String[] ruleNames = {
		"program", "var_decl", "type", "com", "seq_com", "expr", "sec_expr", "prim_expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':O'", "'XD'", "':P'", "':|'", "'<3'", "'</3'", "'O_o'", "'o_O'", 
		"'><>'", "':$'", "':@'", "':<'", "':>'", "':3'", "'<:|'", "':D'", "'D:'", 
		"'}:)'", "'O:)'", "':&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT", "ASSN", "BOOL", "INT", "LPAR", "RPAR", "IF", "ELSE", "WHILE", 
		"EOE", "EQ", "LT", "GT", "PLUS", "MINUS", "TIMES", "DIV", "FALSE", "TRUE", 
		"NOT", "NUM", "ID", "SPACE", "EOL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "emlg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public emlgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgContext extends ProgramContext {
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode EOF() { return getToken(emlgParser.EOF, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public ProgContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOL || _la==INT) {
				{
				{
				setState(16);
				var_decl();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			seq_com();
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarContext extends Var_declContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(emlgParser.ID, 0); }
		public TerminalNode ASSN() { return getToken(emlgParser.ASSN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_decl);
		try {
			_localctx = new VarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			type();
			setState(26);
			match(ID);
			setState(27);
			match(ASSN);
			setState(28);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntContext extends TypeContext {
		public TerminalNode INT() { return getToken(emlgParser.INT, 0); }
		public IntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(emlgParser.BOOL, 0); }
		public BoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(32);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(BOOL);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfContext extends ComContext {
		public Seq_comContext c1;
		public Seq_comContext c2;
		public TerminalNode IF() { return getToken(emlgParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(emlgParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(emlgParser.LPAR, i);
		}
		public List<Seq_comContext> seq_com() {
			return getRuleContexts(Seq_comContext.class);
		}
		public Seq_comContext seq_com(int i) {
			return getRuleContext(Seq_comContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(emlgParser.RPAR, 0); }
		public TerminalNode ELSE() { return getToken(emlgParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssnContext extends ComContext {
		public TerminalNode ID() { return getToken(emlgParser.ID, 0); }
		public TerminalNode ASSN() { return getToken(emlgParser.ASSN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOE() { return getToken(emlgParser.EOE, 0); }
		public AssnContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitAssn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends ComContext {
		public TerminalNode PRINT() { return getToken(emlgParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(emlgParser.ID, 0); }
		public TerminalNode EOE() { return getToken(emlgParser.EOE, 0); }
		public PrintContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(emlgParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(emlgParser.LPAR, 0); }
		public Seq_comContext seq_com() {
			return getRuleContext(Seq_comContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(emlgParser.RPAR, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_com);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(ID);
				setState(35);
				match(ASSN);
				setState(36);
				expr();
				setState(37);
				match(EOE);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(IF);
				setState(40);
				expr();
				setState(41);
				match(LPAR);
				setState(42);
				((IfContext)_localctx).c1 = seq_com();
				setState(49);
				switch (_input.LA(1)) {
				case RPAR:
					{
					setState(43);
					match(RPAR);
					}
					break;
				case ELSE:
					{
					setState(44);
					match(ELSE);
					setState(45);
					match(LPAR);
					setState(46);
					((IfContext)_localctx).c2 = seq_com();
					setState(47);
					match(RPAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(WHILE);
				setState(52);
				expr();
				setState(53);
				match(LPAR);
				setState(54);
				seq_com();
				setState(55);
				match(RPAR);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(PRINT);
				setState(58);
				match(ID);
				setState(59);
				match(EOE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Seq_comContext extends ParserRuleContext {
		public Seq_comContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq_com; }
	 
		public Seq_comContext() { }
		public void copyFrom(Seq_comContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SeqContext extends Seq_comContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public SeqContext(Seq_comContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seq_comContext seq_com() throws RecognitionException {
		Seq_comContext _localctx = new Seq_comContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seq_com);
		int _la;
		try {
			_localctx = new SeqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(62);
				com();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Sec_exprContext e1;
		public Token op;
		public Sec_exprContext e2;
		public List<Sec_exprContext> sec_expr() {
			return getRuleContexts(Sec_exprContext.class);
		}
		public Sec_exprContext sec_expr(int i) {
			return getRuleContext(Sec_exprContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(emlgParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(emlgParser.EQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(emlgParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(emlgParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(emlgParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(emlgParser.GT, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((ExprContext)_localctx).e1 = sec_expr();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) {
				{
				{
				setState(69);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(70);
				((ExprContext)_localctx).e2 = sec_expr();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sec_exprContext extends ParserRuleContext {
		public Prim_exprContext e1;
		public Token op;
		public Sec_exprContext e2;
		public Prim_exprContext prim_expr() {
			return getRuleContext(Prim_exprContext.class,0);
		}
		public Sec_exprContext sec_expr() {
			return getRuleContext(Sec_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(emlgParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(emlgParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(emlgParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(emlgParser.DIV, 0); }
		public Sec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sec_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitSec_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sec_exprContext sec_expr() throws RecognitionException {
		Sec_exprContext _localctx = new Sec_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sec_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((Sec_exprContext)_localctx).e1 = prim_expr();
			setState(79);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) {
				{
				setState(77);
				((Sec_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) ) {
					((Sec_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(78);
				((Sec_exprContext)_localctx).e2 = sec_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prim_exprContext extends ParserRuleContext {
		public Prim_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim_expr; }
	 
		public Prim_exprContext() { }
		public void copyFrom(Prim_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends Prim_exprContext {
		public TerminalNode NOT() { return getToken(emlgParser.NOT, 0); }
		public Prim_exprContext prim_expr() {
			return getRuleContext(Prim_exprContext.class,0);
		}
		public NotContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends Prim_exprContext {
		public TerminalNode ID() { return getToken(emlgParser.ID, 0); }
		public IdContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends Prim_exprContext {
		public TerminalNode NUM() { return getToken(emlgParser.NUM, 0); }
		public NumContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends Prim_exprContext {
		public TerminalNode TRUE() { return getToken(emlgParser.TRUE, 0); }
		public TrueContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends Prim_exprContext {
		public TerminalNode FALSE() { return getToken(emlgParser.FALSE, 0); }
		public FalseContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends Prim_exprContext {
		public TerminalNode LPAR() { return getToken(emlgParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(emlgParser.RPAR, 0); }
		public ParensContext(Prim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prim_exprContext prim_expr() throws RecognitionException {
		Prim_exprContext _localctx = new Prim_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prim_expr);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(FALSE);
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(TRUE);
				}
				break;
			case NUM:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(ID);
				}
				break;
			case NOT:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(NOT);
				setState(86);
				prim_expr();
				}
				break;
			case LPAR:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(LPAR);
				setState(88);
				expr();
				setState(89);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4#\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\7\6B\n\6\f\6\16\6E\13\6\3"+
		"\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3"+
		"\2\r\17\3\2\20\23e\2\25\3\2\2\2\4\33\3\2\2\2\6\"\3\2\2\2\b>\3\2\2\2\n"+
		"C\3\2\2\2\fF\3\2\2\2\16N\3\2\2\2\20]\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2"+
		"\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2"+
		"\2\30\31\5\n\6\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\5\6\4\2\34\35\7\30\2"+
		"\2\35\36\7\4\2\2\36\37\5\f\7\2\37\5\3\2\2\2 #\7\5\2\2!#\7\6\2\2\" \3\2"+
		"\2\2\"!\3\2\2\2#\7\3\2\2\2$%\7\30\2\2%&\7\4\2\2&\'\5\f\7\2\'(\7\f\2\2"+
		"(?\3\2\2\2)*\7\t\2\2*+\5\f\7\2+,\7\7\2\2,\63\5\n\6\2-\64\7\b\2\2./\7\n"+
		"\2\2/\60\7\7\2\2\60\61\5\n\6\2\61\62\7\b\2\2\62\64\3\2\2\2\63-\3\2\2\2"+
		"\63.\3\2\2\2\64?\3\2\2\2\65\66\7\13\2\2\66\67\5\f\7\2\678\7\7\2\289\5"+
		"\n\6\29:\7\b\2\2:?\3\2\2\2;<\7\3\2\2<=\7\30\2\2=?\7\f\2\2>$\3\2\2\2>)"+
		"\3\2\2\2>\65\3\2\2\2>;\3\2\2\2?\t\3\2\2\2@B\5\b\5\2A@\3\2\2\2BE\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2D\13\3\2\2\2EC\3\2\2\2FK\5\16\b\2GH\t\2\2\2HJ\5"+
		"\16\b\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MK\3\2\2\2N"+
		"Q\5\20\t\2OP\t\3\2\2PR\5\16\b\2QO\3\2\2\2QR\3\2\2\2R\17\3\2\2\2S^\7\24"+
		"\2\2T^\7\25\2\2U^\7\27\2\2V^\7\30\2\2WX\7\26\2\2X^\5\20\t\2YZ\7\7\2\2"+
		"Z[\5\f\7\2[\\\7\b\2\2\\^\3\2\2\2]S\3\2\2\2]T\3\2\2\2]U\3\2\2\2]V\3\2\2"+
		"\2]W\3\2\2\2]Y\3\2\2\2^\21\3\2\2\2\n\25\"\63>CKQ]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}