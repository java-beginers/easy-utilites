package org.javabeginers;

import java.math.BigDecimal;
import java.util.Map;

public class ExpressionSolver {
    private String expression;
    private Map<String, BigDecimal> params;

    public ExpressionSolver(String expression) {
        this.expression = expression;
        checkString();
    }

    public ExpressionSolver(String expression, Map<String, BigDecimal> params) {
        this.expression = expression;
        this.params = params;
        checkString();
    }

    public BigDecimal solve(){
        return BigDecimal.ZERO;
    }

    private void checkString() {
        if (StringUtils.isBlank(expression)) {
            throw new IllegalArgumentException("Выражение не должно быть пустым!");
        }
    }
}
