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
		PRINT=1, CHAR=2, READ=3, ASSN=4, LPAR=5, RPAR=6, IF=7, ELSE=8, WHILE=9, 
		EOE=10, EQ=11, LT=12, GT=13, PLUS=14, MINUS=15, TIMES=16, DIV=17, FALSE=18, 
		TRUE=19, NOT=20, NUM=21, ID=22, SPACE=23, EOL=24, COMMENT=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRINT", "CHAR", "READ", "ASSN", "LPAR", "RPAR", "IF", "ELSE", "WHILE", 
		"EOE", "EQ", "LT", "GT", "PLUS", "MINUS", "TIMES", "DIV", "FALSE", "TRUE", 
		"NOT", "NUM", "DIGIT", "ID", "PARTOFID", "SPACE", "EOL", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':O'", "':#'", "'|‑O'", "'XD'", "'<3'", "'</3'", "'O_o'", "'o_O'", 
		"'><>'", "':$'", "':@'", "':<'", "':>'", "':3'", "'<:|'", "':D'", "'D:'", 
		"'}:)'", "'O:)'", "':&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT", "CHAR", "READ", "ASSN", "LPAR", "RPAR", "IF", "ELSE", "WHILE", 
		"EOE", "EQ", "LT", "GT", "PLUS", "MINUS", "TIMES", "DIV", "FALSE", "TRUE", 
		"NOT", "NUM", "ID", "SPACE", "EOL", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\6\26\177"+
		"\n\26\r\26\16\26\u0080\3\27\3\27\3\30\3\30\6\30\u0087\n\30\r\30\16\30"+
		"\u0088\3\31\3\31\3\32\6\32\u008e\n\32\r\32\16\32\u008f\3\32\3\32\3\33"+
		"\5\33\u0095\n\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\2\2\35\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\2/\30\61\2\63\31\65\32\67\33\3\2\4\4\2\13\13"+
		"\"\"\4\2C\\c|\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2/\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5<\3\2\2"+
		"\2\7?\3\2\2\2\tC\3\2\2\2\13F\3\2\2\2\rI\3\2\2\2\17M\3\2\2\2\21Q\3\2\2"+
		"\2\23U\3\2\2\2\25Y\3\2\2\2\27\\\3\2\2\2\31_\3\2\2\2\33b\3\2\2\2\35e\3"+
		"\2\2\2\37h\3\2\2\2!l\3\2\2\2#o\3\2\2\2%r\3\2\2\2\'v\3\2\2\2)z\3\2\2\2"+
		"+~\3\2\2\2-\u0082\3\2\2\2/\u0084\3\2\2\2\61\u008a\3\2\2\2\63\u008d\3\2"+
		"\2\2\65\u0094\3\2\2\2\67\u009a\3\2\2\29:\7<\2\2:;\7Q\2\2;\4\3\2\2\2<="+
		"\7<\2\2=>\7%\2\2>\6\3\2\2\2?@\7~\2\2@A\7\u2013\2\2AB\7Q\2\2B\b\3\2\2\2"+
		"CD\7Z\2\2DE\7F\2\2E\n\3\2\2\2FG\7>\2\2GH\7\65\2\2H\f\3\2\2\2IJ\7>\2\2"+
		"JK\7\61\2\2KL\7\65\2\2L\16\3\2\2\2MN\7Q\2\2NO\7a\2\2OP\7q\2\2P\20\3\2"+
		"\2\2QR\7q\2\2RS\7a\2\2ST\7Q\2\2T\22\3\2\2\2UV\7@\2\2VW\7>\2\2WX\7@\2\2"+
		"X\24\3\2\2\2YZ\7<\2\2Z[\7&\2\2[\26\3\2\2\2\\]\7<\2\2]^\7B\2\2^\30\3\2"+
		"\2\2_`\7<\2\2`a\7>\2\2a\32\3\2\2\2bc\7<\2\2cd\7@\2\2d\34\3\2\2\2ef\7<"+
		"\2\2fg\7\65\2\2g\36\3\2\2\2hi\7>\2\2ij\7<\2\2jk\7~\2\2k \3\2\2\2lm\7<"+
		"\2\2mn\7F\2\2n\"\3\2\2\2op\7F\2\2pq\7<\2\2q$\3\2\2\2rs\7\177\2\2st\7<"+
		"\2\2tu\7+\2\2u&\3\2\2\2vw\7Q\2\2wx\7<\2\2xy\7+\2\2y(\3\2\2\2z{\7<\2\2"+
		"{|\7(\2\2|*\3\2\2\2}\177\5-\27\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081,\3\2\2\2\u0082\u0083\4\62;\2\u0083.\3"+
		"\2\2\2\u0084\u0086\7<\2\2\u0085\u0087\5\61\31\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\60\3\2\2"+
		"\2\u008a\u008b\7+\2\2\u008b\62\3\2\2\2\u008c\u008e\t\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\b\32\2\2\u0092\64\3\2\2\2\u0093\u0095\7\17"+
		"\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\7\f\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\33\2\2\u0099\66\3\2\2"+
		"\2\u009a\u009b\t\3\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\34\2\2\u009d"+
		"8\3\2\2\2\7\2\u0080\u0088\u008f\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}