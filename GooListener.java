// Generated from Goo.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GooParser}.
 */
public interface GooListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GooParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GooParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GooParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(GooParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(GooParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void enterTypeLit(GooParser.TypeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void exitTypeLit(GooParser.TypeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(GooParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(GooParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(GooParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(GooParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#elementType}.
	 * @param ctx the parse tree
	 */
	void enterElementType(GooParser.ElementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#elementType}.
	 * @param ctx the parse tree
	 */
	void exitElementType(GooParser.ElementTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void enterSliceType(GooParser.SliceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#sliceType}.
	 * @param ctx the parse tree
	 */
	void exitSliceType(GooParser.SliceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(GooParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(GooParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#fieldDeclList}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclList(GooParser.FieldDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#fieldDeclList}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclList(GooParser.FieldDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(GooParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(GooParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(GooParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(GooParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(GooParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(GooParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(GooParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(GooParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(GooParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(GooParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GooParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GooParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GooParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GooParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(GooParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(GooParser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(GooParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(GooParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GooParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GooParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(GooParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(GooParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GooParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GooParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#topLevelDeclList}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDeclList(GooParser.TopLevelDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#topLevelDeclList}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDeclList(GooParser.TopLevelDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDecl(GooParser.TopLevelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDecl(GooParser.TopLevelDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(GooParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(GooParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#constSpecList}.
	 * @param ctx the parse tree
	 */
	void enterConstSpecList(GooParser.ConstSpecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#constSpecList}.
	 * @param ctx the parse tree
	 */
	void exitConstSpecList(GooParser.ConstSpecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstSpec(GooParser.ConstSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstSpec(GooParser.ConstSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(GooParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(GooParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GooParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GooParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(GooParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(GooParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#typeSpecList}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecList(GooParser.TypeSpecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#typeSpecList}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecList(GooParser.TypeSpecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(GooParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(GooParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(GooParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(GooParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#varSpecList}.
	 * @param ctx the parse tree
	 */
	void enterVarSpecList(GooParser.VarSpecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#varSpecList}.
	 * @param ctx the parse tree
	 */
	void exitVarSpecList(GooParser.VarSpecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(GooParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(GooParser.VarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#varSpecRem}.
	 * @param ctx the parse tree
	 */
	void enterVarSpecRem(GooParser.VarSpecRemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#varSpecRem}.
	 * @param ctx the parse tree
	 */
	void exitVarSpecRem(GooParser.VarSpecRemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterShortVarDecl(GooParser.ShortVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitShortVarDecl(GooParser.ShortVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(GooParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(GooParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(GooParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(GooParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GooParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GooParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(GooParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(GooParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(GooParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(GooParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GooParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GooParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void enterBasicLit(GooParser.BasicLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void exitBasicLit(GooParser.BasicLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterOperandName(GooParser.OperandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitOperandName(GooParser.OperandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(GooParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(GooParser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void enterCompositeLit(GooParser.CompositeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void exitCompositeLit(GooParser.CompositeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(GooParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(GooParser.LiteralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(GooParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(GooParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(GooParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(GooParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(GooParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(GooParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(GooParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(GooParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(GooParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(GooParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GooParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GooParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(GooParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(GooParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(GooParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(GooParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(GooParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(GooParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(GooParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(GooParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertion(GooParser.TypeAssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#typeAssertion}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertion(GooParser.TypeAssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GooParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GooParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GooParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GooParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(GooParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(GooParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(GooParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(GooParser.ConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GooParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GooParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(GooParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(GooParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(GooParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(GooParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GooParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GooParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(GooParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(GooParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#initStmt}.
	 * @param ctx the parse tree
	 */
	void enterInitStmt(GooParser.InitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#initStmt}.
	 * @param ctx the parse tree
	 */
	void exitInitStmt(GooParser.InitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#postStmt}.
	 * @param ctx the parse tree
	 */
	void enterPostStmt(GooParser.PostStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#postStmt}.
	 * @param ctx the parse tree
	 */
	void exitPostStmt(GooParser.PostStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(GooParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(GooParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(GooParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(GooParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#packageClause}.
	 * @param ctx the parse tree
	 */
	void enterPackageClause(GooParser.PackageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#packageClause}.
	 * @param ctx the parse tree
	 */
	void exitPackageClause(GooParser.PackageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(GooParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(GooParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#importDeclList}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclList(GooParser.ImportDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#importDeclList}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclList(GooParser.ImportDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(GooParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(GooParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#importSpecList}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecList(GooParser.ImportSpecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#importSpecList}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecList(GooParser.ImportSpecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void enterImportSpec(GooParser.ImportSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void exitImportSpec(GooParser.ImportSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(GooParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(GooParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#anything}.
	 * @param ctx the parse tree
	 */
	void enterAnything(GooParser.AnythingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#anything}.
	 * @param ctx the parse tree
	 */
	void exitAnything(GooParser.AnythingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GooParser#anyToken}.
	 * @param ctx the parse tree
	 */
	void enterAnyToken(GooParser.AnyTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GooParser#anyToken}.
	 * @param ctx the parse tree
	 */
	void exitAnyToken(GooParser.AnyTokenContext ctx);
}