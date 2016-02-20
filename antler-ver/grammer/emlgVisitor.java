// Generated from grammer/emlg.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link emlgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface emlgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code prog}
	 * labeled alternative in {@link emlgParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(emlgParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link emlgParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(emlgParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link emlgParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(emlgParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link emlgParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(emlgParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assn}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssn(emlgParser.AssnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(emlgParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(emlgParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(emlgParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link emlgParser#seq_com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(emlgParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link emlgParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(emlgParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link emlgParser#sec_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSec_expr(emlgParser.Sec_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(emlgParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(emlgParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(emlgParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(emlgParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(emlgParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(emlgParser.ParensContext ctx);
}