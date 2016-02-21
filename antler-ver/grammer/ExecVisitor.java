import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;



public class ExecVisitor extends emlgBaseVisitor<Integer> {
	

	HashMap<String, Integer> allVar = new HashMap<>();

	@Override
	public Integer visitAssn(emlgParser.AssnContext ctx) {
		allVar.put(ctx.ID().getText().toString(), visit(ctx.expr()));
		return null;
	}

	@Override
	public Integer visitIf(emlgParser.IfContext ctx) {
		if (visit(ctx.expr()) == 1) {
			visit(ctx.c1);
		} else {
			visit(ctx.c2);
		}
		return null;
	}

	@Override
	public Integer visitWhile(emlgParser.WhileContext ctx) {
		while (visit(ctx.expr()) > 0) {
			visit(ctx.seq_com());
		}
		return null;
	}

	@Override
	public Integer visitPrint(emlgParser.PrintContext ctx) {
		System.out.println(allVar.get(ctx.ID().getText().toString()));
		return null;

	}

	@Override
	public Integer visitRead(emlgParser.ReadContext ctx) {
		int x = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Integer:");
		try {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		allVar.put(ctx.ID().getText().toString(), x);
		return null;
	}

	@Override
	public Integer visitExpr(emlgParser.ExprContext ctx) {

		if (ctx.e2 == null) {
			return visit(ctx.e1);
		}
		Boolean x = null;
		switch (ctx.op.getText()) {
		case ":@":
			x = visit(ctx.e1) == visit(ctx.e2);
			break;
		case ":<":
			x = visit(ctx.e1) < visit(ctx.e2);
			break;
		case ":>":
			x = visit(ctx.e1) > visit(ctx.e2);
			break;
		}
		if (x == true) {
			return 1;
		}
		return 0;
	}

	public Integer visitSec_expr(emlgParser.Sec_exprContext ctx) {
		if (ctx.e2 == null) {
			return visit(ctx.e1);
		}
		Integer x = null;
		switch (ctx.op.getText()) {
		case ":3":
			x = visit(ctx.e1) + visit(ctx.e2);
			break;
		case "<:|":
			x = visit(ctx.e1) - visit(ctx.e2);
			break;
		case ":D":
			x = visit(ctx.e1) * visit(ctx.e2);
			break;
		case "D:":
			x = visit(ctx.e1) / visit(ctx.e2);
			break;
		}
		return x;

	}

	public Integer visitFalse(emlgParser.FalseContext ctx) {
		return 0;
	}

	public Integer visitTrue(emlgParser.TrueContext ctx) {
		return 1;
	}

	public Integer visitNum(emlgParser.NumContext ctx) {
		return Integer.parseInt(ctx.getText());
	}

	public Integer visitId(emlgParser.IdContext ctx) {
		return allVar.get(ctx.getText().toString());
	}
	
	public Integer visitNot(emlgParser.NotContext ctx){
		int x = visit(ctx.prim_expr());
		if (x == 0){
			return 1;
		}else {
			return 0;
		}
	}
}
