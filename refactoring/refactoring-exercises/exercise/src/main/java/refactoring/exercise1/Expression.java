package refactoring.exercise1;

public class Expression {

	private char op;

	private Expression left;

	private Expression right;

	private int constant;

	public Expression(int constant) {
		this.op = 'c';
		this.constant = constant;
	}

	public Expression(char op, Expression left, Expression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public int evaluate() {
		switch (op) {
		case 'c':
			return constant;
		case '+':
			return left.evaluate() + right.evaluate();
		case '-':
			return left.evaluate() - right.evaluate();
		case '*':
			return left.evaluate() * right.evaluate();
		case '/':
			return left.evaluate() / right.evaluate();
		default:
			throw new IllegalStateException();
		}
	}

    public String  getExpressionDescription() {
        switch (op) {
            case 'c':
                return "Constant";
            case '+':
                return "Addition";
            case '-':
                return "Subtraction";
            case '*':
                return "Multiplication";
            case '/':
                return "Division";
            default:
                throw new IllegalStateException();
        }
    }
}
