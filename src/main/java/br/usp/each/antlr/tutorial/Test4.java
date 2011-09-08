package br.usp.each.antlr.tutorial;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import br.usp.each.antlr.tutorial.Sample4Parser.evaluator_return;

public class Test4 {
	
	public static void main(final String[] args) throws RecognitionException {
		final CharStream stream = new ANTLRStringStream("3 * (2 + 4) * 3");
		final Sample4Lexer lexer = new Sample4Lexer(stream);
		final TokenStream tokenStream = new CommonTokenStream(lexer);
		final Sample4Parser parser = new Sample4Parser(tokenStream);
		evaluator_return evaluator = parser.evaluator();
		System.out.println(evaluator.tree.toStringTree());
		
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(evaluator.tree);
		EvaluatorWalker walker =  new EvaluatorWalker(nodeStream);
		int result = walker.evaluator();
		System.out.println("ok - result " + result);
	}

}
