// Generated from grammer/emlg.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link emlgParser}.
 */
public interface emlgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code prog}
	 * labeled alternative in {@link emlgParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProg(emlgParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prog}
	 * labeled alternative in {@link emlgParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProg(emlgParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link emlgParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar(emlgParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link emlgParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar(emlgParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link emlgParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBool(emlgParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link emlgParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBool(emlgParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link emlgParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInt(emlgParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link emlgParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInt(emlgParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assn}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAssn(emlgParser.AssnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assn}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAssn(emlgParser.AssnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIf(emlgParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIf(emlgParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWhile(emlgParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWhile(emlgParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 */
	void enterPrint(emlgParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link emlgParser#com}.
	 * @param ctx the parse tree
	 */
	void exitPrint(emlgParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seq}
	 * labeled alternative in {@link emlgParser#seq_com}.
	 * @param ctx the parse tree
	 */
	void enterSeq(emlgParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link emlgParser#seq_com}.
	 * @param ctx the parse tree
	 */
	void exitSeq(emlgParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link emlgParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(emlgParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link emlgParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(emlgParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link emlgParser#sec_expr}.
	 * @param ctx the parse tree
	 */
	void enterSec_expr(emlgParser.Sec_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link emlgParser#sec_expr}.
	 * @param ctx the parse tree
	 */
	void exitSec_expr(emlgParser.Sec_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(emlgParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(emlgParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(emlgParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(emlgParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(emlgParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(emlgParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterId(emlgParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitId(emlgParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(emlgParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(emlgParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(emlgParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link emlgParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(emlgParser.ParensContext ctx);
}