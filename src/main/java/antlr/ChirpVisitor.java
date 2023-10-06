// Generated from /Users/qrx53/Documents/GitHub/Chirp/src/main/java/antlr/Chirp.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChirpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChirpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChirpParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ChirpParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(ChirpParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(ChirpParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(ChirpParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#field_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration(ChirpParser.Field_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(ChirpParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(ChirpParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ChirpParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ChirpParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(ChirpParser.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ChirpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ChirpParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ChirpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(ChirpParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#left_hand_side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_hand_side(ChirpParser.Left_hand_sideContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(ChirpParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(ChirpParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(ChirpParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(ChirpParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(ChirpParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(ChirpParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(ChirpParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(ChirpParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(ChirpParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(ChirpParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(ChirpParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChirpParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(ChirpParser.Return_statementContext ctx);
}