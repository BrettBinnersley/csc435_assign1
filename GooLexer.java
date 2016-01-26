// Generated from Goo.g4 by ANTLR 4.5

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GooLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, BREAK=31, 
		CASE=32, CHAN=33, CONST=34, CONTINUE=35, DEFAULT=36, DEFER=37, ELSE=38, 
		FALLTHROUGH=39, FOR=40, FUNC=41, GO=42, GOTO=43, IF=44, IMPORT=45, INTERFACE=46, 
		MAP=47, PACKAGE=48, RANGE=49, RETURN=50, SELECT=51, STRUCT=52, SWITCH=53, 
		TYPE=54, VAR=55, PLUSPLUS=56, MINUSMINUS=57, RPAREN=58, RSQ=59, RBRACE=60, 
		SEMI=61, Identifier=62, ImaginaryLit=63, IntLit=64, FloatLit=65, StringLit=66, 
		RuneLit=67, Whitespace=68, LineComment=69, NL=70, BlockComment=71, BlockNLComment=72;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "BREAK", "CASE", "CHAN", 
		"CONST", "CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", 
		"FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", 
		"RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "PLUSPLUS", "MINUSMINUS", 
		"RPAREN", "RSQ", "RBRACE", "SEMI", "Identifier", "ImaginaryLit", "IntLit", 
		"DECIMALS", "EXPONENT", "FloatLit", "HexDigit", "OctalDigit", "LittleUVal", 
		"BigUVal", "EscapeChar", "UnicodeChar", "UncodeSpace", "UnicodeVal", "OctalByteVal", 
		"HexByteVal", "ByteVal", "RawStringLit", "InterpretedStringLit", "StringLit", 
		"RuneLit", "Whitespace", "LineComment", "NL", "BlockComment", "BlockNLComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "'{'", "'*'", "','", "'='", "':='", "'.'", "'...'", 
		"':'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'|'", 
		"'^'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&^'", "'!'", "'<-'", "'||'", 
		"'&&'", "'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", 
		"'defer'", "'else'", "'fallthrough'", "'for'", "'func'", "'go'", "'goto'", 
		"'if'", "'import'", "'interface'", "'map'", "'package'", "'range'", "'return'", 
		"'select'", "'struct'", "'switch'", "'type'", "'var'", "'++'", "'--'", 
		"')'", "']'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "BREAK", "CASE", "CHAN", "CONST", 
		"CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", 
		"GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", 
		"RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "PLUSPLUS", "MINUSMINUS", 
		"RPAREN", "RSQ", "RBRACE", "SEMI", "Identifier", "ImaginaryLit", "IntLit", 
		"FloatLit", "StringLit", "RuneLit", "Whitespace", "LineComment", "NL", 
		"BlockComment", "BlockNLComment"
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


	    protected int prevTokenType = Token.INVALID_TYPE;

	    // These are the token types such that if one appears as the last
	    // token on a line, a semicolon is inserted right afterwards.
	    protected HashSet<Integer> lastTokens = new HashSet<Integer>() {{
	        add(GooParser.Identifier);      add(GooParser.IntLit);
	        add(GooParser.FloatLit);        add(GooParser.RuneLit);
	        add(GooParser.StringLit);       add(GooParser.BREAK);
	        add(GooParser.CONTINUE);        add(GooParser.FALLTHROUGH);
	        add(GooParser.RETURN);          add(GooParser.PLUSPLUS);
	        add(GooParser.MINUSMINUS);      add(GooParser.RPAREN);
	        add(GooParser.RSQ);             add(GooParser.RBRACE);
	    }};

		@Override
		public Token emit() {
			if (_type == GooParser.NL) {
	            // we have a newline (NL) token
				if (lastTokens.contains(prevTokenType)) {
	                // convert that NL token into a semicolon token
					_type = GooParser.SEMI;
					_text = ";";
				    prevTokenType = Token.INVALID_TYPE;
	                //System.out.println(_tokenStartLine + ":" +
	                //    _tokenStartCharPositionInLine + ": inserted semicolon");
				} else {
	                // skip NL tokens
	                //int cnt = 0;
	                while(true) {
	                    _type = nextToken().getType();
	                //    cnt++;
	                    if (_type != GooParser.NL) break;
	                    super.emit();
	                }
	                prevTokenType = _type;
	                if (_type < 0)
	                    return emitEOF();
	                //System.out.println(_tokenStartLine + ":" + _tokenStartCharPositionInLine +
	                //    ": skipped " + cnt + "*NL" + ", next token = " + _SYMBOLIC_NAMES[_type]);
	            }
			} else {
	            // not a NL token, remember what kind it was
				prevTokenType = _type;
			}
			return super.emit();
		}

		@Override
		public Token nextToken() {
			if (_hitEOF && prevTokenType == GooParser.RBRACE) {
			    // insert a semicolon if last line ends with a right brace (i.e. NL is missing)
				_type = GooParser.SEMI;
				_text = ";";
				prevTokenType = Token.INVALID_TYPE;
				return super.emit();
			}
			return super.nextToken();
		}


	public GooLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Goo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2J\u026d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\7?\u01a5\n?\f?\16?\u01a8\13?\3@\3@\5@\u01ac\n@\3@\3@\3A\3A\7"+
		"A\u01b2\nA\fA\16A\u01b5\13A\3A\3A\7A\u01b9\nA\fA\16A\u01bc\13A\3A\3A\3"+
		"A\6A\u01c1\nA\rA\16A\u01c2\5A\u01c5\nA\3B\6B\u01c8\nB\rB\16B\u01c9\3C"+
		"\3C\5C\u01ce\nC\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u01e2\nD\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\5L\u0207\nL\3M\3M\3M"+
		"\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\5O\u0216\nO\3P\3P\3P\7P\u021b\nP\fP\16"+
		"P\u021e\13P\3P\3P\3Q\3Q\3Q\7Q\u0225\nQ\fQ\16Q\u0228\13Q\3Q\3Q\3R\3R\5"+
		"R\u022e\nR\3S\3S\3S\7S\u0233\nS\fS\16S\u0236\13S\3S\3S\3T\6T\u023b\nT"+
		"\rT\16T\u023c\3T\3T\3U\3U\3U\3U\7U\u0245\nU\fU\16U\u0248\13U\3U\3U\3V"+
		"\3V\5V\u024e\nV\3V\3V\5V\u0252\nV\3W\3W\3W\3W\7W\u0258\nW\fW\16W\u025b"+
		"\13W\3W\3W\3W\3W\3W\3X\3X\3X\3X\7X\u0266\nX\fX\16X\u0269\13X\3X\3X\3X"+
		"\3\u0267\2Y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085\2\u0087C\u0089\2"+
		"\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3D\u00a5E\u00a7F\u00a9G\u00abH\u00adI\u00af"+
		"J\3\2\17\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2\629\4\2ZZzz\5\2"+
		"\62;CHch\4\2GGgg\4\2--//\13\2$$))^^cdhhppttvvxx\3\2\f\f\5\2\13\13\16\16"+
		"\"\"\4\2\f\f\17\17\u027b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\3\u00b1\3\2\2"+
		"\2\5\u00b3\3\2\2\2\7\u00b5\3\2\2\2\t\u00b7\3\2\2\2\13\u00b9\3\2\2\2\r"+
		"\u00bb\3\2\2\2\17\u00bd\3\2\2\2\21\u00c0\3\2\2\2\23\u00c2\3\2\2\2\25\u00c6"+
		"\3\2\2\2\27\u00c8\3\2\2\2\31\u00cb\3\2\2\2\33\u00ce\3\2\2\2\35\u00d0\3"+
		"\2\2\2\37\u00d3\3\2\2\2!\u00d5\3\2\2\2#\u00d8\3\2\2\2%\u00da\3\2\2\2\'"+
		"\u00dc\3\2\2\2)\u00de\3\2\2\2+\u00e0\3\2\2\2-\u00e2\3\2\2\2/\u00e4\3\2"+
		"\2\2\61\u00e7\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ef\3\2\2"+
		"\29\u00f1\3\2\2\2;\u00f4\3\2\2\2=\u00f7\3\2\2\2?\u00fa\3\2\2\2A\u0100"+
		"\3\2\2\2C\u0105\3\2\2\2E\u010a\3\2\2\2G\u0110\3\2\2\2I\u0119\3\2\2\2K"+
		"\u0121\3\2\2\2M\u0127\3\2\2\2O\u012c\3\2\2\2Q\u0138\3\2\2\2S\u013c\3\2"+
		"\2\2U\u0141\3\2\2\2W\u0144\3\2\2\2Y\u0149\3\2\2\2[\u014c\3\2\2\2]\u0153"+
		"\3\2\2\2_\u015d\3\2\2\2a\u0161\3\2\2\2c\u0169\3\2\2\2e\u016f\3\2\2\2g"+
		"\u0176\3\2\2\2i\u017d\3\2\2\2k\u0184\3\2\2\2m\u018b\3\2\2\2o\u0190\3\2"+
		"\2\2q\u0194\3\2\2\2s\u0197\3\2\2\2u\u019a\3\2\2\2w\u019c\3\2\2\2y\u019e"+
		"\3\2\2\2{\u01a0\3\2\2\2}\u01a2\3\2\2\2\177\u01ab\3\2\2\2\u0081\u01c4\3"+
		"\2\2\2\u0083\u01c7\3\2\2\2\u0085\u01cb\3\2\2\2\u0087\u01e1\3\2\2\2\u0089"+
		"\u01e3\3\2\2\2\u008b\u01e5\3\2\2\2\u008d\u01e7\3\2\2\2\u008f\u01ef\3\2"+
		"\2\2\u0091\u01fb\3\2\2\2\u0093\u01fe\3\2\2\2\u0095\u0200\3\2\2\2\u0097"+
		"\u0206\3\2\2\2\u0099\u0208\3\2\2\2\u009b\u020d\3\2\2\2\u009d\u0215\3\2"+
		"\2\2\u009f\u0217\3\2\2\2\u00a1\u0221\3\2\2\2\u00a3\u022d\3\2\2\2\u00a5"+
		"\u022f\3\2\2\2\u00a7\u023a\3\2\2\2\u00a9\u0240\3\2\2\2\u00ab\u0251\3\2"+
		"\2\2\u00ad\u0253\3\2\2\2\u00af\u0261\3\2\2\2\u00b1\u00b2\7*\2\2\u00b2"+
		"\4\3\2\2\2\u00b3\u00b4\7]\2\2\u00b4\6\3\2\2\2\u00b5\u00b6\7}\2\2\u00b6"+
		"\b\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8\n\3\2\2\2\u00b9\u00ba\7.\2\2\u00ba"+
		"\f\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7<\2\2\u00be"+
		"\u00bf\7?\2\2\u00bf\20\3\2\2\2\u00c0\u00c1\7\60\2\2\u00c1\22\3\2\2\2\u00c2"+
		"\u00c3\7\60\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\7\60\2\2\u00c5\24\3\2"+
		"\2\2\u00c6\u00c7\7<\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc\u00cd\7?\2\2\u00cd\32"+
		"\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\34\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1"+
		"\u00d2\7?\2\2\u00d2\36\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4 \3\2\2\2\u00d5"+
		"\u00d6\7@\2\2\u00d6\u00d7\7?\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9"+
		"$\3\2\2\2\u00da\u00db\7/\2\2\u00db&\3\2\2\2\u00dc\u00dd\7~\2\2\u00dd("+
		"\3\2\2\2\u00de\u00df\7`\2\2\u00df*\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1"+
		",\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3.\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5"+
		"\u00e6\7>\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8\u00e9\7@\2\2\u00e9"+
		"\62\3\2\2\2\u00ea\u00eb\7(\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7(\2\2\u00ed"+
		"\u00ee\7`\2\2\u00ee\66\3\2\2\2\u00ef\u00f0\7#\2\2\u00f08\3\2\2\2\u00f1"+
		"\u00f2\7>\2\2\u00f2\u00f3\7/\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7~\2\2\u00f5"+
		"\u00f6\7~\2\2\u00f6<\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\7(\2\2\u00f9"+
		">\3\2\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7g\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7m\2\2\u00ff@\3\2\2\2\u0100\u0101\7e\2\2\u0101"+
		"\u0102\7c\2\2\u0102\u0103\7u\2\2\u0103\u0104\7g\2\2\u0104B\3\2\2\2\u0105"+
		"\u0106\7e\2\2\u0106\u0107\7j\2\2\u0107\u0108\7c\2\2\u0108\u0109\7p\2\2"+
		"\u0109D\3\2\2\2\u010a\u010b\7e\2\2\u010b\u010c\7q\2\2\u010c\u010d\7p\2"+
		"\2\u010d\u010e\7u\2\2\u010e\u010f\7v\2\2\u010fF\3\2\2\2\u0110\u0111\7"+
		"e\2\2\u0111\u0112\7q\2\2\u0112\u0113\7p\2\2\u0113\u0114\7v\2\2\u0114\u0115"+
		"\7k\2\2\u0115\u0116\7p\2\2\u0116\u0117\7w\2\2\u0117\u0118\7g\2\2\u0118"+
		"H\3\2\2\2\u0119\u011a\7f\2\2\u011a\u011b\7g\2\2\u011b\u011c\7h\2\2\u011c"+
		"\u011d\7c\2\2\u011d\u011e\7w\2\2\u011e\u011f\7n\2\2\u011f\u0120\7v\2\2"+
		"\u0120J\3\2\2\2\u0121\u0122\7f\2\2\u0122\u0123\7g\2\2\u0123\u0124\7h\2"+
		"\2\u0124\u0125\7g\2\2\u0125\u0126\7t\2\2\u0126L\3\2\2\2\u0127\u0128\7"+
		"g\2\2\u0128\u0129\7n\2\2\u0129\u012a\7u\2\2\u012a\u012b\7g\2\2\u012bN"+
		"\3\2\2\2\u012c\u012d\7h\2\2\u012d\u012e\7c\2\2\u012e\u012f\7n\2\2\u012f"+
		"\u0130\7n\2\2\u0130\u0131\7v\2\2\u0131\u0132\7j\2\2\u0132\u0133\7t\2\2"+
		"\u0133\u0134\7q\2\2\u0134\u0135\7w\2\2\u0135\u0136\7i\2\2\u0136\u0137"+
		"\7j\2\2\u0137P\3\2\2\2\u0138\u0139\7h\2\2\u0139\u013a\7q\2\2\u013a\u013b"+
		"\7t\2\2\u013bR\3\2\2\2\u013c\u013d\7h\2\2\u013d\u013e\7w\2\2\u013e\u013f"+
		"\7p\2\2\u013f\u0140\7e\2\2\u0140T\3\2\2\2\u0141\u0142\7i\2\2\u0142\u0143"+
		"\7q\2\2\u0143V\3\2\2\2\u0144\u0145\7i\2\2\u0145\u0146\7q\2\2\u0146\u0147"+
		"\7v\2\2\u0147\u0148\7q\2\2\u0148X\3\2\2\2\u0149\u014a\7k\2\2\u014a\u014b"+
		"\7h\2\2\u014bZ\3\2\2\2\u014c\u014d\7k\2\2\u014d\u014e\7o\2\2\u014e\u014f"+
		"\7r\2\2\u014f\u0150\7q\2\2\u0150\u0151\7t\2\2\u0151\u0152\7v\2\2\u0152"+
		"\\\3\2\2\2\u0153\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155\u0156\7v\2\2\u0156"+
		"\u0157\7g\2\2\u0157\u0158\7t\2\2\u0158\u0159\7h\2\2\u0159\u015a\7c\2\2"+
		"\u015a\u015b\7e\2\2\u015b\u015c\7g\2\2\u015c^\3\2\2\2\u015d\u015e\7o\2"+
		"\2\u015e\u015f\7c\2\2\u015f\u0160\7r\2\2\u0160`\3\2\2\2\u0161\u0162\7"+
		"r\2\2\u0162\u0163\7c\2\2\u0163\u0164\7e\2\2\u0164\u0165\7m\2\2\u0165\u0166"+
		"\7c\2\2\u0166\u0167\7i\2\2\u0167\u0168\7g\2\2\u0168b\3\2\2\2\u0169\u016a"+
		"\7t\2\2\u016a\u016b\7c\2\2\u016b\u016c\7p\2\2\u016c\u016d\7i\2\2\u016d"+
		"\u016e\7g\2\2\u016ed\3\2\2\2\u016f\u0170\7t\2\2\u0170\u0171\7g\2\2\u0171"+
		"\u0172\7v\2\2\u0172\u0173\7w\2\2\u0173\u0174\7t\2\2\u0174\u0175\7p\2\2"+
		"\u0175f\3\2\2\2\u0176\u0177\7u\2\2\u0177\u0178\7g\2\2\u0178\u0179\7n\2"+
		"\2\u0179\u017a\7g\2\2\u017a\u017b\7e\2\2\u017b\u017c\7v\2\2\u017ch\3\2"+
		"\2\2\u017d\u017e\7u\2\2\u017e\u017f\7v\2\2\u017f\u0180\7t\2\2\u0180\u0181"+
		"\7w\2\2\u0181\u0182\7e\2\2\u0182\u0183\7v\2\2\u0183j\3\2\2\2\u0184\u0185"+
		"\7u\2\2\u0185\u0186\7y\2\2\u0186\u0187\7k\2\2\u0187\u0188\7v\2\2\u0188"+
		"\u0189\7e\2\2\u0189\u018a\7j\2\2\u018al\3\2\2\2\u018b\u018c\7v\2\2\u018c"+
		"\u018d\7{\2\2\u018d\u018e\7r\2\2\u018e\u018f\7g\2\2\u018fn\3\2\2\2\u0190"+
		"\u0191\7x\2\2\u0191\u0192\7c\2\2\u0192\u0193\7t\2\2\u0193p\3\2\2\2\u0194"+
		"\u0195\7-\2\2\u0195\u0196\7-\2\2\u0196r\3\2\2\2\u0197\u0198\7/\2\2\u0198"+
		"\u0199\7/\2\2\u0199t\3\2\2\2\u019a\u019b\7+\2\2\u019bv\3\2\2\2\u019c\u019d"+
		"\7_\2\2\u019dx\3\2\2\2\u019e\u019f\7\177\2\2\u019fz\3\2\2\2\u01a0\u01a1"+
		"\7=\2\2\u01a1|\3\2\2\2\u01a2\u01a6\t\2\2\2\u01a3\u01a5\t\3\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"~\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\5\u0083B\2\u01aa\u01ac\5\u0087"+
		"D\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\7k\2\2\u01ae\u0080\3\2\2\2\u01af\u01b3\t\4\2\2\u01b0\u01b2\t\5"+
		"\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01c5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ba\7\62"+
		"\2\2\u01b7\u01b9\t\6\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01c5\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01be\7\62\2\2\u01be\u01c0\t\7\2\2\u01bf\u01c1\t\b\2\2\u01c0"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01af\3\2\2\2\u01c4\u01b6\3\2\2\2\u01c4"+
		"\u01bd\3\2\2\2\u01c5\u0082\3\2\2\2\u01c6\u01c8\t\5\2\2\u01c7\u01c6\3\2"+
		"\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u0084\3\2\2\2\u01cb\u01cd\t\t\2\2\u01cc\u01ce\t\n\2\2\u01cd\u01cc\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\5\u0083B\2\u01d0"+
		"\u0086\3\2\2\2\u01d1\u01d2\5\u0083B\2\u01d2\u01d3\7\60\2\2\u01d3\u01d4"+
		"\5\u0083B\2\u01d4\u01d5\5\u0085C\2\u01d5\u01e2\3\2\2\2\u01d6\u01d7\5\u0083"+
		"B\2\u01d7\u01d8\7\60\2\2\u01d8\u01d9\5\u0083B\2\u01d9\u01e2\3\2\2\2\u01da"+
		"\u01db\5\u0083B\2\u01db\u01dc\5\u0085C\2\u01dc\u01e2\3\2\2\2\u01dd\u01de"+
		"\7\60\2\2\u01de\u01df\5\u0083B\2\u01df\u01e0\5\u0085C\2\u01e0\u01e2\3"+
		"\2\2\2\u01e1\u01d1\3\2\2\2\u01e1\u01d6\3\2\2\2\u01e1\u01da\3\2\2\2\u01e1"+
		"\u01dd\3\2\2\2\u01e2\u0088\3\2\2\2\u01e3\u01e4\t\b\2\2\u01e4\u008a\3\2"+
		"\2\2\u01e5\u01e6\t\6\2\2\u01e6\u008c\3\2\2\2\u01e7\u01e8\7^\2\2\u01e8"+
		"\u01e9\7w\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\5\u0089E\2\u01eb\u01ec\5"+
		"\u0089E\2\u01ec\u01ed\5\u0089E\2\u01ed\u01ee\5\u0089E\2\u01ee\u008e\3"+
		"\2\2\2\u01ef\u01f0\7^\2\2\u01f0\u01f1\7W\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\5\u0089E\2\u01f3\u01f4\5\u0089E\2\u01f4\u01f5\5\u0089E\2\u01f5"+
		"\u01f6\5\u0089E\2\u01f6\u01f7\5\u0089E\2\u01f7\u01f8\5\u0089E\2\u01f8"+
		"\u01f9\5\u0089E\2\u01f9\u01fa\5\u0089E\2\u01fa\u0090\3\2\2\2\u01fb\u01fc"+
		"\7^\2\2\u01fc\u01fd\t\13\2\2\u01fd\u0092\3\2\2\2\u01fe\u01ff\n\f\2\2\u01ff"+
		"\u0094\3\2\2\2\u0200\u0201\7\f\2\2\u0201\u0096\3\2\2\2\u0202\u0207\5\u0093"+
		"J\2\u0203\u0207\5\u008dG\2\u0204\u0207\5\u008fH\2\u0205\u0207\5\u0091"+
		"I\2\u0206\u0202\3\2\2\2\u0206\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0205\3\2\2\2\u0207\u0098\3\2\2\2\u0208\u0209\7^\2\2\u0209\u020a\5\u008b"+
		"F\2\u020a\u020b\5\u008bF\2\u020b\u020c\5\u008bF\2\u020c\u009a\3\2\2\2"+
		"\u020d\u020e\7^\2\2\u020e\u020f\7z\2\2\u020f\u0210\3\2\2\2\u0210\u0211"+
		"\5\u0089E\2\u0211\u0212\5\u0089E\2\u0212\u009c\3\2\2\2\u0213\u0216\5\u0099"+
		"M\2\u0214\u0216\5\u009bN\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216"+
		"\u009e\3\2\2\2\u0217\u021c\7)\2\2\u0218\u021b\5\u0093J\2\u0219\u021b\5"+
		"\u0095K\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2"+
		"\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021f\u0220\7)\2\2\u0220\u00a0\3\2\2\2\u0221\u0226\7$\2\2\u0222"+
		"\u0225\5\u0097L\2\u0223\u0225\5\u009dO\2\u0224\u0222\3\2\2\2\u0224\u0223"+
		"\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7$\2\2\u022a\u00a2\3\2"+
		"\2\2\u022b\u022e\5\u00a1Q\2\u022c\u022e\5\u009fP\2\u022d\u022b\3\2\2\2"+
		"\u022d\u022c\3\2\2\2\u022e\u00a4\3\2\2\2\u022f\u0234\7)\2\2\u0230\u0233"+
		"\5\u0097L\2\u0231\u0233\5\u009dO\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2"+
		"\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7)\2\2\u0238\u00a6\3\2"+
		"\2\2\u0239\u023b\t\r\2\2\u023a\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\bT"+
		"\2\2\u023f\u00a8\3\2\2\2\u0240\u0241\7\61\2\2\u0241\u0242\7\61\2\2\u0242"+
		"\u0246\3\2\2\2\u0243\u0245\n\16\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3"+
		"\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024a\bU\2\2\u024a\u00aa\3\2\2\2\u024b\u024d\7\17"+
		"\2\2\u024c\u024e\7\f\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0252\3\2\2\2\u024f\u0252\7\f\2\2\u0250\u0252\5\u00afX\2\u0251\u024b"+
		"\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0250\3\2\2\2\u0252\u00ac\3\2\2\2\u0253"+
		"\u0254\7\61\2\2\u0254\u0255\7,\2\2\u0255\u0259\3\2\2\2\u0256\u0258\n\16"+
		"\2\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\7,"+
		"\2\2\u025d\u025e\7\61\2\2\u025e\u025f\3\2\2\2\u025f\u0260\bW\2\2\u0260"+
		"\u00ae\3\2\2\2\u0261\u0262\7\61\2\2\u0262\u0263\7,\2\2\u0263\u0267\3\2"+
		"\2\2\u0264\u0266\13\2\2\2\u0265\u0264\3\2\2\2\u0266\u0269\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2"+
		"\2\2\u026a\u026b\7,\2\2\u026b\u026c\7\61\2\2\u026c\u00b0\3\2\2\2\33\2"+
		"\u01a6\u01ab\u01b3\u01ba\u01c2\u01c4\u01c9\u01cd\u01e1\u0206\u0215\u021a"+
		"\u021c\u0224\u0226\u022d\u0232\u0234\u023c\u0246\u024d\u0251\u0259\u0267"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}