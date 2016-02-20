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
			check(source);
		} catch (emlgException x) {
			System.out.println("Contextual analysis failed");
		} catch (Exception x) {
			x.printStackTrace(System.out);
		}

	}

	private static void check(InputStream source) throws Exception {
		emlgLexer lexer = new emlgLexer(new ANTLRInputStream(source));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ParseTree tree = syntacticAnalyse(tokens);
		contextualAnalyse(tree, tokens);

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

	private static void contextualAnalyse(ParseTree tree, CommonTokenStream tokens) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("serial")
	private static class emlgException extends Exception {
	}
}
