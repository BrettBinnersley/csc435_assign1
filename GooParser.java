// Generated from Goo.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GooParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, BREAK=35, CASE=36, CHAN=37, CONST=38, CONTINUE=39, 
		DEFAULT=40, DEFER=41, ELSE=42, FALLTHROUGH=43, FOR=44, FUNC=45, GO=46, 
		GOTO=47, IF=48, IMPORT=49, INTERFACE=50, MAP=51, PACKAGE=52, RANGE=53, 
		RETURN=54, SELECT=55, STRUCT=56, SWITCH=57, TYPE=58, VAR=59, PLUSPLUS=60, 
		MINUSMINUS=61, RPAREN=62, RSQ=63, RBRACE=64, SEMI=65, Identifier=66, ImaginaryLit=67, 
		IntLit=68, FloatLit=69, StringLit=70, RuneLit=71, Whitespace=72, LineComment=73, 
		NL=74, BlockComment=75, BlockNLComment=76;
	public static final int
		RULE_type = 0, RULE_typeName = 1, RULE_typeLit = 2, RULE_arrayType = 3, 
		RULE_arrayLength = 4, RULE_elementType = 5, RULE_sliceType = 6, RULE_structType = 7, 
		RULE_fieldDeclList = 8, RULE_fieldDecl = 9, RULE_pointerType = 10, RULE_baseType = 11, 
		RULE_signature = 12, RULE_result = 13, RULE_parameters = 14, RULE_parameterList = 15, 
		RULE_parameterDecl = 16, RULE_methodName = 17, RULE_block = 18, RULE_statementList = 19, 
		RULE_declaration = 20, RULE_topLevelDeclList = 21, RULE_topLevelDecl = 22, 
		RULE_constDecl = 23, RULE_constSpecList = 24, RULE_constSpec = 25, RULE_identifierList = 26, 
		RULE_expressionList = 27, RULE_typeDecl = 28, RULE_typeSpecList = 29, 
		RULE_typeSpec = 30, RULE_varDecl = 31, RULE_varSpecList = 32, RULE_varSpec = 33, 
		RULE_varSpecRem = 34, RULE_shortVarDecl = 35, RULE_functionDecl = 36, 
		RULE_functionName = 37, RULE_function = 38, RULE_functionBody = 39, RULE_operand = 40, 
		RULE_literal = 41, RULE_basicLit = 42, RULE_operandName = 43, RULE_qualifiedIdent = 44, 
		RULE_compositeLit = 45, RULE_literalType = 46, RULE_literalValue = 47, 
		RULE_elementList = 48, RULE_element = 49, RULE_key = 50, RULE_fieldName = 51, 
		RULE_value = 52, RULE_primaryExpr = 53, RULE_selector = 54, RULE_index = 55, 
		RULE_slice = 56, RULE_typeAssertion = 57, RULE_arguments = 58, RULE_expression = 59, 
		RULE_unaryExpr = 60, RULE_conversion = 61, RULE_statement = 62, RULE_simpleStmt = 63, 
		RULE_forStmt = 64, RULE_condition = 65, RULE_forClause = 66, RULE_initStmt = 67, 
		RULE_postStmt = 68, RULE_rangeClause = 69, RULE_sourceFile = 70, RULE_packageClause = 71, 
		RULE_packageName = 72, RULE_importDeclList = 73, RULE_importDecl = 74, 
		RULE_importSpecList = 75, RULE_importSpec = 76, RULE_importPath = 77, 
		RULE_anything = 78, RULE_anyToken = 79;
	public static final String[] ruleNames = {
		"type", "typeName", "typeLit", "arrayType", "arrayLength", "elementType", 
		"sliceType", "structType", "fieldDeclList", "fieldDecl", "pointerType", 
		"baseType", "signature", "result", "parameters", "parameterList", "parameterDecl", 
		"methodName", "block", "statementList", "declaration", "topLevelDeclList", 
		"topLevelDecl", "constDecl", "constSpecList", "constSpec", "identifierList", 
		"expressionList", "typeDecl", "typeSpecList", "typeSpec", "varDecl", "varSpecList", 
		"varSpec", "varSpecRem", "shortVarDecl", "functionDecl", "functionName", 
		"function", "functionBody", "operand", "literal", "basicLit", "operandName", 
		"qualifiedIdent", "compositeLit", "literalType", "literalValue", "elementList", 
		"element", "key", "fieldName", "value", "primaryExpr", "selector", "index", 
		"slice", "typeAssertion", "arguments", "expression", "unaryExpr", "conversion", 
		"statement", "simpleStmt", "forStmt", "condition", "forClause", "initStmt", 
		"postStmt", "rangeClause", "sourceFile", "packageClause", "packageName", 
		"importDeclList", "importDecl", "importSpecList", "importSpec", "importPath", 
		"anything", "anyToken"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "'{'", "'*'", "','", "'='", "':='", "'.'", "'...'", 
		"':'", "'EXPAND ME TO ONE OR MORE RULES 1'", "'EXPAND ME TO ONE OR MORE RULES 2'", 
		"'EXPAND ME TO ONE OR MORE RULES 3'", "'EXPAND ME TO ONE OR MORE RULES 4'", 
		"'EXPAND ME TO ONE OR MORE RULES 5'", "'&&'", "'||'", "'=='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'|'", "'^'", "'/'", "'%'", 
		"'<<'", "'>>'", "'&'", "'&^'", "'!'", "'break'", "'case'", "'chan'", "'const'", 
		"'continue'", "'default'", "'defer'", "'else'", "'fallthrough'", "'for'", 
		"'func'", "'go'", "'goto'", "'if'", "'import'", "'interface'", "'map'", 
		"'package'", "'range'", "'return'", "'select'", "'struct'", "'switch'", 
		"'type'", "'var'", "'++'", "'--'", "')'", "']'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "BREAK", 
		"CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", 
		"FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", 
		"RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "PLUSPLUS", 
		"MINUSMINUS", "RPAREN", "RSQ", "RBRACE", "SEMI", "Identifier", "ImaginaryLit", 
		"IntLit", "FloatLit", "StringLit", "RuneLit", "Whitespace", "LineComment", 
		"NL", "BlockComment", "BlockNLComment"
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
	public String getGrammarFileName() { return "Goo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GooParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				typeName();
				}
				break;
			case T__1:
			case T__3:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				typeLit();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__0);
				setState(163);
				type();
				setState(164);
				match(RPAREN);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeName);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				qualifiedIdent();
				}
				break;
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

	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeLit(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeLit);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				sliceType();
				}
				break;
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__1);
			setState(179);
			arrayLength();
			setState(180);
			match(RSQ);
			setState(181);
			elementType();
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitArrayLength(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expression();
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

	public static class ElementTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitElementType(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			type();
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

	public static class SliceTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSliceType(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__1);
			setState(188);
			match(RSQ);
			setState(189);
			elementType();
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

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GooParser.STRUCT, 0); }
		public FieldDeclListContext fieldDeclList() {
			return getRuleContext(FieldDeclListContext.class,0);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitStructType(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(STRUCT);
			setState(192);
			match(T__2);
			setState(193);
			fieldDeclList(0);
			setState(194);
			match(RBRACE);
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

	public static class FieldDeclListContext extends ParserRuleContext {
		public FieldDeclListContext fieldDeclList() {
			return getRuleContext(FieldDeclListContext.class,0);
		}
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
		}
		public FieldDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFieldDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFieldDeclList(this);
		}
	}

	public final FieldDeclListContext fieldDeclList() throws RecognitionException {
		return fieldDeclList(0);
	}

	private FieldDeclListContext fieldDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldDeclListContext _localctx = new FieldDeclListContext(_ctx, _parentState);
		FieldDeclListContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_fieldDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fieldDeclList);
					setState(197);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(198);
					fieldDecl();
					setState(199);
					match(SEMI);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFieldDecl(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			identifierList(0);
			setState(207);
			type();
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

	public static class PointerTypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPointerType(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__3);
			setState(210);
			baseType();
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBaseType(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			type();
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

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			parameters();
			setState(216);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				setState(215);
				result();
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

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_result);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				type();
				}
				break;
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

	public static class ParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__0);
			setState(227);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				setState(223);
				parameterList(0);
				setState(225);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(224);
					match(T__4);
					}
				}

				}
			}

			setState(229);
			match(RPAREN);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclContext parameterDecl() {
			return getRuleContext(ParameterDeclContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			parameterDecl();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(234);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(235);
					match(T__4);
					setState(236);
					parameterDecl();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(242);
				identifierList(0);
				}
				break;
			}
			setState(245);
			type();
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(Identifier);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__2);
			setState(250);
			statementList(0);
			setState(251);
			match(RBRACE);
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		return statementList(0);
	}

	private StatementListContext statementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementListContext _localctx = new StatementListContext(_ctx, _parentState);
		StatementListContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_statementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(254);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(255);
					statement();
					setState(256);
					match(SEMI);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				varDecl();
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

	public static class TopLevelDeclListContext extends ParserRuleContext {
		public TopLevelDeclListContext topLevelDeclList() {
			return getRuleContext(TopLevelDeclListContext.class,0);
		}
		public TopLevelDeclContext topLevelDecl() {
			return getRuleContext(TopLevelDeclContext.class,0);
		}
		public TopLevelDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTopLevelDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTopLevelDeclList(this);
		}
	}

	public final TopLevelDeclListContext topLevelDeclList() throws RecognitionException {
		return topLevelDeclList(0);
	}

	private TopLevelDeclListContext topLevelDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TopLevelDeclListContext _localctx = new TopLevelDeclListContext(_ctx, _parentState);
		TopLevelDeclListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_topLevelDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TopLevelDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_topLevelDeclList);
					setState(269);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(270);
					topLevelDecl();
					setState(271);
					match(SEMI);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TopLevelDeclContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTopLevelDecl(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_topLevelDecl);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case CONST:
			case TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				declaration();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				functionDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GooParser.CONST, 0); }
		public ConstSpecContext constSpec() {
			return getRuleContext(ConstSpecContext.class,0);
		}
		public ConstSpecListContext constSpecList() {
			return getRuleContext(ConstSpecListContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constDecl);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(CONST);
				setState(283);
				constSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(CONST);
				setState(285);
				match(T__0);
				setState(286);
				constSpecList(0);
				setState(287);
				match(RPAREN);
				}
				break;
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

	public static class ConstSpecListContext extends ParserRuleContext {
		public ConstSpecListContext constSpecList() {
			return getRuleContext(ConstSpecListContext.class,0);
		}
		public ConstSpecContext constSpec() {
			return getRuleContext(ConstSpecContext.class,0);
		}
		public ConstSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterConstSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitConstSpecList(this);
		}
	}

	public final ConstSpecListContext constSpecList() throws RecognitionException {
		return constSpecList(0);
	}

	private ConstSpecListContext constSpecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstSpecListContext _localctx = new ConstSpecListContext(_ctx, _parentState);
		ConstSpecListContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_constSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constSpecList);
					setState(292);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(293);
					constSpec();
					setState(294);
					match(SEMI);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterConstSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitConstSpec(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			identifierList(0);
			setState(307);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				setState(303);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT))) != 0) || _la==Identifier) {
					{
					setState(302);
					type();
					}
				}

				setState(305);
				match(T__5);
				setState(306);
				expressionList(0);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(312);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(313);
					match(T__4);
					setState(314);
					match(Identifier);
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(321);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(323);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(324);
					match(T__4);
					setState(325);
					expression();
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GooParser.TYPE, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TypeSpecListContext typeSpecList() {
			return getRuleContext(TypeSpecListContext.class,0);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeDecl(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeDecl);
		try {
			setState(338);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(TYPE);
				setState(332);
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(TYPE);
				setState(334);
				match(T__0);
				setState(335);
				typeSpecList(0);
				setState(336);
				match(RPAREN);
				}
				break;
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

	public static class TypeSpecListContext extends ParserRuleContext {
		public TypeSpecListContext typeSpecList() {
			return getRuleContext(TypeSpecListContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TypeSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeSpecList(this);
		}
	}

	public final TypeSpecListContext typeSpecList() throws RecognitionException {
		return typeSpecList(0);
	}

	private TypeSpecListContext typeSpecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecListContext _localctx = new TypeSpecListContext(_ctx, _parentState);
		TypeSpecListContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_typeSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecList);
					setState(341);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(342);
					typeSpec();
					setState(343);
					match(SEMI);
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeSpec(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(Identifier);
			setState(351);
			type();
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GooParser.VAR, 0); }
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarSpecListContext varSpecList() {
			return getRuleContext(VarSpecListContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_varDecl);
		try {
			setState(360);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(VAR);
				setState(354);
				varSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(VAR);
				setState(356);
				match(T__0);
				setState(357);
				varSpecList(0);
				setState(358);
				match(RPAREN);
				}
				break;
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

	public static class VarSpecListContext extends ParserRuleContext {
		public VarSpecListContext varSpecList() {
			return getRuleContext(VarSpecListContext.class,0);
		}
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterVarSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitVarSpecList(this);
		}
	}

	public final VarSpecListContext varSpecList() throws RecognitionException {
		return varSpecList(0);
	}

	private VarSpecListContext varSpecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarSpecListContext _localctx = new VarSpecListContext(_ctx, _parentState);
		VarSpecListContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_varSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varSpecList);
					setState(363);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(364);
					varSpec();
					setState(365);
					match(SEMI);
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VarSpecRemContext varSpecRem() {
			return getRuleContext(VarSpecRemContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitVarSpec(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			identifierList(0);
			setState(373);
			varSpecRem();
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

	public static class VarSpecRemContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecRemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpecRem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterVarSpecRem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitVarSpecRem(this);
		}
	}

	public final VarSpecRemContext varSpecRem() throws RecognitionException {
		VarSpecRemContext _localctx = new VarSpecRemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_varSpecRem);
		try {
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				type();
				setState(377);
				match(T__5);
				setState(378);
				expressionList(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(T__5);
				setState(381);
				expressionList(0);
				}
				break;
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

	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterShortVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitShortVarDecl(this);
		}
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			identifierList(0);
			setState(385);
			match(T__6);
			setState(386);
			expressionList(0);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GooParser.FUNC, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionDecl);
		try {
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(FUNC);
				setState(389);
				functionName();
				setState(390);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(FUNC);
				setState(393);
				functionName();
				setState(394);
				signature();
				}
				break;
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(Identifier);
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

	public static class FunctionContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			signature();
			setState(401);
			functionBody();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			block();
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operand);
		try {
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(T__0);
				setState(408);
				expression();
				setState(409);
				match(RPAREN);
				}
				break;
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

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(415);
			switch (_input.LA(1)) {
			case IntLit:
			case FloatLit:
			case StringLit:
			case RuneLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				basicLit();
				}
				break;
			case T__1:
			case STRUCT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				compositeLit();
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

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode IntLit() { return getToken(GooParser.IntLit, 0); }
		public TerminalNode FloatLit() { return getToken(GooParser.FloatLit, 0); }
		public TerminalNode RuneLit() { return getToken(GooParser.RuneLit, 0); }
		public TerminalNode StringLit() { return getToken(GooParser.StringLit, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBasicLit(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_basicLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (IntLit - 68)) | (1L << (FloatLit - 68)) | (1L << (StringLit - 68)) | (1L << (RuneLit - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitOperandName(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_operandName);
		try {
			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				qualifiedIdent();
				}
				break;
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

	public static class QualifiedIdentContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitQualifiedIdent(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			packageName();
			setState(424);
			match(T__7);
			setState(425);
			match(Identifier);
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

	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterCompositeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitCompositeLit(this);
		}
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			literalType();
			setState(428);
			literalValue();
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

	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLiteralType(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literalType);
		try {
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(T__1);
				setState(433);
				match(T__8);
				setState(434);
				match(RSQ);
				setState(435);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				typeName();
				}
				break;
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

	public static class LiteralValueContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLiteralValue(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literalValue);
		int _la;
		try {
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(T__2);
				setState(441);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(T__2);
				setState(443);
				elementList(0);
				setState(445);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(444);
					match(T__4);
					}
				}

				setState(447);
				match(RBRACE);
				}
				break;
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

	public static class ElementListContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		return elementList(0);
	}

	private ElementListContext elementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElementListContext _localctx = new ElementListContext(_ctx, _parentState);
		ElementListContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_elementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(452);
			element();
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElementListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_elementList);
					setState(454);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(455);
					match(T__4);
					setState(456);
					element();
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_element);
		try {
			setState(467);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				key();
				setState(464);
				match(T__9);
				setState(465);
				value();
				}
				break;
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

	public static class KeyContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_key);
		try {
			setState(472);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				fieldName();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				expression();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				literalValue();
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(Identifier);
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

	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_value);
		try {
			setState(478);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				expression();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				literalValue();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_primaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__10);
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__7);
			setState(483);
			match(Identifier);
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

	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__1);
			setState(486);
			expression();
			setState(487);
			match(RSQ);
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

	public static class SliceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSlice(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_slice);
		int _la;
		try {
			setState(508);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(T__1);
				setState(491);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(490);
					expression();
					}
				}

				setState(493);
				match(T__9);
				setState(495);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(494);
					expression();
					}
				}

				setState(497);
				match(RSQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(T__1);
				setState(500);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(499);
					expression();
					}
				}

				setState(502);
				match(T__9);
				setState(503);
				expression();
				setState(504);
				match(T__9);
				setState(505);
				expression();
				setState(506);
				match(RSQ);
				}
				break;
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

	public static class TypeAssertionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterTypeAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitTypeAssertion(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(T__7);
			setState(511);
			match(T__0);
			setState(512);
			type();
			setState(513);
			match(RPAREN);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arguments);
		int _la;
		try {
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(T__0);
				setState(516);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(T__0);
				setState(518);
				expressionList(0);
				setState(520);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(519);
					match(T__4);
					}
				}

				setState(522);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(T__0);
				setState(525);
				type();
				setState(527);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(526);
					match(T__4);
					}
				}

				setState(529);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				match(T__0);
				setState(532);
				type();
				setState(533);
				match(T__4);
				setState(534);
				expressionList(0);
				setState(536);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(535);
					match(T__4);
					}
				}

				setState(538);
				match(RPAREN);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(T__11);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__12);
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

	public static class ConversionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitConversion(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			type();
			setState(547);
			match(T__0);
			setState(548);
			expression();
			setState(550);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(549);
				match(T__4);
				}
			}

			setState(552);
			match(RPAREN);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__13);
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSimpleStmt(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_simpleStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(T__14);
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GooParser.FOR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_forStmt);
		try {
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(FOR);
				setState(559);
				condition();
				setState(560);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(FOR);
				setState(563);
				forClause();
				setState(564);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				match(FOR);
				setState(567);
				rangeClause();
				setState(568);
				block();
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			expression();
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

	public static class ForClauseContext extends ParserRuleContext {
		public InitStmtContext initStmt() {
			return getRuleContext(InitStmtContext.class,0);
		}
		public PostStmtContext postStmt() {
			return getRuleContext(PostStmtContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitForClause(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			initStmt();
			setState(575);
			match(SEMI);
			setState(577);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(576);
				condition();
				}
			}

			setState(579);
			match(SEMI);
			setState(580);
			postStmt();
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

	public static class InitStmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public InitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterInitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitInitStmt(this);
		}
	}

	public final InitStmtContext initStmt() throws RecognitionException {
		InitStmtContext _localctx = new InitStmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_initStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			simpleStmt();
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

	public static class PostStmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public PostStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPostStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPostStmt(this);
		}
	}

	public final PostStmtContext postStmt() throws RecognitionException {
		PostStmtContext _localctx = new PostStmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_postStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			simpleStmt();
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

	public static class RangeClauseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(GooParser.RANGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitRangeClause(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_rangeClause);
		try {
			setState(596);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				expressionList(0);
				setState(587);
				match(T__5);
				setState(588);
				match(RANGE);
				setState(589);
				expression();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				identifierList(0);
				setState(592);
				match(T__6);
				setState(593);
				match(RANGE);
				setState(594);
				expression();
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

	public static class SourceFileContext extends ParserRuleContext {
		public PackageClauseContext packageClause() {
			return getRuleContext(PackageClauseContext.class,0);
		}
		public ImportDeclListContext importDeclList() {
			return getRuleContext(ImportDeclListContext.class,0);
		}
		public TopLevelDeclListContext topLevelDeclList() {
			return getRuleContext(TopLevelDeclListContext.class,0);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitSourceFile(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_sourceFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			packageClause();
			setState(599);
			match(SEMI);
			setState(600);
			importDeclList(0);
			setState(601);
			topLevelDeclList(0);
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

	public static class PackageClauseContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(GooParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPackageClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPackageClause(this);
		}
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(PACKAGE);
			setState(604);
			packageName();
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(Identifier);
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

	public static class ImportDeclListContext extends ParserRuleContext {
		public ImportDeclListContext importDeclList() {
			return getRuleContext(ImportDeclListContext.class,0);
		}
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public ImportDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportDeclList(this);
		}
	}

	public final ImportDeclListContext importDeclList() throws RecognitionException {
		return importDeclList(0);
	}

	private ImportDeclListContext importDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImportDeclListContext _localctx = new ImportDeclListContext(_ctx, _parentState);
		ImportDeclListContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_importDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImportDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_importDeclList);
					setState(609);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(610);
					importDecl();
					setState(611);
					match(SEMI);
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(GooParser.IMPORT, 0); }
		public ImportSpecContext importSpec() {
			return getRuleContext(ImportSpecContext.class,0);
		}
		public ImportSpecListContext importSpecList() {
			return getRuleContext(ImportSpecListContext.class,0);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportDecl(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_importDecl);
		try {
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(IMPORT);
				setState(619);
				importSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(IMPORT);
				setState(621);
				match(T__0);
				setState(622);
				importSpecList(0);
				setState(623);
				match(RPAREN);
				}
				break;
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

	public static class ImportSpecListContext extends ParserRuleContext {
		public ImportSpecListContext importSpecList() {
			return getRuleContext(ImportSpecListContext.class,0);
		}
		public ImportSpecContext importSpec() {
			return getRuleContext(ImportSpecContext.class,0);
		}
		public ImportSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportSpecList(this);
		}
	}

	public final ImportSpecListContext importSpecList() throws RecognitionException {
		return importSpecList(0);
	}

	private ImportSpecListContext importSpecList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImportSpecListContext _localctx = new ImportSpecListContext(_ctx, _parentState);
		ImportSpecListContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_importSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImportSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_importSpecList);
					setState(628);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(629);
					importSpec();
					setState(630);
					match(SEMI);
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ImportSpecContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportSpec(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_importSpec);
		try {
			setState(643);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(T__7);
				setState(638);
				importPath();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				packageName();
				setState(640);
				importPath();
				}
				break;
			case StringLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				importPath();
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

	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode StringLit() { return getToken(GooParser.StringLit, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitImportPath(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(StringLit);
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

	public static class AnythingContext extends ParserRuleContext {
		public List<AnyTokenContext> anyToken() {
			return getRuleContexts(AnyTokenContext.class);
		}
		public AnyTokenContext anyToken(int i) {
			return getRuleContext(AnyTokenContext.class,i);
		}
		public AnythingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anything; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAnything(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAnything(this);
		}
	}

	public final AnythingContext anything() throws RecognitionException {
		AnythingContext _localctx = new AnythingContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << BREAK) | (1L << CASE) | (1L << CHAN) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DEFER) | (1L << ELSE) | (1L << FALLTHROUGH) | (1L << FOR) | (1L << FUNC) | (1L << GO) | (1L << GOTO) | (1L << IF) | (1L << IMPORT) | (1L << INTERFACE) | (1L << MAP) | (1L << PACKAGE) | (1L << RANGE) | (1L << RETURN) | (1L << SELECT) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPE) | (1L << VAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << RPAREN) | (1L << RSQ))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (Identifier - 64)) | (1L << (ImaginaryLit - 64)) | (1L << (IntLit - 64)) | (1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)) | (1L << (Whitespace - 64)) | (1L << (LineComment - 64)) | (1L << (NL - 64)) | (1L << (BlockComment - 64)) | (1L << (BlockNLComment - 64)))) != 0)) {
				{
				{
				setState(647);
				anyToken();
				}
				}
				setState(652);
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

	public static class AnyTokenContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GooParser.BREAK, 0); }
		public TerminalNode CASE() { return getToken(GooParser.CASE, 0); }
		public TerminalNode CHAN() { return getToken(GooParser.CHAN, 0); }
		public TerminalNode CONST() { return getToken(GooParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(GooParser.CONTINUE, 0); }
		public TerminalNode DEFAULT() { return getToken(GooParser.DEFAULT, 0); }
		public TerminalNode DEFER() { return getToken(GooParser.DEFER, 0); }
		public TerminalNode ELSE() { return getToken(GooParser.ELSE, 0); }
		public TerminalNode FALLTHROUGH() { return getToken(GooParser.FALLTHROUGH, 0); }
		public TerminalNode FOR() { return getToken(GooParser.FOR, 0); }
		public TerminalNode FUNC() { return getToken(GooParser.FUNC, 0); }
		public TerminalNode GO() { return getToken(GooParser.GO, 0); }
		public TerminalNode GOTO() { return getToken(GooParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(GooParser.IF, 0); }
		public TerminalNode IMPORT() { return getToken(GooParser.IMPORT, 0); }
		public TerminalNode INTERFACE() { return getToken(GooParser.INTERFACE, 0); }
		public TerminalNode MAP() { return getToken(GooParser.MAP, 0); }
		public TerminalNode PACKAGE() { return getToken(GooParser.PACKAGE, 0); }
		public TerminalNode RANGE() { return getToken(GooParser.RANGE, 0); }
		public TerminalNode RETURN() { return getToken(GooParser.RETURN, 0); }
		public TerminalNode SELECT() { return getToken(GooParser.SELECT, 0); }
		public TerminalNode STRUCT() { return getToken(GooParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(GooParser.SWITCH, 0); }
		public TerminalNode TYPE() { return getToken(GooParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(GooParser.VAR, 0); }
		public TerminalNode PLUSPLUS() { return getToken(GooParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(GooParser.MINUSMINUS, 0); }
		public TerminalNode RPAREN() { return getToken(GooParser.RPAREN, 0); }
		public TerminalNode RSQ() { return getToken(GooParser.RSQ, 0); }
		public TerminalNode RBRACE() { return getToken(GooParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(GooParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public TerminalNode ImaginaryLit() { return getToken(GooParser.ImaginaryLit, 0); }
		public TerminalNode IntLit() { return getToken(GooParser.IntLit, 0); }
		public TerminalNode FloatLit() { return getToken(GooParser.FloatLit, 0); }
		public TerminalNode StringLit() { return getToken(GooParser.StringLit, 0); }
		public TerminalNode RuneLit() { return getToken(GooParser.RuneLit, 0); }
		public TerminalNode Whitespace() { return getToken(GooParser.Whitespace, 0); }
		public TerminalNode LineComment() { return getToken(GooParser.LineComment, 0); }
		public TerminalNode NL() { return getToken(GooParser.NL, 0); }
		public TerminalNode BlockComment() { return getToken(GooParser.BlockComment, 0); }
		public TerminalNode BlockNLComment() { return getToken(GooParser.BlockNLComment, 0); }
		public AnyTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAnyToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAnyToken(this);
		}
	}

	public final AnyTokenContext anyToken() throws RecognitionException {
		AnyTokenContext _localctx = new AnyTokenContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_anyToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << BREAK) | (1L << CASE) | (1L << CHAN) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DEFER) | (1L << ELSE) | (1L << FALLTHROUGH) | (1L << FOR) | (1L << FUNC) | (1L << GO) | (1L << GOTO) | (1L << IF) | (1L << IMPORT) | (1L << INTERFACE) | (1L << MAP) | (1L << PACKAGE) | (1L << RANGE) | (1L << RETURN) | (1L << SELECT) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPE) | (1L << VAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << RPAREN) | (1L << RSQ))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (Identifier - 64)) | (1L << (ImaginaryLit - 64)) | (1L << (IntLit - 64)) | (1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)) | (1L << (Whitespace - 64)) | (1L << (LineComment - 64)) | (1L << (NL - 64)) | (1L << (BlockComment - 64)) | (1L << (BlockNLComment - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return fieldDeclList_sempred((FieldDeclListContext)_localctx, predIndex);
		case 15:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 19:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 21:
			return topLevelDeclList_sempred((TopLevelDeclListContext)_localctx, predIndex);
		case 24:
			return constSpecList_sempred((ConstSpecListContext)_localctx, predIndex);
		case 26:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 27:
			return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 29:
			return typeSpecList_sempred((TypeSpecListContext)_localctx, predIndex);
		case 32:
			return varSpecList_sempred((VarSpecListContext)_localctx, predIndex);
		case 48:
			return elementList_sempred((ElementListContext)_localctx, predIndex);
		case 73:
			return importDeclList_sempred((ImportDeclListContext)_localctx, predIndex);
		case 75:
			return importSpecList_sempred((ImportSpecListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fieldDeclList_sempred(FieldDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean topLevelDeclList_sempred(TopLevelDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean constSpecList_sempred(ConstSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecList_sempred(TypeSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean varSpecList_sempred(VarSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean elementList_sempred(ElementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean importDeclList_sempred(ImportDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean importSpecList_sempred(ImportSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3N\u0292\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\u00a9\n\2\3\3\3\3\5\3\u00ad\n\3\3\4\3\4\3\4\3\4\5\4\u00b3\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00db\n\16\3\17\3\17\5\17\u00df"+
		"\n\17\3\20\3\20\3\20\5\20\u00e4\n\20\5\20\u00e6\n\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00f0\n\21\f\21\16\21\u00f3\13\21\3\22\5"+
		"\22\u00f6\n\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0105\n\25\f\25\16\25\u0108\13\25\3\26\3\26\3\26\5\26"+
		"\u010d\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u0114\n\27\f\27\16\27\u0117"+
		"\13\27\3\30\3\30\5\30\u011b\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u0124\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u012b\n\32\f\32\16\32\u012e"+
		"\13\32\3\33\3\33\5\33\u0132\n\33\3\33\3\33\5\33\u0136\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u013e\n\34\f\34\16\34\u0141\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\7\35\u0149\n\35\f\35\16\35\u014c\13\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0155\n\36\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u015c\n\37\f\37\16\37\u015f\13\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u016b"+
		"\n!\3\"\3\"\3\"\3\"\3\"\7\"\u0172\n\"\f\"\16\"\u0175\13\"\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\5$\u0181\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u018f\n&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\5*\u019e\n*\3+\3+\5"+
		"+\u01a2\n+\3,\3,\3-\3-\5-\u01a8\n-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u01b9\n\60\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u01c0\n\61\3\61\3\61\5\61\u01c4\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7"+
		"\62\u01cc\n\62\f\62\16\62\u01cf\13\62\3\63\3\63\3\63\3\63\3\63\5\63\u01d6"+
		"\n\63\3\64\3\64\3\64\5\64\u01db\n\64\3\65\3\65\3\66\3\66\5\66\u01e1\n"+
		"\66\3\67\3\67\38\38\38\39\39\39\39\3:\3:\5:\u01ee\n:\3:\3:\5:\u01f2\n"+
		":\3:\3:\3:\5:\u01f7\n:\3:\3:\3:\3:\3:\3:\5:\u01ff\n:\3;\3;\3;\3;\3;\3"+
		"<\3<\3<\3<\3<\5<\u020b\n<\3<\3<\3<\3<\3<\5<\u0212\n<\3<\3<\3<\3<\3<\3"+
		"<\3<\5<\u021b\n<\3<\3<\5<\u021f\n<\3=\3=\3>\3>\3?\3?\3?\3?\5?\u0229\n"+
		"?\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u023d\nB\3"+
		"C\3C\3D\3D\3D\5D\u0244\nD\3D\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\5G\u0257\nG\3H\3H\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3K\3K\3K\7K\u0268"+
		"\nK\fK\16K\u026b\13K\3L\3L\3L\3L\3L\3L\3L\5L\u0274\nL\3M\3M\3M\3M\3M\7"+
		"M\u027b\nM\fM\16M\u027e\13M\3N\3N\3N\3N\3N\3N\5N\u0286\nN\3O\3O\3P\7P"+
		"\u028b\nP\fP\16P\u028e\13P\3Q\3Q\3Q\2\16\22 (,\62\668<Bb\u0094\u0098R"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\2\4\3\2F"+
		"I\4\2\3\f\22N\u0284\2\u00a8\3\2\2\2\4\u00ac\3\2\2\2\6\u00b2\3\2\2\2\b"+
		"\u00b4\3\2\2\2\n\u00b9\3\2\2\2\f\u00bb\3\2\2\2\16\u00bd\3\2\2\2\20\u00c1"+
		"\3\2\2\2\22\u00c6\3\2\2\2\24\u00d0\3\2\2\2\26\u00d3\3\2\2\2\30\u00d6\3"+
		"\2\2\2\32\u00d8\3\2\2\2\34\u00de\3\2\2\2\36\u00e0\3\2\2\2 \u00e9\3\2\2"+
		"\2\"\u00f5\3\2\2\2$\u00f9\3\2\2\2&\u00fb\3\2\2\2(\u00ff\3\2\2\2*\u010c"+
		"\3\2\2\2,\u010e\3\2\2\2.\u011a\3\2\2\2\60\u0123\3\2\2\2\62\u0125\3\2\2"+
		"\2\64\u012f\3\2\2\2\66\u0137\3\2\2\28\u0142\3\2\2\2:\u0154\3\2\2\2<\u0156"+
		"\3\2\2\2>\u0160\3\2\2\2@\u016a\3\2\2\2B\u016c\3\2\2\2D\u0176\3\2\2\2F"+
		"\u0180\3\2\2\2H\u0182\3\2\2\2J\u018e\3\2\2\2L\u0190\3\2\2\2N\u0192\3\2"+
		"\2\2P\u0195\3\2\2\2R\u019d\3\2\2\2T\u01a1\3\2\2\2V\u01a3\3\2\2\2X\u01a7"+
		"\3\2\2\2Z\u01a9\3\2\2\2\\\u01ad\3\2\2\2^\u01b8\3\2\2\2`\u01c3\3\2\2\2"+
		"b\u01c5\3\2\2\2d\u01d5\3\2\2\2f\u01da\3\2\2\2h\u01dc\3\2\2\2j\u01e0\3"+
		"\2\2\2l\u01e2\3\2\2\2n\u01e4\3\2\2\2p\u01e7\3\2\2\2r\u01fe\3\2\2\2t\u0200"+
		"\3\2\2\2v\u021e\3\2\2\2x\u0220\3\2\2\2z\u0222\3\2\2\2|\u0224\3\2\2\2~"+
		"\u022c\3\2\2\2\u0080\u022e\3\2\2\2\u0082\u023c\3\2\2\2\u0084\u023e\3\2"+
		"\2\2\u0086\u0240\3\2\2\2\u0088\u0248\3\2\2\2\u008a\u024a\3\2\2\2\u008c"+
		"\u0256\3\2\2\2\u008e\u0258\3\2\2\2\u0090\u025d\3\2\2\2\u0092\u0260\3\2"+
		"\2\2\u0094\u0262\3\2\2\2\u0096\u0273\3\2\2\2\u0098\u0275\3\2\2\2\u009a"+
		"\u0285\3\2\2\2\u009c\u0287\3\2\2\2\u009e\u028c\3\2\2\2\u00a0\u028f\3\2"+
		"\2\2\u00a2\u00a9\5\4\3\2\u00a3\u00a9\5\6\4\2\u00a4\u00a5\7\3\2\2\u00a5"+
		"\u00a6\5\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a2\3\2"+
		"\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\3\3\2\2\2\u00aa\u00ad"+
		"\7D\2\2\u00ab\u00ad\5Z.\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\5\3\2\2\2\u00ae\u00b3\5\b\5\2\u00af\u00b3\5\20\t\2\u00b0\u00b3\5\26\f"+
		"\2\u00b1\u00b3\5\16\b\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\7\3\2\2\2\u00b4\u00b5\7\4\2\2"+
		"\u00b5\u00b6\5\n\6\2\u00b6\u00b7\7A\2\2\u00b7\u00b8\5\f\7\2\u00b8\t\3"+
		"\2\2\2\u00b9\u00ba\5x=\2\u00ba\13\3\2\2\2\u00bb\u00bc\5\2\2\2\u00bc\r"+
		"\3\2\2\2\u00bd\u00be\7\4\2\2\u00be\u00bf\7A\2\2\u00bf\u00c0\5\f\7\2\u00c0"+
		"\17\3\2\2\2\u00c1\u00c2\7:\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\5\22\n"+
		"\2\u00c4\u00c5\7B\2\2\u00c5\21\3\2\2\2\u00c6\u00cd\b\n\1\2\u00c7\u00c8"+
		"\f\3\2\2\u00c8\u00c9\5\24\13\2\u00c9\u00ca\7C\2\2\u00ca\u00cc\3\2\2\2"+
		"\u00cb\u00c7\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\23\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\5\66\34\2\u00d1"+
		"\u00d2\5\2\2\2\u00d2\25\3\2\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\5\30\r"+
		"\2\u00d5\27\3\2\2\2\u00d6\u00d7\5\2\2\2\u00d7\31\3\2\2\2\u00d8\u00da\5"+
		"\36\20\2\u00d9\u00db\5\34\17\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\33\3\2\2\2\u00dc\u00df\5\36\20\2\u00dd\u00df\5\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\35\3\2\2\2\u00e0\u00e5\7\3\2\2\u00e1"+
		"\u00e3\5 \21\2\u00e2\u00e4\7\7\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\b\21\1"+
		"\2\u00ea\u00eb\5\"\22\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\f\3\2\2\u00ed"+
		"\u00ee\7\7\2\2\u00ee\u00f0\5\"\22\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2!\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f6\5\66\34\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00f8\5\2\2\2\u00f8#\3\2\2\2\u00f9\u00fa\7"+
		"D\2\2\u00fa%\3\2\2\2\u00fb\u00fc\7\5\2\2\u00fc\u00fd\5(\25\2\u00fd\u00fe"+
		"\7B\2\2\u00fe\'\3\2\2\2\u00ff\u0106\b\25\1\2\u0100\u0101\f\3\2\2\u0101"+
		"\u0102\5~@\2\u0102\u0103\7C\2\2\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2"+
		"\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107)"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010d\5\60\31\2\u010a\u010d\5:\36\2"+
		"\u010b\u010d\5@!\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d+\3\2\2\2\u010e\u0115\b\27\1\2\u010f\u0110\f\3\2\2\u0110"+
		"\u0111\5.\30\2\u0111\u0112\7C\2\2\u0112\u0114\3\2\2\2\u0113\u010f\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"-\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011b\5*\26\2\u0119\u011b\5J&\2\u011a"+
		"\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b/\3\2\2\2\u011c\u011d\7(\2\2\u011d"+
		"\u0124\5\64\33\2\u011e\u011f\7(\2\2\u011f\u0120\7\3\2\2\u0120\u0121\5"+
		"\62\32\2\u0121\u0122\7@\2\2\u0122\u0124\3\2\2\2\u0123\u011c\3\2\2\2\u0123"+
		"\u011e\3\2\2\2\u0124\61\3\2\2\2\u0125\u012c\b\32\1\2\u0126\u0127\f\3\2"+
		"\2\u0127\u0128\5\64\33\2\u0128\u0129\7C\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\63\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0135\5\66\34\2\u0130"+
		"\u0132\5\2\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0134\7\b\2\2\u0134\u0136\58\35\2\u0135\u0131\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\65\3\2\2\2\u0137\u0138\b\34\1\2\u0138\u0139\7D\2"+
		"\2\u0139\u013f\3\2\2\2\u013a\u013b\f\3\2\2\u013b\u013c\7\7\2\2\u013c\u013e"+
		"\7D\2\2\u013d\u013a\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\67\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\b\35\1"+
		"\2\u0143\u0144\5x=\2\u0144\u014a\3\2\2\2\u0145\u0146\f\3\2\2\u0146\u0147"+
		"\7\7\2\2\u0147\u0149\5x=\2\u0148\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b9\3\2\2\2\u014c\u014a\3\2\2\2"+
		"\u014d\u014e\7<\2\2\u014e\u0155\5> \2\u014f\u0150\7<\2\2\u0150\u0151\7"+
		"\3\2\2\u0151\u0152\5<\37\2\u0152\u0153\7@\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u014d\3\2\2\2\u0154\u014f\3\2\2\2\u0155;\3\2\2\2\u0156\u015d\b\37\1\2"+
		"\u0157\u0158\f\3\2\2\u0158\u0159\5> \2\u0159\u015a\7C\2\2\u015a\u015c"+
		"\3\2\2\2\u015b\u0157\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e=\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7D\2\2\u0161"+
		"\u0162\5\2\2\2\u0162?\3\2\2\2\u0163\u0164\7=\2\2\u0164\u016b\5D#\2\u0165"+
		"\u0166\7=\2\2\u0166\u0167\7\3\2\2\u0167\u0168\5B\"\2\u0168\u0169\7@\2"+
		"\2\u0169\u016b\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u0165\3\2\2\2\u016bA"+
		"\3\2\2\2\u016c\u0173\b\"\1\2\u016d\u016e\f\3\2\2\u016e\u016f\5D#\2\u016f"+
		"\u0170\7C\2\2\u0170\u0172\3\2\2\2\u0171\u016d\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174C\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0176\u0177\5\66\34\2\u0177\u0178\5F$\2\u0178E\3\2\2\2\u0179"+
		"\u0181\5\2\2\2\u017a\u017b\5\2\2\2\u017b\u017c\7\b\2\2\u017c\u017d\58"+
		"\35\2\u017d\u0181\3\2\2\2\u017e\u017f\7\b\2\2\u017f\u0181\58\35\2\u0180"+
		"\u0179\3\2\2\2\u0180\u017a\3\2\2\2\u0180\u017e\3\2\2\2\u0181G\3\2\2\2"+
		"\u0182\u0183\5\66\34\2\u0183\u0184\7\t\2\2\u0184\u0185\58\35\2\u0185I"+
		"\3\2\2\2\u0186\u0187\7/\2\2\u0187\u0188\5L\'\2\u0188\u0189\5N(\2\u0189"+
		"\u018f\3\2\2\2\u018a\u018b\7/\2\2\u018b\u018c\5L\'\2\u018c\u018d\5\32"+
		"\16\2\u018d\u018f\3\2\2\2\u018e\u0186\3\2\2\2\u018e\u018a\3\2\2\2\u018f"+
		"K\3\2\2\2\u0190\u0191\7D\2\2\u0191M\3\2\2\2\u0192\u0193\5\32\16\2\u0193"+
		"\u0194\5P)\2\u0194O\3\2\2\2\u0195\u0196\5&\24\2\u0196Q\3\2\2\2\u0197\u019e"+
		"\5T+\2\u0198\u019e\5X-\2\u0199\u019a\7\3\2\2\u019a\u019b\5x=\2\u019b\u019c"+
		"\7@\2\2\u019c\u019e\3\2\2\2\u019d\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019d"+
		"\u0199\3\2\2\2\u019eS\3\2\2\2\u019f\u01a2\5V,\2\u01a0\u01a2\5\\/\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2U\3\2\2\2\u01a3\u01a4\t\2\2\2"+
		"\u01a4W\3\2\2\2\u01a5\u01a8\7D\2\2\u01a6\u01a8\5Z.\2\u01a7\u01a5\3\2\2"+
		"\2\u01a7\u01a6\3\2\2\2\u01a8Y\3\2\2\2\u01a9\u01aa\5\u0092J\2\u01aa\u01ab"+
		"\7\n\2\2\u01ab\u01ac\7D\2\2\u01ac[\3\2\2\2\u01ad\u01ae\5^\60\2\u01ae\u01af"+
		"\5`\61\2\u01af]\3\2\2\2\u01b0\u01b9\5\20\t\2\u01b1\u01b9\5\b\5\2\u01b2"+
		"\u01b3\7\4\2\2\u01b3\u01b4\7\13\2\2\u01b4\u01b5\7A\2\2\u01b5\u01b9\5\f"+
		"\7\2\u01b6\u01b9\5\16\b\2\u01b7\u01b9\5\4\3\2\u01b8\u01b0\3\2\2\2\u01b8"+
		"\u01b1\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2"+
		"\2\2\u01b9_\3\2\2\2\u01ba\u01bb\7\5\2\2\u01bb\u01c4\7B\2\2\u01bc\u01bd"+
		"\7\5\2\2\u01bd\u01bf\5b\62\2\u01be\u01c0\7\7\2\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\7B\2\2\u01c2\u01c4\3\2"+
		"\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01bc\3\2\2\2\u01c4a\3\2\2\2\u01c5\u01c6"+
		"\b\62\1\2\u01c6\u01c7\5d\63\2\u01c7\u01cd\3\2\2\2\u01c8\u01c9\f\3\2\2"+
		"\u01c9\u01ca\7\7\2\2\u01ca\u01cc\5d\63\2\u01cb\u01c8\3\2\2\2\u01cc\u01cf"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01cec\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d6\5j\66\2\u01d1\u01d2\5f\64\2\u01d2\u01d3\7\f"+
		"\2\2\u01d3\u01d4\5j\66\2\u01d4\u01d6\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5"+
		"\u01d1\3\2\2\2\u01d6e\3\2\2\2\u01d7\u01db\5h\65\2\u01d8\u01db\5x=\2\u01d9"+
		"\u01db\5`\61\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01dbg\3\2\2\2\u01dc\u01dd\7D\2\2\u01ddi\3\2\2\2\u01de\u01e1\5x="+
		"\2\u01df\u01e1\5`\61\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1k"+
		"\3\2\2\2\u01e2\u01e3\7\r\2\2\u01e3m\3\2\2\2\u01e4\u01e5\7\n\2\2\u01e5"+
		"\u01e6\7D\2\2\u01e6o\3\2\2\2\u01e7\u01e8\7\4\2\2\u01e8\u01e9\5x=\2\u01e9"+
		"\u01ea\7A\2\2\u01eaq\3\2\2\2\u01eb\u01ed\7\4\2\2\u01ec\u01ee\5x=\2\u01ed"+
		"\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\7\f"+
		"\2\2\u01f0\u01f2\5x=\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01ff\7A\2\2\u01f4\u01f6\7\4\2\2\u01f5\u01f7\5x=\2\u01f6"+
		"\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7\f"+
		"\2\2\u01f9\u01fa\5x=\2\u01fa\u01fb\7\f\2\2\u01fb\u01fc\5x=\2\u01fc\u01fd"+
		"\7A\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01eb\3\2\2\2\u01fe\u01f4\3\2\2\2\u01ff"+
		"s\3\2\2\2\u0200\u0201\7\n\2\2\u0201\u0202\7\3\2\2\u0202\u0203\5\2\2\2"+
		"\u0203\u0204\7@\2\2\u0204u\3\2\2\2\u0205\u0206\7\3\2\2\u0206\u021f\7@"+
		"\2\2\u0207\u0208\7\3\2\2\u0208\u020a\58\35\2\u0209\u020b\7\7\2\2\u020a"+
		"\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7@"+
		"\2\2\u020d\u021f\3\2\2\2\u020e\u020f\7\3\2\2\u020f\u0211\5\2\2\2\u0210"+
		"\u0212\7\7\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0214\7@\2\2\u0214\u021f\3\2\2\2\u0215\u0216\7\3\2\2\u0216"+
		"\u0217\5\2\2\2\u0217\u0218\7\7\2\2\u0218\u021a\58\35\2\u0219\u021b\7\7"+
		"\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021d\7@\2\2\u021d\u021f\3\2\2\2\u021e\u0205\3\2\2\2\u021e\u0207\3\2"+
		"\2\2\u021e\u020e\3\2\2\2\u021e\u0215\3\2\2\2\u021fw\3\2\2\2\u0220\u0221"+
		"\7\16\2\2\u0221y\3\2\2\2\u0222\u0223\7\17\2\2\u0223{\3\2\2\2\u0224\u0225"+
		"\5\2\2\2\u0225\u0226\7\3\2\2\u0226\u0228\5x=\2\u0227\u0229\7\7\2\2\u0228"+
		"\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7@"+
		"\2\2\u022b}\3\2\2\2\u022c\u022d\7\20\2\2\u022d\177\3\2\2\2\u022e\u022f"+
		"\7\21\2\2\u022f\u0081\3\2\2\2\u0230\u0231\7.\2\2\u0231\u0232\5\u0084C"+
		"\2\u0232\u0233\5&\24\2\u0233\u023d\3\2\2\2\u0234\u0235\7.\2\2\u0235\u0236"+
		"\5\u0086D\2\u0236\u0237\5&\24\2\u0237\u023d\3\2\2\2\u0238\u0239\7.\2\2"+
		"\u0239\u023a\5\u008cG\2\u023a\u023b\5&\24\2\u023b\u023d\3\2\2\2\u023c"+
		"\u0230\3\2\2\2\u023c\u0234\3\2\2\2\u023c\u0238\3\2\2\2\u023d\u0083\3\2"+
		"\2\2\u023e\u023f\5x=\2\u023f\u0085\3\2\2\2\u0240\u0241\5\u0088E\2\u0241"+
		"\u0243\7C\2\2\u0242\u0244\5\u0084C\2\u0243\u0242\3\2\2\2\u0243\u0244\3"+
		"\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\7C\2\2\u0246\u0247\5\u008aF\2\u0247"+
		"\u0087\3\2\2\2\u0248\u0249\5\u0080A\2\u0249\u0089\3\2\2\2\u024a\u024b"+
		"\5\u0080A\2\u024b\u008b\3\2\2\2\u024c\u024d\58\35\2\u024d\u024e\7\b\2"+
		"\2\u024e\u024f\7\67\2\2\u024f\u0250\5x=\2\u0250\u0257\3\2\2\2\u0251\u0252"+
		"\5\66\34\2\u0252\u0253\7\t\2\2\u0253\u0254\7\67\2\2\u0254\u0255\5x=\2"+
		"\u0255\u0257\3\2\2\2\u0256\u024c\3\2\2\2\u0256\u0251\3\2\2\2\u0257\u008d"+
		"\3\2\2\2\u0258\u0259\5\u0090I\2\u0259\u025a\7C\2\2\u025a\u025b\5\u0094"+
		"K\2\u025b\u025c\5,\27\2\u025c\u008f\3\2\2\2\u025d\u025e\7\66\2\2\u025e"+
		"\u025f\5\u0092J\2\u025f\u0091\3\2\2\2\u0260\u0261\7D\2\2\u0261\u0093\3"+
		"\2\2\2\u0262\u0269\bK\1\2\u0263\u0264\f\3\2\2\u0264\u0265\5\u0096L\2\u0265"+
		"\u0266\7C\2\2\u0266\u0268\3\2\2\2\u0267\u0263\3\2\2\2\u0268\u026b\3\2"+
		"\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0095\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026d\7\63\2\2\u026d\u0274\5\u009aN\2\u026e\u026f"+
		"\7\63\2\2\u026f\u0270\7\3\2\2\u0270\u0271\5\u0098M\2\u0271\u0272\7@\2"+
		"\2\u0272\u0274\3\2\2\2\u0273\u026c\3\2\2\2\u0273\u026e\3\2\2\2\u0274\u0097"+
		"\3\2\2\2\u0275\u027c\bM\1\2\u0276\u0277\f\3\2\2\u0277\u0278\5\u009aN\2"+
		"\u0278\u0279\7C\2\2\u0279\u027b\3\2\2\2\u027a\u0276\3\2\2\2\u027b\u027e"+
		"\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0099\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027f\u0280\7\n\2\2\u0280\u0286\5\u009cO\2\u0281\u0282"+
		"\5\u0092J\2\u0282\u0283\5\u009cO\2\u0283\u0286\3\2\2\2\u0284\u0286\5\u009c"+
		"O\2\u0285\u027f\3\2\2\2\u0285\u0281\3\2\2\2\u0285\u0284\3\2\2\2\u0286"+
		"\u009b\3\2\2\2\u0287\u0288\7H\2\2\u0288\u009d\3\2\2\2\u0289\u028b\5\u00a0"+
		"Q\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u009f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\t\3"+
		"\2\2\u0290\u00a1\3\2\2\2\67\u00a8\u00ac\u00b2\u00cd\u00da\u00de\u00e3"+
		"\u00e5\u00f1\u00f5\u0106\u010c\u0115\u011a\u0123\u012c\u0131\u0135\u013f"+
		"\u014a\u0154\u015d\u016a\u0173\u0180\u018e\u019d\u01a1\u01a7\u01b8\u01bf"+
		"\u01c3\u01cd\u01d5\u01da\u01e0\u01ed\u01f1\u01f6\u01fe\u020a\u0211\u021a"+
		"\u021e\u0228\u023c\u0243\u0256\u0269\u0273\u027c\u0285\u028c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}