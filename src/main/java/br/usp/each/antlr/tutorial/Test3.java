package br.usp.each.antlr.tutorial;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import br.usp.each.antlr.evaluators.Evaluator;

public class Test3 {
	
	public static void main(final String[] args) throws RecognitionException {
		final CharStream stream = new ANTLRStringStream("3 * (2 + 4) * 3");
		final Sample3Lexer lexer = new Sample3Lexer(stream);
		final TokenStream tokenStream = new CommonTokenStream(lexer);
		final Sample3Parser parser = new Sample3Parser(tokenStream);
		final Evaluator evaluator = parser.evaluator();
		System.out.println("ok - result is " + evaluator.evaluate());
	}

}
