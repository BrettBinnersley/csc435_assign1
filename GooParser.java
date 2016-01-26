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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, BREAK=30, CASE=31, CHAN=32, 
		CONST=33, CONTINUE=34, DEFAULT=35, DEFER=36, ELSE=37, FALLTHROUGH=38, 
		FOR=39, FUNC=40, GO=41, GOTO=42, IF=43, IMPORT=44, INTERFACE=45, MAP=46, 
		PACKAGE=47, RANGE=48, RETURN=49, SELECT=50, STRUCT=51, SWITCH=52, TYPE=53, 
		VAR=54, PLUSPLUS=55, MINUSMINUS=56, RPAREN=57, RSQ=58, RBRACE=59, SEMI=60, 
		Identifier=61, ImaginaryLit=62, IntLit=63, FloatLit=64, StringLit=65, 
		RuneLit=66, Whitespace=67, LineComment=68, NL=69, BlockComment=70, BlockNLComment=71;
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
		RULE_value = 52, RULE_functionLit = 53, RULE_primaryExpr = 54, RULE_selector = 55, 
		RULE_index = 56, RULE_slice = 57, RULE_typeAssertion = 58, RULE_arguments = 59, 
		RULE_expression = 60, RULE_unaryExpr = 61, RULE_binaryOp = 62, RULE_relOp = 63, 
		RULE_addOp = 64, RULE_mulOp = 65, RULE_unaryOp = 66, RULE_conversion = 67, 
		RULE_statement = 68, RULE_simpleStmt = 69, RULE_emptyStmt = 70, RULE_labeledStmt = 71, 
		RULE_label = 72, RULE_expressionStmt = 73, RULE_incDecStmt = 74, RULE_assignment = 75, 
		RULE_assignOp = 76, RULE_ifStmt = 77, RULE_forStmt = 78, RULE_condition = 79, 
		RULE_forClause = 80, RULE_initStmt = 81, RULE_postStmt = 82, RULE_rangeClause = 83, 
		RULE_goStmt = 84, RULE_returnStmt = 85, RULE_breakStmt = 86, RULE_continueStmt = 87, 
		RULE_gotoStmt = 88, RULE_sourceFile = 89, RULE_packageClause = 90, RULE_packageName = 91, 
		RULE_importDeclList = 92, RULE_importDecl = 93, RULE_importSpecList = 94, 
		RULE_importSpec = 95, RULE_importPath = 96, RULE_anything = 97, RULE_anyToken = 98;
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
		"element", "key", "fieldName", "value", "functionLit", "primaryExpr", 
		"selector", "index", "slice", "typeAssertion", "arguments", "expression", 
		"unaryExpr", "binaryOp", "relOp", "addOp", "mulOp", "unaryOp", "conversion", 
		"statement", "simpleStmt", "emptyStmt", "labeledStmt", "label", "expressionStmt", 
		"incDecStmt", "assignment", "assignOp", "ifStmt", "forStmt", "condition", 
		"forClause", "initStmt", "postStmt", "rangeClause", "goStmt", "returnStmt", 
		"breakStmt", "continueStmt", "gotoStmt", "sourceFile", "packageClause", 
		"packageName", "importDeclList", "importDecl", "importSpecList", "importSpec", 
		"importPath", "anything", "anyToken"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "'{'", "'*'", "','", "'='", "':='", "'.'", "'...'", 
		"':'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", 
		"'-'", "'|'", "'^'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&^'", "'!'", 
		"'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", "'defer'", 
		"'else'", "'fallthrough'", "'for'", "'func'", "'go'", "'goto'", "'if'", 
		"'import'", "'interface'", "'map'", "'package'", "'range'", "'return'", 
		"'select'", "'struct'", "'switch'", "'type'", "'var'", "'++'", "'--'", 
		"')'", "']'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BREAK", "CASE", "CHAN", "CONST", 
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
			setState(204);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				typeName();
				}
				break;
			case T__1:
			case T__3:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				typeLit();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__0);
				setState(201);
				type();
				setState(202);
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
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
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
			setState(216);
			match(T__1);
			setState(217);
			arrayLength();
			setState(218);
			match(RSQ);
			setState(219);
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
			setState(221);
			expression(0);
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
			setState(223);
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
			setState(225);
			match(T__1);
			setState(226);
			match(RSQ);
			setState(227);
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
			setState(229);
			match(STRUCT);
			setState(230);
			match(T__2);
			setState(231);
			fieldDeclList(0);
			setState(232);
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
			setState(241);
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
					setState(235);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(236);
					fieldDecl();
					setState(237);
					match(SEMI);
					}
					} 
				}
				setState(243);
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
			setState(244);
			identifierList(0);
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
			setState(247);
			match(T__3);
			setState(248);
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
			setState(250);
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
			setState(252);
			parameters();
			setState(254);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
				{
				setState(253);
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
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
			setState(260);
			match(T__0);
			setState(265);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
				{
				setState(261);
				parameterList(0);
				setState(263);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(262);
					match(T__4);
					}
				}

				}
			}

			setState(267);
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
			setState(270);
			parameterDecl();
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
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
					setState(272);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(273);
					match(T__4);
					setState(274);
					parameterDecl();
					}
					} 
				}
				setState(279);
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
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(280);
				identifierList(0);
				}
				break;
			}
			setState(283);
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
			setState(285);
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
			setState(287);
			match(T__2);
			setState(288);
			statementList(0);
			setState(289);
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
			setState(298);
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
					setState(292);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(293);
					statement();
					setState(294);
					match(SEMI);
					}
					} 
				}
				setState(300);
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
			setState(304);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
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
			setState(313);
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
					setState(307);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(308);
					topLevelDecl();
					setState(309);
					match(SEMI);
					}
					} 
				}
				setState(315);
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
			setState(318);
			switch (_input.LA(1)) {
			case CONST:
			case TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				declaration();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
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
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(CONST);
				setState(321);
				constSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(CONST);
				setState(323);
				match(T__0);
				setState(324);
				constSpecList(0);
				setState(325);
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
			setState(336);
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
					setState(330);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(331);
					constSpec();
					setState(332);
					match(SEMI);
					}
					} 
				}
				setState(338);
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
			setState(339);
			identifierList(0);
			setState(345);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
				{
				setState(341);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
					{
					setState(340);
					type();
					}
				}

				setState(343);
				match(T__5);
				setState(344);
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
			setState(348);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
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
					setState(350);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(351);
					match(T__4);
					setState(352);
					match(Identifier);
					}
					} 
				}
				setState(357);
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
			setState(359);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
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
					setState(361);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(362);
					match(T__4);
					setState(363);
					expression(0);
					}
					} 
				}
				setState(368);
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
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(TYPE);
				setState(370);
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(TYPE);
				setState(372);
				match(T__0);
				setState(373);
				typeSpecList(0);
				setState(374);
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
			setState(385);
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
					setState(379);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(380);
					typeSpec();
					setState(381);
					match(SEMI);
					}
					} 
				}
				setState(387);
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
			setState(388);
			match(Identifier);
			setState(389);
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
			setState(398);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(VAR);
				setState(392);
				varSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(VAR);
				setState(394);
				match(T__0);
				setState(395);
				varSpecList(0);
				setState(396);
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
			setState(407);
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
					setState(401);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(402);
					varSpec();
					setState(403);
					match(SEMI);
					}
					} 
				}
				setState(409);
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
			setState(410);
			identifierList(0);
			setState(411);
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
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				type();
				setState(415);
				match(T__5);
				setState(416);
				expressionList(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(T__5);
				setState(419);
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
			setState(422);
			identifierList(0);
			setState(423);
			match(T__6);
			setState(424);
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
			setState(434);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(FUNC);
				setState(427);
				functionName();
				setState(428);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(FUNC);
				setState(431);
				functionName();
				setState(432);
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
			setState(436);
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
			setState(438);
			signature();
			setState(439);
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
			setState(441);
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
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(T__0);
				setState(446);
				expression(0);
				setState(447);
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
		public FunctionLitContext functionLit() {
			return getRuleContext(FunctionLitContext.class,0);
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
			setState(454);
			switch (_input.LA(1)) {
			case IntLit:
			case FloatLit:
			case StringLit:
			case RuneLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				basicLit();
				}
				break;
			case T__1:
			case STRUCT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				compositeLit();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				functionLit();
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
			setState(456);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (IntLit - 63)) | (1L << (FloatLit - 63)) | (1L << (StringLit - 63)) | (1L << (RuneLit - 63)))) != 0)) ) {
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
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
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
			setState(462);
			packageName();
			setState(463);
			match(T__7);
			setState(464);
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
			setState(466);
			literalType();
			setState(467);
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
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(T__1);
				setState(472);
				match(T__8);
				setState(473);
				match(RSQ);
				setState(474);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
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
			setState(488);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(T__2);
				setState(480);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(T__2);
				setState(482);
				elementList(0);
				setState(484);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(483);
					match(T__4);
					}
				}

				setState(486);
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
			setState(491);
			element();
			}
			_ctx.stop = _input.LT(-1);
			setState(498);
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
					setState(493);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(494);
					match(T__4);
					setState(495);
					element();
					}
					} 
				}
				setState(500);
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
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				key();
				setState(503);
				match(T__9);
				setState(504);
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
			setState(511);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				fieldName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				literalValue();
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
			setState(513);
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
			setState(517);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__3:
			case T__18:
			case T__19:
			case T__21:
			case T__26:
			case T__28:
			case FUNC:
			case STRUCT:
			case Identifier:
			case IntLit:
			case FloatLit:
			case StringLit:
			case RuneLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				expression(0);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
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

	public static class FunctionLitContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterFunctionLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitFunctionLit(this);
		}
	}

	public final FunctionLitContext functionLit() throws RecognitionException {
		FunctionLitContext _localctx = new FunctionLitContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(FUNC);
			setState(520);
			function();
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
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(523);
				operand();
				}
				break;
			case 2:
				{
				setState(524);
				conversion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(537);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(527);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(528);
						selector();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(529);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(530);
						index();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(531);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(532);
						slice();
						}
						break;
					case 4:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(533);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(534);
						typeAssertion();
						}
						break;
					case 5:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(535);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(536);
						arguments();
						}
						break;
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 110, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(T__7);
			setState(543);
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
		enterRule(_localctx, 112, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__1);
			setState(546);
			expression(0);
			setState(547);
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
		enterRule(_localctx, 114, RULE_slice);
		int _la;
		try {
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(T__1);
				setState(551);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << FUNC) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
					{
					setState(550);
					expression(0);
					}
				}

				setState(553);
				match(T__9);
				setState(555);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << FUNC) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
					{
					setState(554);
					expression(0);
					}
				}

				setState(557);
				match(RSQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(T__1);
				setState(560);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << FUNC) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
					{
					setState(559);
					expression(0);
					}
				}

				setState(562);
				match(T__9);
				setState(563);
				expression(0);
				setState(564);
				match(T__9);
				setState(565);
				expression(0);
				setState(566);
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
		enterRule(_localctx, 116, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T__7);
			setState(571);
			match(T__0);
			setState(572);
			type();
			setState(573);
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
		enterRule(_localctx, 118, RULE_arguments);
		int _la;
		try {
			setState(600);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				match(T__0);
				setState(576);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				match(T__0);
				setState(578);
				expressionList(0);
				setState(580);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(579);
					match(T__4);
					}
				}

				setState(582);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(T__0);
				setState(585);
				type();
				setState(587);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(586);
					match(T__4);
					}
				}

				setState(589);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(T__0);
				setState(592);
				type();
				setState(593);
				match(T__4);
				setState(594);
				expressionList(0);
				setState(596);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(595);
					match(T__4);
					}
				}

				setState(598);
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
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(603);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(605);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(606);
					binaryOp();
					setState(607);
					expression(2);
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
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
		enterRule(_localctx, 122, RULE_unaryExpr);
		try {
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				primaryExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				unaryOp();
				setState(616);
				unaryExpr();
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

	public static class BinaryOpContext extends ParserRuleContext {
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public MulOpContext mulOp() {
			return getRuleContext(MulOpContext.class,0);
		}
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBinaryOp(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_binaryOp);
		try {
			setState(625);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(T__11);
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				relOp();
				}
				break;
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				addOp();
				}
				break;
			case T__3:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(624);
				mulOp();
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

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitRelOp(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAddOp(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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

	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitMulOp(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitUnaryOp(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28))) != 0)) ) {
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
		enterRule(_localctx, 134, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			type();
			setState(636);
			match(T__0);
			setState(637);
			expression(0);
			setState(639);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(638);
				match(T__4);
				}
			}

			setState(641);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public GoStmtContext goStmt() {
			return getRuleContext(GoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_statement);
		try {
			setState(654);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				goStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(647);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(648);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(649);
				continueStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(650);
				gotoStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(651);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(652);
				ifStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(653);
				forStmt();
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_simpleStmt);
		try {
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				emptyStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				expressionStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				incDecStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(659);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(660);
				shortVarDecl();
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

	public static class EmptyStmtContext extends ParserRuleContext {
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitEmptyStmt(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class LabeledStmtContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLabeledStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLabeledStmt(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			label();
			setState(666);
			match(T__9);
			setState(667);
			statement();
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
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

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitExpressionStmt(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			expression(0);
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

	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitIncDecStmt(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			expression(0);
			setState(674);
			_la = _input.LA(1);
			if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			expressionList(0);
			setState(677);
			assignOp();
			setState(678);
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

	public static class AssignOpContext extends ParserRuleContext {
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public MulOpContext mulOp() {
			return getRuleContext(MulOpContext.class,0);
		}
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assignOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				{
				setState(680);
				addOp();
				}
				break;
			case T__3:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				{
				setState(681);
				mulOp();
				}
				break;
			case T__5:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(684);
			match(T__5);
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(IF);
			setState(690);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(687);
				simpleStmt();
				setState(688);
				match(SEMI);
				}
				break;
			}
			setState(692);
			expression(0);
			setState(693);
			block();
			setState(699);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(694);
				match(ELSE);
				setState(697);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(695);
					ifStmt();
					}
					break;
				case T__2:
					{
					setState(696);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		enterRule(_localctx, 156, RULE_forStmt);
		try {
			setState(713);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(FOR);
				setState(702);
				condition();
				setState(703);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(FOR);
				setState(706);
				forClause();
				setState(707);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				match(FOR);
				setState(710);
				rangeClause();
				setState(711);
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
		enterRule(_localctx, 158, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			expression(0);
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
		enterRule(_localctx, 160, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			initStmt();
			setState(718);
			match(SEMI);
			setState(720);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << FUNC) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
				{
				setState(719);
				condition();
				}
			}

			setState(722);
			match(SEMI);
			setState(723);
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
		enterRule(_localctx, 162, RULE_initStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
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
		enterRule(_localctx, 164, RULE_postStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		enterRule(_localctx, 166, RULE_rangeClause);
		try {
			setState(739);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				expressionList(0);
				setState(730);
				match(T__5);
				setState(731);
				match(RANGE);
				setState(732);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				identifierList(0);
				setState(735);
				match(T__6);
				setState(736);
				match(RANGE);
				setState(737);
				expression(0);
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

	public static class GoStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterGoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitGoStmt(this);
		}
	}

	public final GoStmtContext goStmt() throws RecognitionException {
		GoStmtContext _localctx = new GoStmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_goStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(GO);
			setState(742);
			expression(0);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GooParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(RETURN);
			setState(746);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << FUNC) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)))) != 0)) {
				{
				setState(745);
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GooParser.BREAK, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitBreakStmt(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(BREAK);
			setState(750);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(749);
				label();
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GooParser.CONTINUE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitContinueStmt(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(CONTINUE);
			setState(754);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(753);
				label();
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

	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(GooParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GooListener ) ((GooListener)listener).exitGotoStmt(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(GOTO);
			setState(757);
			label();
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
		enterRule(_localctx, 178, RULE_sourceFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			packageClause();
			setState(760);
			match(SEMI);
			setState(761);
			importDeclList(0);
			setState(762);
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
		enterRule(_localctx, 180, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(PACKAGE);
			setState(765);
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
		enterRule(_localctx, 182, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
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
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_importDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImportDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_importDeclList);
					setState(770);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(771);
					importDecl();
					setState(772);
					match(SEMI);
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 186, RULE_importDecl);
		try {
			setState(786);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(IMPORT);
				setState(780);
				importSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(IMPORT);
				setState(782);
				match(T__0);
				setState(783);
				importSpecList(0);
				setState(784);
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
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_importSpecList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImportSpecListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_importSpecList);
					setState(789);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(790);
					importSpec();
					setState(791);
					match(SEMI);
					}
					} 
				}
				setState(797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		enterRule(_localctx, 190, RULE_importSpec);
		try {
			setState(804);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(T__7);
				setState(799);
				importPath();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				packageName();
				setState(801);
				importPath();
				}
				break;
			case StringLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
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
		enterRule(_localctx, 192, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
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
		enterRule(_localctx, 194, RULE_anything);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << BREAK) | (1L << CASE) | (1L << CHAN) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DEFER) | (1L << ELSE) | (1L << FALLTHROUGH) | (1L << FOR) | (1L << FUNC) | (1L << GO) | (1L << GOTO) | (1L << IF) | (1L << IMPORT) | (1L << INTERFACE) | (1L << MAP) | (1L << PACKAGE) | (1L << RANGE) | (1L << RETURN) | (1L << SELECT) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPE) | (1L << VAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << RPAREN) | (1L << RSQ) | (1L << RBRACE) | (1L << SEMI) | (1L << Identifier) | (1L << ImaginaryLit) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)) | (1L << (Whitespace - 64)) | (1L << (LineComment - 64)) | (1L << (NL - 64)) | (1L << (BlockComment - 64)) | (1L << (BlockNLComment - 64)))) != 0)) {
				{
				{
				setState(808);
				anyToken();
				}
				}
				setState(813);
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
		enterRule(_localctx, 196, RULE_anyToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << BREAK) | (1L << CASE) | (1L << CHAN) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DEFER) | (1L << ELSE) | (1L << FALLTHROUGH) | (1L << FOR) | (1L << FUNC) | (1L << GO) | (1L << GOTO) | (1L << IF) | (1L << IMPORT) | (1L << INTERFACE) | (1L << MAP) | (1L << PACKAGE) | (1L << RANGE) | (1L << RETURN) | (1L << SELECT) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPE) | (1L << VAR) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << RPAREN) | (1L << RSQ) | (1L << RBRACE) | (1L << SEMI) | (1L << Identifier) | (1L << ImaginaryLit) | (1L << IntLit))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FloatLit - 64)) | (1L << (StringLit - 64)) | (1L << (RuneLit - 64)) | (1L << (Whitespace - 64)) | (1L << (LineComment - 64)) | (1L << (NL - 64)) | (1L << (BlockComment - 64)) | (1L << (BlockNLComment - 64)))) != 0)) ) {
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
		case 54:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 60:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 92:
			return importDeclList_sempred((ImportDeclListContext)_localctx, predIndex);
		case 94:
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
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean importDeclList_sempred(ImportDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean importSpecList_sempred(ImportSpecListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u0333\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00cf\n\2\3\3"+
		"\3\3\5\3\u00d3\n\3\3\4\3\4\3\4\3\4\5\4\u00d9\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00f2\n\n\f\n\16\n\u00f5\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\5\16\u0101\n\16\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20\5"+
		"\20\u010a\n\20\5\20\u010c\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0116\n\21\f\21\16\21\u0119\13\21\3\22\5\22\u011c\n\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u012b\n\25"+
		"\f\25\16\25\u012e\13\25\3\26\3\26\3\26\5\26\u0133\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u013a\n\27\f\27\16\27\u013d\13\27\3\30\3\30\5\30\u0141"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014a\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0151\n\32\f\32\16\32\u0154\13\32\3\33\3\33\5\33\u0158"+
		"\n\33\3\33\3\33\5\33\u015c\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0164"+
		"\n\34\f\34\16\34\u0167\13\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u016f"+
		"\n\35\f\35\16\35\u0172\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u017b"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u0182\n\37\f\37\16\37\u0185\13\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u0191\n!\3\"\3\"\3\"\3\"\3\"\7\"\u0198"+
		"\n\"\f\"\16\"\u019b\13\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u01a7\n$\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01b5\n&\3\'\3\'\3(\3(\3(\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\5*\u01c4\n*\3+\3+\3+\5+\u01c9\n+\3,\3,\3-\3-\5-\u01cf"+
		"\n-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u01e0\n\60\3\61\3\61\3\61\3\61\3\61\5\61\u01e7\n\61\3\61\3\61\5\61\u01eb"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u01f3\n\62\f\62\16\62\u01f6\13"+
		"\62\3\63\3\63\3\63\3\63\3\63\5\63\u01fd\n\63\3\64\3\64\3\64\5\64\u0202"+
		"\n\64\3\65\3\65\3\66\3\66\5\66\u0208\n\66\3\67\3\67\3\67\38\38\38\58\u0210"+
		"\n8\38\38\38\38\38\38\38\38\38\38\78\u021c\n8\f8\168\u021f\138\39\39\3"+
		"9\3:\3:\3:\3:\3;\3;\5;\u022a\n;\3;\3;\5;\u022e\n;\3;\3;\3;\5;\u0233\n"+
		";\3;\3;\3;\3;\3;\3;\5;\u023b\n;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\5=\u0247"+
		"\n=\3=\3=\3=\3=\3=\5=\u024e\n=\3=\3=\3=\3=\3=\3=\3=\5=\u0257\n=\3=\3="+
		"\5=\u025b\n=\3>\3>\3>\3>\3>\3>\3>\7>\u0264\n>\f>\16>\u0267\13>\3?\3?\3"+
		"?\3?\5?\u026d\n?\3@\3@\3@\3@\3@\5@\u0274\n@\3A\3A\3B\3B\3C\3C\3D\3D\3"+
		"E\3E\3E\3E\5E\u0282\nE\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0291"+
		"\nF\3G\3G\3G\3G\3G\5G\u0298\nG\3H\3H\3I\3I\3I\3I\3J\3J\3K\3K\3L\3L\3L"+
		"\3M\3M\3M\3M\3N\3N\5N\u02ad\nN\3N\3N\3O\3O\3O\3O\5O\u02b5\nO\3O\3O\3O"+
		"\3O\3O\5O\u02bc\nO\5O\u02be\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P"+
		"\u02cc\nP\3Q\3Q\3R\3R\3R\5R\u02d3\nR\3R\3R\3R\3S\3S\3T\3T\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\5U\u02e6\nU\3V\3V\3V\3W\3W\5W\u02ed\nW\3X\3X\5X\u02f1"+
		"\nX\3Y\3Y\5Y\u02f5\nY\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\\3\\\3]\3]\3^\3^"+
		"\3^\3^\3^\7^\u0309\n^\f^\16^\u030c\13^\3_\3_\3_\3_\3_\3_\3_\5_\u0315\n"+
		"_\3`\3`\3`\3`\3`\7`\u031c\n`\f`\16`\u031f\13`\3a\3a\3a\3a\3a\3a\5a\u0327"+
		"\na\3b\3b\3c\7c\u032c\nc\fc\16c\u032f\13c\3d\3d\3d\2\20\22 (,\62\668<"+
		"Bbnz\u00ba\u00bee\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\2\t\3\2AD\3\2\17\24\3\2\25"+
		"\30\4\2\6\6\31\36\7\2\6\6\25\26\30\30\35\35\37\37\3\29:\3\2\3I\u0335\2"+
		"\u00ce\3\2\2\2\4\u00d2\3\2\2\2\6\u00d8\3\2\2\2\b\u00da\3\2\2\2\n\u00df"+
		"\3\2\2\2\f\u00e1\3\2\2\2\16\u00e3\3\2\2\2\20\u00e7\3\2\2\2\22\u00ec\3"+
		"\2\2\2\24\u00f6\3\2\2\2\26\u00f9\3\2\2\2\30\u00fc\3\2\2\2\32\u00fe\3\2"+
		"\2\2\34\u0104\3\2\2\2\36\u0106\3\2\2\2 \u010f\3\2\2\2\"\u011b\3\2\2\2"+
		"$\u011f\3\2\2\2&\u0121\3\2\2\2(\u0125\3\2\2\2*\u0132\3\2\2\2,\u0134\3"+
		"\2\2\2.\u0140\3\2\2\2\60\u0149\3\2\2\2\62\u014b\3\2\2\2\64\u0155\3\2\2"+
		"\2\66\u015d\3\2\2\28\u0168\3\2\2\2:\u017a\3\2\2\2<\u017c\3\2\2\2>\u0186"+
		"\3\2\2\2@\u0190\3\2\2\2B\u0192\3\2\2\2D\u019c\3\2\2\2F\u01a6\3\2\2\2H"+
		"\u01a8\3\2\2\2J\u01b4\3\2\2\2L\u01b6\3\2\2\2N\u01b8\3\2\2\2P\u01bb\3\2"+
		"\2\2R\u01c3\3\2\2\2T\u01c8\3\2\2\2V\u01ca\3\2\2\2X\u01ce\3\2\2\2Z\u01d0"+
		"\3\2\2\2\\\u01d4\3\2\2\2^\u01df\3\2\2\2`\u01ea\3\2\2\2b\u01ec\3\2\2\2"+
		"d\u01fc\3\2\2\2f\u0201\3\2\2\2h\u0203\3\2\2\2j\u0207\3\2\2\2l\u0209\3"+
		"\2\2\2n\u020f\3\2\2\2p\u0220\3\2\2\2r\u0223\3\2\2\2t\u023a\3\2\2\2v\u023c"+
		"\3\2\2\2x\u025a\3\2\2\2z\u025c\3\2\2\2|\u026c\3\2\2\2~\u0273\3\2\2\2\u0080"+
		"\u0275\3\2\2\2\u0082\u0277\3\2\2\2\u0084\u0279\3\2\2\2\u0086\u027b\3\2"+
		"\2\2\u0088\u027d\3\2\2\2\u008a\u0290\3\2\2\2\u008c\u0297\3\2\2\2\u008e"+
		"\u0299\3\2\2\2\u0090\u029b\3\2\2\2\u0092\u029f\3\2\2\2\u0094\u02a1\3\2"+
		"\2\2\u0096\u02a3\3\2\2\2\u0098\u02a6\3\2\2\2\u009a\u02ac\3\2\2\2\u009c"+
		"\u02b0\3\2\2\2\u009e\u02cb\3\2\2\2\u00a0\u02cd\3\2\2\2\u00a2\u02cf\3\2"+
		"\2\2\u00a4\u02d7\3\2\2\2\u00a6\u02d9\3\2\2\2\u00a8\u02e5\3\2\2\2\u00aa"+
		"\u02e7\3\2\2\2\u00ac\u02ea\3\2\2\2\u00ae\u02ee\3\2\2\2\u00b0\u02f2\3\2"+
		"\2\2\u00b2\u02f6\3\2\2\2\u00b4\u02f9\3\2\2\2\u00b6\u02fe\3\2\2\2\u00b8"+
		"\u0301\3\2\2\2\u00ba\u0303\3\2\2\2\u00bc\u0314\3\2\2\2\u00be\u0316\3\2"+
		"\2\2\u00c0\u0326\3\2\2\2\u00c2\u0328\3\2\2\2\u00c4\u032d\3\2\2\2\u00c6"+
		"\u0330\3\2\2\2\u00c8\u00cf\5\4\3\2\u00c9\u00cf\5\6\4\2\u00ca\u00cb\7\3"+
		"\2\2\u00cb\u00cc\5\2\2\2\u00cc\u00cd\7;\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\3\3\2\2\2"+
		"\u00d0\u00d3\7?\2\2\u00d1\u00d3\5Z.\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\5\3\2\2\2\u00d4\u00d9\5\b\5\2\u00d5\u00d9\5\20\t\2\u00d6"+
		"\u00d9\5\26\f\2\u00d7\u00d9\5\16\b\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\7\3\2\2\2\u00da\u00db"+
		"\7\4\2\2\u00db\u00dc\5\n\6\2\u00dc\u00dd\7<\2\2\u00dd\u00de\5\f\7\2\u00de"+
		"\t\3\2\2\2\u00df\u00e0\5z>\2\u00e0\13\3\2\2\2\u00e1\u00e2\5\2\2\2\u00e2"+
		"\r\3\2\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e5\7<\2\2\u00e5\u00e6\5\f\7\2"+
		"\u00e6\17\3\2\2\2\u00e7\u00e8\7\65\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00ea"+
		"\5\22\n\2\u00ea\u00eb\7=\2\2\u00eb\21\3\2\2\2\u00ec\u00f3\b\n\1\2\u00ed"+
		"\u00ee\f\3\2\2\u00ee\u00ef\5\24\13\2\u00ef\u00f0\7>\2\2\u00f0\u00f2\3"+
		"\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\23\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\66\34"+
		"\2\u00f7\u00f8\5\2\2\2\u00f8\25\3\2\2\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb"+
		"\5\30\r\2\u00fb\27\3\2\2\2\u00fc\u00fd\5\2\2\2\u00fd\31\3\2\2\2\u00fe"+
		"\u0100\5\36\20\2\u00ff\u0101\5\34\17\2\u0100\u00ff\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\33\3\2\2\2\u0102\u0105\5\36\20\2\u0103\u0105\5\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\35\3\2\2\2\u0106\u010b\7\3\2"+
		"\2\u0107\u0109\5 \21\2\u0108\u010a\7\7\2\2\u0109\u0108\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\7;\2\2\u010e\37\3\2\2\2\u010f\u0110\b\21\1"+
		"\2\u0110\u0111\5\"\22\2\u0111\u0117\3\2\2\2\u0112\u0113\f\3\2\2\u0113"+
		"\u0114\7\7\2\2\u0114\u0116\5\"\22\2\u0115\u0112\3\2\2\2\u0116\u0119\3"+
		"\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118!\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\u011c\5\66\34\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\5\2\2\2\u011e#\3\2\2\2\u011f\u0120\7"+
		"?\2\2\u0120%\3\2\2\2\u0121\u0122\7\5\2\2\u0122\u0123\5(\25\2\u0123\u0124"+
		"\7=\2\2\u0124\'\3\2\2\2\u0125\u012c\b\25\1\2\u0126\u0127\f\3\2\2\u0127"+
		"\u0128\5\u008aF\2\u0128\u0129\7>\2\2\u0129\u012b\3\2\2\2\u012a\u0126\3"+
		"\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		")\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0133\5\60\31\2\u0130\u0133\5:\36"+
		"\2\u0131\u0133\5@!\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133+\3\2\2\2\u0134\u013b\b\27\1\2\u0135\u0136\f\3\2\2\u0136"+
		"\u0137\5.\30\2\u0137\u0138\7>\2\2\u0138\u013a\3\2\2\2\u0139\u0135\3\2"+
		"\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"-\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0141\5*\26\2\u013f\u0141\5J&\2\u0140"+
		"\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141/\3\2\2\2\u0142\u0143\7#\2\2\u0143"+
		"\u014a\5\64\33\2\u0144\u0145\7#\2\2\u0145\u0146\7\3\2\2\u0146\u0147\5"+
		"\62\32\2\u0147\u0148\7;\2\2\u0148\u014a\3\2\2\2\u0149\u0142\3\2\2\2\u0149"+
		"\u0144\3\2\2\2\u014a\61\3\2\2\2\u014b\u0152\b\32\1\2\u014c\u014d\f\3\2"+
		"\2\u014d\u014e\5\64\33\2\u014e\u014f\7>\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014c\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\63\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u015b\5\66\34\2\u0156"+
		"\u0158\5\2\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\7\b\2\2\u015a\u015c\58\35\2\u015b\u0157\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\65\3\2\2\2\u015d\u015e\b\34\1\2\u015e\u015f\7?\2"+
		"\2\u015f\u0165\3\2\2\2\u0160\u0161\f\3\2\2\u0161\u0162\7\7\2\2\u0162\u0164"+
		"\7?\2\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\67\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\b\35\1"+
		"\2\u0169\u016a\5z>\2\u016a\u0170\3\2\2\2\u016b\u016c\f\3\2\2\u016c\u016d"+
		"\7\7\2\2\u016d\u016f\5z>\2\u016e\u016b\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u01719\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0173\u0174\7\67\2\2\u0174\u017b\5> \2\u0175\u0176\7\67\2\2\u0176\u0177"+
		"\7\3\2\2\u0177\u0178\5<\37\2\u0178\u0179\7;\2\2\u0179\u017b\3\2\2\2\u017a"+
		"\u0173\3\2\2\2\u017a\u0175\3\2\2\2\u017b;\3\2\2\2\u017c\u0183\b\37\1\2"+
		"\u017d\u017e\f\3\2\2\u017e\u017f\5> \2\u017f\u0180\7>\2\2\u0180\u0182"+
		"\3\2\2\2\u0181\u017d\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184=\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7?\2\2\u0187"+
		"\u0188\5\2\2\2\u0188?\3\2\2\2\u0189\u018a\78\2\2\u018a\u0191\5D#\2\u018b"+
		"\u018c\78\2\2\u018c\u018d\7\3\2\2\u018d\u018e\5B\"\2\u018e\u018f\7;\2"+
		"\2\u018f\u0191\3\2\2\2\u0190\u0189\3\2\2\2\u0190\u018b\3\2\2\2\u0191A"+
		"\3\2\2\2\u0192\u0199\b\"\1\2\u0193\u0194\f\3\2\2\u0194\u0195\5D#\2\u0195"+
		"\u0196\7>\2\2\u0196\u0198\3\2\2\2\u0197\u0193\3\2\2\2\u0198\u019b\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019aC\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u019d\5\66\34\2\u019d\u019e\5F$\2\u019eE\3\2\2\2\u019f"+
		"\u01a7\5\2\2\2\u01a0\u01a1\5\2\2\2\u01a1\u01a2\7\b\2\2\u01a2\u01a3\58"+
		"\35\2\u01a3\u01a7\3\2\2\2\u01a4\u01a5\7\b\2\2\u01a5\u01a7\58\35\2\u01a6"+
		"\u019f\3\2\2\2\u01a6\u01a0\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7G\3\2\2\2"+
		"\u01a8\u01a9\5\66\34\2\u01a9\u01aa\7\t\2\2\u01aa\u01ab\58\35\2\u01abI"+
		"\3\2\2\2\u01ac\u01ad\7*\2\2\u01ad\u01ae\5L\'\2\u01ae\u01af\5N(\2\u01af"+
		"\u01b5\3\2\2\2\u01b0\u01b1\7*\2\2\u01b1\u01b2\5L\'\2\u01b2\u01b3\5\32"+
		"\16\2\u01b3\u01b5\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5"+
		"K\3\2\2\2\u01b6\u01b7\7?\2\2\u01b7M\3\2\2\2\u01b8\u01b9\5\32\16\2\u01b9"+
		"\u01ba\5P)\2\u01baO\3\2\2\2\u01bb\u01bc\5&\24\2\u01bcQ\3\2\2\2\u01bd\u01c4"+
		"\5T+\2\u01be\u01c4\5X-\2\u01bf\u01c0\7\3\2\2\u01c0\u01c1\5z>\2\u01c1\u01c2"+
		"\7;\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01be\3\2\2\2\u01c3"+
		"\u01bf\3\2\2\2\u01c4S\3\2\2\2\u01c5\u01c9\5V,\2\u01c6\u01c9\5\\/\2\u01c7"+
		"\u01c9\5l\67\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2"+
		"\2\2\u01c9U\3\2\2\2\u01ca\u01cb\t\2\2\2\u01cbW\3\2\2\2\u01cc\u01cf\7?"+
		"\2\2\u01cd\u01cf\5Z.\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfY"+
		"\3\2\2\2\u01d0\u01d1\5\u00b8]\2\u01d1\u01d2\7\n\2\2\u01d2\u01d3\7?\2\2"+
		"\u01d3[\3\2\2\2\u01d4\u01d5\5^\60\2\u01d5\u01d6\5`\61\2\u01d6]\3\2\2\2"+
		"\u01d7\u01e0\5\20\t\2\u01d8\u01e0\5\b\5\2\u01d9\u01da\7\4\2\2\u01da\u01db"+
		"\7\13\2\2\u01db\u01dc\7<\2\2\u01dc\u01e0\5\f\7\2\u01dd\u01e0\5\16\b\2"+
		"\u01de\u01e0\5\4\3\2\u01df\u01d7\3\2\2\2\u01df\u01d8\3\2\2\2\u01df\u01d9"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0_\3\2\2\2\u01e1"+
		"\u01e2\7\5\2\2\u01e2\u01eb\7=\2\2\u01e3\u01e4\7\5\2\2\u01e4\u01e6\5b\62"+
		"\2\u01e5\u01e7\7\7\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e9\7=\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e1\3\2\2\2\u01ea"+
		"\u01e3\3\2\2\2\u01eba\3\2\2\2\u01ec\u01ed\b\62\1\2\u01ed\u01ee\5d\63\2"+
		"\u01ee\u01f4\3\2\2\2\u01ef\u01f0\f\3\2\2\u01f0\u01f1\7\7\2\2\u01f1\u01f3"+
		"\5d\63\2\u01f2\u01ef\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5c\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fd\5j\66\2"+
		"\u01f8\u01f9\5f\64\2\u01f9\u01fa\7\f\2\2\u01fa\u01fb\5j\66\2\u01fb\u01fd"+
		"\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fde\3\2\2\2\u01fe"+
		"\u0202\5h\65\2\u01ff\u0202\5z>\2\u0200\u0202\5`\61\2\u0201\u01fe\3\2\2"+
		"\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202g\3\2\2\2\u0203\u0204"+
		"\7?\2\2\u0204i\3\2\2\2\u0205\u0208\5z>\2\u0206\u0208\5`\61\2\u0207\u0205"+
		"\3\2\2\2\u0207\u0206\3\2\2\2\u0208k\3\2\2\2\u0209\u020a\7*\2\2\u020a\u020b"+
		"\5N(\2\u020bm\3\2\2\2\u020c\u020d\b8\1\2\u020d\u0210\5R*\2\u020e\u0210"+
		"\5\u0088E\2\u020f\u020c\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u021d\3\2\2"+
		"\2\u0211\u0212\f\7\2\2\u0212\u021c\5p9\2\u0213\u0214\f\6\2\2\u0214\u021c"+
		"\5r:\2\u0215\u0216\f\5\2\2\u0216\u021c\5t;\2\u0217\u0218\f\4\2\2\u0218"+
		"\u021c\5v<\2\u0219\u021a\f\3\2\2\u021a\u021c\5x=\2\u021b\u0211\3\2\2\2"+
		"\u021b\u0213\3\2\2\2\u021b\u0215\3\2\2\2\u021b\u0217\3\2\2\2\u021b\u0219"+
		"\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"o\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0221\7\n\2\2\u0221\u0222\7?\2\2\u0222"+
		"q\3\2\2\2\u0223\u0224\7\4\2\2\u0224\u0225\5z>\2\u0225\u0226\7<\2\2\u0226"+
		"s\3\2\2\2\u0227\u0229\7\4\2\2\u0228\u022a\5z>\2\u0229\u0228\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\7\f\2\2\u022c\u022e\5z"+
		">\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u023b\7<\2\2\u0230\u0232\7\4\2\2\u0231\u0233\5z>\2\u0232\u0231\3\2\2"+
		"\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7\f\2\2\u0235\u0236"+
		"\5z>\2\u0236\u0237\7\f\2\2\u0237\u0238\5z>\2\u0238\u0239\7<\2\2\u0239"+
		"\u023b\3\2\2\2\u023a\u0227\3\2\2\2\u023a\u0230\3\2\2\2\u023bu\3\2\2\2"+
		"\u023c\u023d\7\n\2\2\u023d\u023e\7\3\2\2\u023e\u023f\5\2\2\2\u023f\u0240"+
		"\7;\2\2\u0240w\3\2\2\2\u0241\u0242\7\3\2\2\u0242\u025b\7;\2\2\u0243\u0244"+
		"\7\3\2\2\u0244\u0246\58\35\2\u0245\u0247\7\7\2\2\u0246\u0245\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7;\2\2\u0249\u025b\3\2"+
		"\2\2\u024a\u024b\7\3\2\2\u024b\u024d\5\2\2\2\u024c\u024e\7\7\2\2\u024d"+
		"\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7;"+
		"\2\2\u0250\u025b\3\2\2\2\u0251\u0252\7\3\2\2\u0252\u0253\5\2\2\2\u0253"+
		"\u0254\7\7\2\2\u0254\u0256\58\35\2\u0255\u0257\7\7\2\2\u0256\u0255\3\2"+
		"\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7;\2\2\u0259"+
		"\u025b\3\2\2\2\u025a\u0241\3\2\2\2\u025a\u0243\3\2\2\2\u025a\u024a\3\2"+
		"\2\2\u025a\u0251\3\2\2\2\u025by\3\2\2\2\u025c\u025d\b>\1\2\u025d\u025e"+
		"\5|?\2\u025e\u0265\3\2\2\2\u025f\u0260\f\3\2\2\u0260\u0261\5~@\2\u0261"+
		"\u0262\5z>\4\u0262\u0264\3\2\2\2\u0263\u025f\3\2\2\2\u0264\u0267\3\2\2"+
		"\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266{\3\2\2\2\u0267\u0265"+
		"\3\2\2\2\u0268\u026d\5n8\2\u0269\u026a\5\u0086D\2\u026a\u026b\5|?\2\u026b"+
		"\u026d\3\2\2\2\u026c\u0268\3\2\2\2\u026c\u0269\3\2\2\2\u026d}\3\2\2\2"+
		"\u026e\u0274\7\r\2\2\u026f\u0274\7\16\2\2\u0270\u0274\5\u0080A\2\u0271"+
		"\u0274\5\u0082B\2\u0272\u0274\5\u0084C\2\u0273\u026e\3\2\2\2\u0273\u026f"+
		"\3\2\2\2\u0273\u0270\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0272\3\2\2\2\u0274"+
		"\177\3\2\2\2\u0275\u0276\t\3\2\2\u0276\u0081\3\2\2\2\u0277\u0278\t\4\2"+
		"\2\u0278\u0083\3\2\2\2\u0279\u027a\t\5\2\2\u027a\u0085\3\2\2\2\u027b\u027c"+
		"\t\6\2\2\u027c\u0087\3\2\2\2\u027d\u027e\5\2\2\2\u027e\u027f\7\3\2\2\u027f"+
		"\u0281\5z>\2\u0280\u0282\7\7\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2"+
		"\2\u0282\u0283\3\2\2\2\u0283\u0284\7;\2\2\u0284\u0089\3\2\2\2\u0285\u0291"+
		"\5*\26\2\u0286\u0291\5\u0090I\2\u0287\u0291\5\u008cG\2\u0288\u0291\5\u00aa"+
		"V\2\u0289\u0291\5\u00acW\2\u028a\u0291\5\u00aeX\2\u028b\u0291\5\u00b0"+
		"Y\2\u028c\u0291\5\u00b2Z\2\u028d\u0291\5&\24\2\u028e\u0291\5\u009cO\2"+
		"\u028f\u0291\5\u009eP\2\u0290\u0285\3\2\2\2\u0290\u0286\3\2\2\2\u0290"+
		"\u0287\3\2\2\2\u0290\u0288\3\2\2\2\u0290\u0289\3\2\2\2\u0290\u028a\3\2"+
		"\2\2\u0290\u028b\3\2\2\2\u0290\u028c\3\2\2\2\u0290\u028d\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291\u008b\3\2\2\2\u0292\u0298\5\u008e"+
		"H\2\u0293\u0298\5\u0094K\2\u0294\u0298\5\u0096L\2\u0295\u0298\5\u0098"+
		"M\2\u0296\u0298\5H%\2\u0297\u0292\3\2\2\2\u0297\u0293\3\2\2\2\u0297\u0294"+
		"\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0296\3\2\2\2\u0298\u008d\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u008f\3\2\2\2\u029b\u029c\5\u0092J\2\u029c\u029d"+
		"\7\f\2\2\u029d\u029e\5\u008aF\2\u029e\u0091\3\2\2\2\u029f\u02a0\7?\2\2"+
		"\u02a0\u0093\3\2\2\2\u02a1\u02a2\5z>\2\u02a2\u0095\3\2\2\2\u02a3\u02a4"+
		"\5z>\2\u02a4\u02a5\t\7\2\2\u02a5\u0097\3\2\2\2\u02a6\u02a7\58\35\2\u02a7"+
		"\u02a8\5\u009aN\2\u02a8\u02a9\58\35\2\u02a9\u0099\3\2\2\2\u02aa\u02ad"+
		"\5\u0082B\2\u02ab\u02ad\5\u0084C\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2"+
		"\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\7\b\2\2\u02af"+
		"\u009b\3\2\2\2\u02b0\u02b4\7-\2\2\u02b1\u02b2\5\u008cG\2\u02b2\u02b3\7"+
		">\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b7\5z>\2\u02b7\u02bd\5&\24\2\u02b8\u02bb\7\'\2"+
		"\2\u02b9\u02bc\5\u009cO\2\u02ba\u02bc\5&\24\2\u02bb\u02b9\3\2\2\2\u02bb"+
		"\u02ba\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02b8\3\2\2\2\u02bd\u02be\3\2"+
		"\2\2\u02be\u009d\3\2\2\2\u02bf\u02c0\7)\2\2\u02c0\u02c1\5\u00a0Q\2\u02c1"+
		"\u02c2\5&\24\2\u02c2\u02cc\3\2\2\2\u02c3\u02c4\7)\2\2\u02c4\u02c5\5\u00a2"+
		"R\2\u02c5\u02c6\5&\24\2\u02c6\u02cc\3\2\2\2\u02c7\u02c8\7)\2\2\u02c8\u02c9"+
		"\5\u00a8U\2\u02c9\u02ca\5&\24\2\u02ca\u02cc\3\2\2\2\u02cb\u02bf\3\2\2"+
		"\2\u02cb\u02c3\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cc\u009f\3\2\2\2\u02cd\u02ce"+
		"\5z>\2\u02ce\u00a1\3\2\2\2\u02cf\u02d0\5\u00a4S\2\u02d0\u02d2\7>\2\2\u02d1"+
		"\u02d3\5\u00a0Q\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d5\7>\2\2\u02d5\u02d6\5\u00a6T\2\u02d6\u00a3\3\2\2\2"+
		"\u02d7\u02d8\5\u008cG\2\u02d8\u00a5\3\2\2\2\u02d9\u02da\5\u008cG\2\u02da"+
		"\u00a7\3\2\2\2\u02db\u02dc\58\35\2\u02dc\u02dd\7\b\2\2\u02dd\u02de\7\62"+
		"\2\2\u02de\u02df\5z>\2\u02df\u02e6\3\2\2\2\u02e0\u02e1\5\66\34\2\u02e1"+
		"\u02e2\7\t\2\2\u02e2\u02e3\7\62\2\2\u02e3\u02e4\5z>\2\u02e4\u02e6\3\2"+
		"\2\2\u02e5\u02db\3\2\2\2\u02e5\u02e0\3\2\2\2\u02e6\u00a9\3\2\2\2\u02e7"+
		"\u02e8\7+\2\2\u02e8\u02e9\5z>\2\u02e9\u00ab\3\2\2\2\u02ea\u02ec\7\63\2"+
		"\2\u02eb\u02ed\58\35\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u00ad"+
		"\3\2\2\2\u02ee\u02f0\7 \2\2\u02ef\u02f1\5\u0092J\2\u02f0\u02ef\3\2\2\2"+
		"\u02f0\u02f1\3\2\2\2\u02f1\u00af\3\2\2\2\u02f2\u02f4\7$\2\2\u02f3\u02f5"+
		"\5\u0092J\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u00b1\3\2\2"+
		"\2\u02f6\u02f7\7,\2\2\u02f7\u02f8\5\u0092J\2\u02f8\u00b3\3\2\2\2\u02f9"+
		"\u02fa\5\u00b6\\\2\u02fa\u02fb\7>\2\2\u02fb\u02fc\5\u00ba^\2\u02fc\u02fd"+
		"\5,\27\2\u02fd\u00b5\3\2\2\2\u02fe\u02ff\7\61\2\2\u02ff\u0300\5\u00b8"+
		"]\2\u0300\u00b7\3\2\2\2\u0301\u0302\7?\2\2\u0302\u00b9\3\2\2\2\u0303\u030a"+
		"\b^\1\2\u0304\u0305\f\3\2\2\u0305\u0306\5\u00bc_\2\u0306\u0307\7>\2\2"+
		"\u0307\u0309\3\2\2\2\u0308\u0304\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u00bb\3\2\2\2\u030c\u030a\3\2\2\2\u030d"+
		"\u030e\7.\2\2\u030e\u0315\5\u00c0a\2\u030f\u0310\7.\2\2\u0310\u0311\7"+
		"\3\2\2\u0311\u0312\5\u00be`\2\u0312\u0313\7;\2\2\u0313\u0315\3\2\2\2\u0314"+
		"\u030d\3\2\2\2\u0314\u030f\3\2\2\2\u0315\u00bd\3\2\2\2\u0316\u031d\b`"+
		"\1\2\u0317\u0318\f\3\2\2\u0318\u0319\5\u00c0a\2\u0319\u031a\7>\2\2\u031a"+
		"\u031c\3\2\2\2\u031b\u0317\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031e\u00bf\3\2\2\2\u031f\u031d\3\2\2\2\u0320"+
		"\u0321\7\n\2\2\u0321\u0327\5\u00c2b\2\u0322\u0323\5\u00b8]\2\u0323\u0324"+
		"\5\u00c2b\2\u0324\u0327\3\2\2\2\u0325\u0327\5\u00c2b\2\u0326\u0320\3\2"+
		"\2\2\u0326\u0322\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u00c1\3\2\2\2\u0328"+
		"\u0329\7C\2\2\u0329\u00c3\3\2\2\2\u032a\u032c\5\u00c6d\2\u032b\u032a\3"+
		"\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u00c5\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331\t\b\2\2\u0331\u00c7\3\2"+
		"\2\2F\u00ce\u00d2\u00d8\u00f3\u0100\u0104\u0109\u010b\u0117\u011b\u012c"+
		"\u0132\u013b\u0140\u0149\u0152\u0157\u015b\u0165\u0170\u017a\u0183\u0190"+
		"\u0199\u01a6\u01b4\u01c3\u01c8\u01ce\u01df\u01e6\u01ea\u01f4\u01fc\u0201"+
		"\u0207\u020f\u021b\u021d\u0229\u022d\u0232\u023a\u0246\u024d\u0256\u025a"+
		"\u0265\u026c\u0273\u0281\u0290\u0297\u02ac\u02b4\u02bb\u02bd\u02cb\u02d2"+
		"\u02e5\u02ec\u02f0\u02f4\u030a\u0314\u031d\u0326\u032d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}