
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.objectweb.asm.*;



public class compVisitor extends AbstractParseTreeVisitor<Void> implements emlgVisitor<Void>, Opcodes {

	ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
	public String programFileName = "temp";
	MethodVisitor mv;

	public byte[] getClassByteArray() {
		return classWriter.toByteArray();
	}

	public Void visitProg(emlgParser.ProgContext ctx) {
		classWriter.visit(Opcodes.V1_7, Opcodes.ACC_PUBLIC, programFileName, null, "java/lang/Object", null);

		//MethodVisitor mv = classWriter.visitMethod(ACC_PUBLIC, programFileName, "()V", null, null);
		//mv.visitCode();
		//mv.visitVarInsn(Opcodes.ALOAD, 0);
		//mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "", "()V");
		//mv.visitInsn(Opcodes.RETURN);
		//mv.visitMaxs(0, 0);
		//mv.visitEnd();
		mv = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V",
				null, null);
		visitChildren(ctx); // Visit all procedures and functions
		mv.visitEnd();
		mv.visitInsn(Opcodes.RETURN);
		mv.visitMaxs(0, 0);
		mv.visitEnd();
		classWriter.visitEnd();
		return null;
	}

	@Override
	public Void visitAssn(emlgParser.AssnContext ctx) {
		Label l0 = new Label();
		mv.visitLabel(l0);
		mv.visitLineNumber(15, l0);
		mv.visitVarInsn(ALOAD, 0);
		mv.visitFieldInsn(GETFIELD, "ExecVisitor", "allVar", "Ljava/util/HashMap;");
		mv.visitLdcInsn(ctx.ID().getText().toString());
		visit(ctx.expr()); //mv.visitInsn(ICONST_0);
		mv.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
		mv.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
		mv.visitInsn(POP);
		return null;
	}

	@Override
	public Void visitIf(emlgParser.IfContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitWhile(emlgParser.WhileContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitPrint(emlgParser.PrintContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitRead(emlgParser.ReadContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitSeq(emlgParser.SeqContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitExpr(emlgParser.ExprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitSec_expr(emlgParser.Sec_exprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitFalse(emlgParser.FalseContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitTrue(emlgParser.TrueContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitNum(emlgParser.NumContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitId(emlgParser.IdContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitNot(emlgParser.NotContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitParens(emlgParser.ParensContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visitPrintchar(emlgParser.PrintcharContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}


}
