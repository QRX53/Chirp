// Generated from /Users/qrx53/Documents/GitHub/Chirp/src/main/java/antlr/Chirp.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChirpParser}.
 */
public interface ChirpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChirpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ChirpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ChirpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(ChirpParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(ChirpParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(ChirpParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(ChirpParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(ChirpParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(ChirpParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(ChirpParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(ChirpParser.Field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(ChirpParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(ChirpParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(ChirpParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(ChirpParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ChirpParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ChirpParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ChirpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ChirpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(ChirpParser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(ChirpParser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ChirpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ChirpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ChirpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ChirpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ChirpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ChirpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(ChirpParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(ChirpParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#left_hand_side}.
	 * @param ctx the parse tree
	 */
	void enterLeft_hand_side(ChirpParser.Left_hand_sideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#left_hand_side}.
	 * @param ctx the parse tree
	 */
	void exitLeft_hand_side(ChirpParser.Left_hand_sideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(ChirpParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(ChirpParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(ChirpParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(ChirpParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(ChirpParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(ChirpParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(ChirpParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(ChirpParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(ChirpParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(ChirpParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(ChirpParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(ChirpParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(ChirpParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(ChirpParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(ChirpParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(ChirpParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(ChirpParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(ChirpParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ChirpParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ChirpParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(ChirpParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(ChirpParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChirpParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(ChirpParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChirpParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(ChirpParser.Return_statementContext ctx);
}