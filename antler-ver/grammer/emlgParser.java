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
		PRINT=1, READ=2, ASSN=3, LPAR=4, RPAR=5, IF=6, ELSE=7, WHILE=8, EOE=9, 
		EQ=10, LT=11, GT=12, PLUS=13, MINUS=14, TIMES=15, DIV=16, FALSE=17, TRUE=18, 
		NOT=19, NUM=20, ID=21, SPACE=22, EOL=23;
	public static final int
		RULE_program = 0, RULE_com = 1, RULE_seq_com = 2, RULE_expr = 3, RULE_sec_expr = 4, 
		RULE_prim_expr = 5;
	public static final String[] ruleNames = {
		"program", "com", "seq_com", "expr", "sec_expr", "prim_expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':O'", "'|‑O'", "'XD'", "'<3'", "'</3'", "'O_o'", "'o_O'", "'><>'", 
		"':$'", "':@'", "':<'", "':>'", "':3'", "'<:|'", "':D'", "'D:'", "'}:)'", 
		"'O:)'", "':&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT", "READ", "ASSN", "LPAR", "RPAR", "IF", "ELSE", "WHILE", 
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
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			seq_com();
			setState(13);
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
	public static class ReadContext extends ComContext {
		public TerminalNode READ() { return getToken(emlgParser.READ, 0); }
		public TerminalNode ID() { return getToken(emlgParser.ID, 0); }
		public TerminalNode EOE() { return getToken(emlgParser.EOE, 0); }
		public ReadContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof emlgVisitor ) return ((emlgVisitor<? extends T>)visitor).visitRead(this);
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
		enterRule(_localctx, 2, RULE_com);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(ID);
				setState(16);
				match(ASSN);
				setState(17);
				expr();
				setState(18);
				match(EOE);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(IF);
				setState(21);
				expr();
				setState(22);
				match(LPAR);
				setState(23);
				((IfContext)_localctx).c1 = seq_com();
				setState(30);
				switch (_input.LA(1)) {
				case RPAR:
					{
					setState(24);
					match(RPAR);
					}
					break;
				case ELSE:
					{
					setState(25);
					match(ELSE);
					setState(26);
					match(LPAR);
					setState(27);
					((IfContext)_localctx).c2 = seq_com();
					setState(28);
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
				setState(32);
				match(WHILE);
				setState(33);
				expr();
				setState(34);
				match(LPAR);
				setState(35);
				seq_com();
				setState(36);
				match(RPAR);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(PRINT);
				setState(39);
				match(ID);
				setState(40);
				match(EOE);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				match(READ);
				setState(42);
				match(ID);
				setState(43);
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
		enterRule(_localctx, 4, RULE_seq_com);
		int _la;
		try {
			_localctx = new SeqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				com();
				}
				}
				setState(51);
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
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((ExprContext)_localctx).e1 = sec_expr();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) {
				{
				{
				setState(53);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(54);
				((ExprContext)_localctx).e2 = sec_expr();
				}
				}
				setState(59);
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
		enterRule(_localctx, 8, RULE_sec_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((Sec_exprContext)_localctx).e1 = prim_expr();
			setState(63);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) {
				{
				setState(61);
				((Sec_exprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) ) {
					((Sec_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(62);
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
		enterRule(_localctx, 10, RULE_prim_expr);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(FALSE);
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(TRUE);
				}
				break;
			case NUM:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(ID);
				}
				break;
			case NOT:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(NOT);
				setState(70);
				prim_expr();
				}
				break;
			case LPAR:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				match(LPAR);
				setState(72);
				expr();
				setState(73);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\7\4\62\n\4\f\4\16\4\65\13\4\3\5"+
		"\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\7\2\2\b\2\4\6\b\n\f\2\4\3\2\f\16\3"+
		"\2\17\22V\2\16\3\2\2\2\4.\3\2\2\2\6\63\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2"+
		"\fM\3\2\2\2\16\17\5\6\4\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\7\27\2\2\22"+
		"\23\7\5\2\2\23\24\5\b\5\2\24\25\7\13\2\2\25/\3\2\2\2\26\27\7\b\2\2\27"+
		"\30\5\b\5\2\30\31\7\6\2\2\31 \5\6\4\2\32!\7\7\2\2\33\34\7\t\2\2\34\35"+
		"\7\6\2\2\35\36\5\6\4\2\36\37\7\7\2\2\37!\3\2\2\2 \32\3\2\2\2 \33\3\2\2"+
		"\2!/\3\2\2\2\"#\7\n\2\2#$\5\b\5\2$%\7\6\2\2%&\5\6\4\2&\'\7\7\2\2\'/\3"+
		"\2\2\2()\7\3\2\2)*\7\27\2\2*/\7\13\2\2+,\7\4\2\2,-\7\27\2\2-/\7\13\2\2"+
		".\21\3\2\2\2.\26\3\2\2\2.\"\3\2\2\2.(\3\2\2\2.+\3\2\2\2/\5\3\2\2\2\60"+
		"\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\7\3\2\2\2\65\63\3\2\2\2\66;\5\n\6\2\678\t\2\2\28:\5\n\6\29\67\3\2\2\2"+
		":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\t\3\2\2\2=;\3\2\2\2>A\5\f\7\2?@\t\3\2"+
		"\2@B\5\n\6\2A?\3\2\2\2AB\3\2\2\2B\13\3\2\2\2CN\7\23\2\2DN\7\24\2\2EN\7"+
		"\26\2\2FN\7\27\2\2GH\7\25\2\2HN\5\f\7\2IJ\7\6\2\2JK\5\b\5\2KL\7\7\2\2"+
		"LN\3\2\2\2MC\3\2\2\2MD\3\2\2\2ME\3\2\2\2MF\3\2\2\2MG\3\2\2\2MI\3\2\2\2"+
		"N\r\3\2\2\2\b .\63;AM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}