import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import emlgParser.AssnContext;
import emlgParser.BoolContext;
import emlgParser.ExprContext;
import emlgParser.FalseContext;
import emlgParser.IdContext;
import emlgParser.IfContext;
import emlgParser.IntContext;
import emlgParser.NotContext;
import emlgParser.NumContext;
import emlgParser.ParensContext;
import emlgParser.PrintContext;
import emlgParser.ProgContext;
import emlgParser.Sec_exprContext;
import emlgParser.SeqContext;
import emlgParser.TrueContext;
import emlgParser.VarContext;
import emlgParser.WhileContext;

public class emlgCheckerVisitor extends AbstractParseTreeVisitor<T> implements emlgVisitor<T> {

	@Override
	public T visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitVar(VarContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitBool(BoolContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitInt(IntContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitAssn(AssnContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitIf(IfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitWhile(WhileContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitPrint(PrintContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitSeq(SeqContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitSec_expr(Sec_exprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitFalse(FalseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitTrue(TrueContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitNum(NumContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitId(IdContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitNot(NotContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T visitParens(ParensContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
