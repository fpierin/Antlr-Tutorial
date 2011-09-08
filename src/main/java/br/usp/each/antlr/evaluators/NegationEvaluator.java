package br.usp.each.antlr.evaluators;

public class NegationEvaluator implements Evaluator {
	
	private final Evaluator op1;
	
	@Override
	public int evaluate() {
		return -op1.evaluate();
	}

	public NegationEvaluator(final Evaluator op1) {
		this.op1 = op1;
	}

}
