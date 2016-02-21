// Generated from grammer/emlg.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class emlgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, READ=2, ASSN=3, LPAR=4, RPAR=5, IF=6, ELSE=7, WHILE=8, EOE=9, 
		EQ=10, LT=11, GT=12, PLUS=13, MINUS=14, TIMES=15, DIV=16, FALSE=17, TRUE=18, 
		NOT=19, NUM=20, ID=21, SPACE=22, EOL=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRINT", "READ", "ASSN", "LPAR", "RPAR", "IF", "ELSE", "WHILE", "EOE", 
		"EQ", "LT", "GT", "PLUS", "MINUS", "TIMES", "DIV", "FALSE", "TRUE", "NOT", 
		"NUM", "DIGIT", "ID", "PARTOFID", "SPACE", "EOL"
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


	public emlgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "emlg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\6\25x\n\25\r\25\16\25y\3\26\3\26\3\27\3\27"+
		"\6\27\u0080\n\27\r\27\16\27\u0081\3\30\3\30\3\31\6\31\u0087\n\31\r\31"+
		"\16\31\u0088\3\31\3\31\3\32\5\32\u008e\n\32\3\32\3\32\3\32\3\32\2\2\33"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\2-\27/\2\61\30\63\31\3\2\3\4\2\13\13\"\""+
		"\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\3\65\3\2\2\2\58\3\2\2\2\7<\3\2\2\2\t?\3\2\2\2\13B\3\2\2"+
		"\2\rF\3\2\2\2\17J\3\2\2\2\21N\3\2\2\2\23R\3\2\2\2\25U\3\2\2\2\27X\3\2"+
		"\2\2\31[\3\2\2\2\33^\3\2\2\2\35a\3\2\2\2\37e\3\2\2\2!h\3\2\2\2#k\3\2\2"+
		"\2%o\3\2\2\2\'s\3\2\2\2)w\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\u0083\3\2\2\2\61"+
		"\u0086\3\2\2\2\63\u008d\3\2\2\2\65\66\7<\2\2\66\67\7Q\2\2\67\4\3\2\2\2"+
		"89\7~\2\29:\7\u2013\2\2:;\7Q\2\2;\6\3\2\2\2<=\7Z\2\2=>\7F\2\2>\b\3\2\2"+
		"\2?@\7>\2\2@A\7\65\2\2A\n\3\2\2\2BC\7>\2\2CD\7\61\2\2DE\7\65\2\2E\f\3"+
		"\2\2\2FG\7Q\2\2GH\7a\2\2HI\7q\2\2I\16\3\2\2\2JK\7q\2\2KL\7a\2\2LM\7Q\2"+
		"\2M\20\3\2\2\2NO\7@\2\2OP\7>\2\2PQ\7@\2\2Q\22\3\2\2\2RS\7<\2\2ST\7&\2"+
		"\2T\24\3\2\2\2UV\7<\2\2VW\7B\2\2W\26\3\2\2\2XY\7<\2\2YZ\7>\2\2Z\30\3\2"+
		"\2\2[\\\7<\2\2\\]\7@\2\2]\32\3\2\2\2^_\7<\2\2_`\7\65\2\2`\34\3\2\2\2a"+
		"b\7>\2\2bc\7<\2\2cd\7~\2\2d\36\3\2\2\2ef\7<\2\2fg\7F\2\2g \3\2\2\2hi\7"+
		"F\2\2ij\7<\2\2j\"\3\2\2\2kl\7\177\2\2lm\7<\2\2mn\7+\2\2n$\3\2\2\2op\7"+
		"Q\2\2pq\7<\2\2qr\7+\2\2r&\3\2\2\2st\7<\2\2tu\7(\2\2u(\3\2\2\2vx\5+\26"+
		"\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z*\3\2\2\2{|\4\62;\2|,\3\2\2"+
		"\2}\177\7<\2\2~\u0080\5/\30\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082.\3\2\2\2\u0083\u0084\7+\2\2\u0084\60"+
		"\3\2\2\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\31"+
		"\2\2\u008b\62\3\2\2\2\u008c\u008e\7\17\2\2\u008d\u008c\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\b\32\2\2\u0092\64\3\2\2\2\7\2y\u0081\u0088\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}