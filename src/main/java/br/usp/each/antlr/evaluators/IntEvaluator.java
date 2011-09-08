package br.usp.each.antlr.evaluators;

public class IntEvaluator implements Evaluator {

	private final int value;
	
	@Override
	public int evaluate() {
		return value;
	}

	public IntEvaluator(final int value) {
		this.value = value;
	}

}
