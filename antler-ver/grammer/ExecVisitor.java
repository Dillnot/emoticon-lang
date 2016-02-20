import java.util.HashMap;

public class ExecVisitor extends emlgBaseVisitor<String> {

	HashMap<String, Integer> allVar = new HashMap<>();

	@Override
	public String visitVar(emlgParser.VarContext ctx) {
		allVar.put(ctx.ID().getText().toString(), Integer.parseInt(visit(ctx.expr())));
		return null;
	}

	@Override
	public String visitAssn(emlgParser.AssnContext ctx) {
		allVar.put(ctx.ID().getText().toString(),  Integer.parseInt(visit(ctx.expr())));
		return null;
	}

	@Override
	public String visitIf(emlgParser.IfContext ctx) {
		if (visit(ctx.expr()).compareTo("1") == 0) {
			visit(ctx.c1);
		} else {
			visit(ctx.c2);
		}
		return null;
	}

	@Override
	public String visitWhile(emlgParser.WhileContext ctx) {
		while (Integer.parseInt(visit(ctx.expr())) > 0) {
			visit(ctx.seq_com());
		}
		return null;
	}

	@Override
	public String visitPrint(emlgParser.PrintContext ctx) {
		System.out.println(allVar.get(ctx.ID().getText().toString()));
		return null;

	}

	@Override
	public String visitExpr(emlgParser.ExprContext ctx) {

		if (ctx.e2 == null) {
			return visit(ctx.e1);
		}
		Boolean x = null;
		switch (ctx.op.getText()) {
		case ":@":
			x = Integer.parseInt(visit(ctx.e1)) == Integer.parseInt(visit(ctx.e2));
			break;
		case ":<":
			x = Integer.parseInt(visit(ctx.e1)) < Integer.parseInt(visit(ctx.e2));
			break;
		case ":>":
			x = Integer.parseInt(visit(ctx.e1)) > Integer.parseInt(visit(ctx.e2));
			break;
		}
		if	(x == true){
			return "1";
		}
		return "0";
	}

	public String visitSec_expr(emlgParser.Sec_exprContext ctx) {
		if (ctx.e2 == null) {
			return visit(ctx.e1);
		}
		Integer x = null;
		switch (ctx.op.getText()) {
		case ":3":
			x = Integer.parseInt(visit(ctx.e1)) + Integer.parseInt(visit(ctx.e2));
			break;
		case "<:|":
			x = Integer.parseInt(visit(ctx.e1)) - Integer.parseInt(visit(ctx.e2));
			break;
		case ":D":
			x = Integer.parseInt(visit(ctx.e1)) * Integer.parseInt(visit(ctx.e2));
			break;
		case "D:":
			x = Integer.parseInt(visit(ctx.e1)) / Integer.parseInt(visit(ctx.e2));
			break;
		}
		return x.toString();

	}
	
	public String visitFalse(emlgParser.FalseContext ctx) {
		return "0";
	}
	
	public String visitTrue(emlgParser.TrueContext ctx) {
		return "1";
	}
	
	public String visitNum(emlgParser.NumContext ctx) {
		return ctx.getText().toString();
	}
	
	public String visitId(emlgParser.IdContext ctx) {
		return allVar.get(ctx.getText().toString()).toString();
	}
}
