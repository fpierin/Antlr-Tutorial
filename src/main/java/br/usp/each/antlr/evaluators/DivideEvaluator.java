package br.usp.each.antlr.evaluators;

public class DivideEvaluator implements Evaluator {
	
	private final Evaluator op1;
	private final Evaluator op2;	
	
	@Override
	public int evaluate() {
		return op1.evaluate() / op2.evaluate();
	}

	public DivideEvaluator(final Evaluator op1, final Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

}
