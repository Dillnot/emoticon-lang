import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class emlgrun {

	public static void main(String[] args) {
		try {
			if (args.length == 0)
				throw new emlgException();
			InputStream source = new FileInputStream(args[0]);
			checkAndExec(source);

		} catch (emlgException x) {
			System.out.println("Contextual analysis failed");
		} catch (Exception x) {
			x.printStackTrace(System.out);
		}

	}

	private static void checkAndExec(InputStream source) throws Exception {
		emlgLexer lexer = new emlgLexer(new ANTLRInputStream(source));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ParseTree tree = syntacticAnalyse(tokens);
		//ExecVisitor exec = new ExecVisitor();
		compVisitor exec = new compVisitor();
		System.out.println("executing...");
		exec.visit(tree);
		System.out.println(exec.getClassByteArray());

	}

	private static ParseTree syntacticAnalyse(CommonTokenStream tokens) throws Exception {

		System.out.println();
		System.out.println("Syntactic analysis ...");
		emlgParser parser = new emlgParser(tokens);
		ParseTree tree = parser.program();
		int errors = parser.getNumberOfSyntaxErrors();
		System.out.println(errors + " syntactic errors");
		if (errors > 0)
			throw new emlgException();
		return tree;
	}

	@SuppressWarnings("serial")
	private static class emlgException extends Exception {
	}
}
