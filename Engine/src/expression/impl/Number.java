package expression.impl;
import expression.Expression;
import expression.NumericExpression;

public class Number implements Expression<Double>,NumericExpression {

    private double value;

    public Number() {}

    public Number(double value) {
        this.value = value;
    }

    @Override
    public Double evaluate() {
        return value;
    }

    @Override
    public String getOperationSign() {
        return "";
    }

}
