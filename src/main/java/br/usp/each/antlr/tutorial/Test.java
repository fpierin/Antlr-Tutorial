package br.usp.each.antlr.tutorial;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {
	
	public static void main(final String[] args) throws RecognitionException {
		final CharStream stream = new ANTLRStringStream("3 * (2 + 4) * 3");
		final Sample2Lexer lexer = new Sample2Lexer(stream);
		final TokenStream tokenStream = new CommonTokenStream(lexer);
		final Sample2Parser parser = new Sample2Parser(tokenStream);
		final int result = parser.evaluator();
		System.out.println("ok - result is " + result);
	}

}
