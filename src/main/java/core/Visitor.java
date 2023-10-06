package core;

import antlr.ChirpBaseVisitor;
import antlr.ChirpParser;
import core.variables.VarType;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;

import static core.Main.importFile;
import static core.Main.replaceLast;

public class Visitor extends ChirpBaseVisitor<Value> {
    @Override
    public Value visitProgram(ChirpParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Value visitImport_statement(ChirpParser.Import_statementContext ctx) {

        String timport = replaceLast(ctx.STRING_LITERAL().getText().replaceFirst("\"", ""), "\"", "").replaceAll("::", File.separator);
        File f = new File(timport);

        if (f.exists()) {
            importFile(f);
        } else {
            f = new File(System.getProperty("user.home") + File.separator + ".chirp" + File.separator + "lib" + File.separator + timport);

            if (f.exists()) {
                importFile(f);
            } else {
                System.err.println("Failed to import '" + timport + "'");
                System.exit(-1);
            }
        }

        return super.visitImport_statement(ctx);
    }

    @Override
    public Value visitClass_declaration(ChirpParser.Class_declarationContext ctx) {
        return super.visitClass_declaration(ctx);
    }

    @Override
    public Value visitField_declaration(ChirpParser.Field_declarationContext ctx) {
        return super.visitField_declaration(ctx);
    }

    @Override
    public Value visitMethod_declaration(ChirpParser.Method_declarationContext ctx) {
        return super.visitMethod_declaration(ctx);
    }

    @Override
    public Value visitParameter_list(ChirpParser.Parameter_listContext ctx) {
        return super.visitParameter_list(ctx);
    }

    @Override
    public Value visitParameter(ChirpParser.ParameterContext ctx) {
        return super.visitParameter(ctx);
    }

    @Override
    public Value visitType(ChirpParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Value visitAccess_modifier(ChirpParser.Access_modifierContext ctx) {
        return super.visitAccess_modifier(ctx);
    }

    @Override
    public Value visitBlock(ChirpParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Value visitStatement(ChirpParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Value visitExpression(ChirpParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Value visitAssignment_expression(ChirpParser.Assignment_expressionContext ctx) {

        Value val;
        if (ctx.STRING_LITERAL() != null) {
            val = new Value(replaceLast(ctx.STRING_LITERAL().getText().replaceFirst("\"", ""), "\"", ""));
            val.type = VarType.STRING;
        } else if (ctx.INT_LITERAL() != null) {
            val = new Value(ctx.INT_LITERAL().getText());
            val.type = VarType.INT;
        } else if (ctx.IDENTIFIER().get(1) != null) {
            val = new Value(ctx.IDENTIFIER().get(1).getText());
            val.type = VarType.IDENTIFIER;
        } else {
            val = Value.NULL;
        }

        String identifier = ctx.IDENTIFIER().get(0).getText();

        Env.global.variables.put(identifier, val);
        return Value.VOID;
    }

    @Override
    public Value visitLeft_hand_side(ChirpParser.Left_hand_sideContext ctx) {
        return super.visitLeft_hand_side(ctx);
    }

    @Override
    public Value visitConditional_expression(ChirpParser.Conditional_expressionContext ctx) {
        return super.visitConditional_expression(ctx);
    }

    @Override
    public Value visitLogical_or_expression(ChirpParser.Logical_or_expressionContext ctx) {
        return super.visitLogical_or_expression(ctx);
    }

    @Override
    public Value visitLogical_and_expression(ChirpParser.Logical_and_expressionContext ctx) {
        return super.visitLogical_and_expression(ctx);
    }

    @Override
    public Value visitEquality_expression(ChirpParser.Equality_expressionContext ctx) {
        return super.visitEquality_expression(ctx);
    }

    @Override
    public Value visitRelational_expression(ChirpParser.Relational_expressionContext ctx) {
        return super.visitRelational_expression(ctx);
    }

    @Override
    public Value visitAdditive_expression(ChirpParser.Additive_expressionContext ctx) {
        return super.visitAdditive_expression(ctx);
    }

    @Override
    public Value visitMultiplicative_expression(ChirpParser.Multiplicative_expressionContext ctx) {
        return super.visitMultiplicative_expression(ctx);
    }

    @Override
    public Value visitUnary_expression(ChirpParser.Unary_expressionContext ctx) {
        return super.visitUnary_expression(ctx);
    }

    @Override
    public Value visitPrimary_expression(ChirpParser.Primary_expressionContext ctx) {
        return super.visitPrimary_expression(ctx);
    }

    @Override
    public Value visitIf_statement(ChirpParser.If_statementContext ctx) {
        return super.visitIf_statement(ctx);
    }

    @Override
    public Value visitWhile_statement(ChirpParser.While_statementContext ctx) {
        return super.visitWhile_statement(ctx);
    }

    @Override
    public Value visitReturn_statement(ChirpParser.Return_statementContext ctx) {
        return super.visitReturn_statement(ctx);
    }

    @Override
    public Value visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Value visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Value visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Value visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Value defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Value aggregateResult(Value aggregate, Value nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Value currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
