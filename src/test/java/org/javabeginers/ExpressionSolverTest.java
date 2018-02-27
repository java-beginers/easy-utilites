package org.javabeginers;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

/**
 * Тесты для пока несуществующего класса.
 * 1. При инициализации с пустой строкой - IllegalArgumentException
 * 2. Если вместо строки null или строка из одних пробелов - то так же IllegalArgumentException
 * 3. Пробуем вычислить простое выражение 3 + 2 Результатом должно быть 5
 * 4. Пробуем вычислить различные выражения.
 * 5. Пробуем вычислить различные некорректные выражения
 */
public class ExpressionSolverTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithNullStringWillThrowIAE() {
        ExpressionSolver solver = new ExpressionSolver(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithEmptyStringWillThrowIAE() {
        ExpressionSolver solver = new ExpressionSolver("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithBlankStringWillThrowIAE() {
        ExpressionSolver solver = new ExpressionSolver("   ");
    }

    @Test
    // TODO: 27.02.18 Подумать как упростить передачу параметров и обработку выражений.
    public void testSolverWithCorrectExpression() {
        BigDecimal result = new ExpressionSolver("3 + 2").solve();
        assertEquals(new BigDecimal("5"), result.setScale(0, RoundingMode.HALF_UP));
        result = new ExpressionSolver("-3 + 2").solve();
        assertEquals(new BigDecimal("-1"), result.setScale(0, RoundingMode.HALF_UP));
        result = new ExpressionSolver("3 + -2").solve();
        assertEquals(new BigDecimal("1"), result.setScale(0, RoundingMode.HALF_UP));
        result = new ExpressionSolver("-3 * 2").solve();
        assertEquals(new BigDecimal("-6"), result.setScale(0, RoundingMode.HALF_UP));
        result = new ExpressionSolver("-3 / 2").solve();
        assertEquals(new BigDecimal("-1.5"), result.setScale(1, RoundingMode.HALF_UP));
        result = new ExpressionSolver("2 + 2 * 2").solve();
        assertEquals(new BigDecimal("6"), result.setScale(0, RoundingMode.HALF_UP));
        result = new ExpressionSolver("2 + 2 / 2").solve();
        assertEquals(new BigDecimal("1"), result.setScale(0, RoundingMode.HALF_UP));
    }

    @Test(expected = IllegalStateException.class)
    public void testSolverWithIncorrectExpression1() {
        BigDecimal result = new ExpressionSolver("3 + - 2").solve();
    }

    @Test(expected = IllegalStateException.class)
    public void testSolverWithIncorrectExpression2() {
        BigDecimal result = new ExpressionSolver("3 +").solve();
    }

    @Test(expected = IllegalStateException.class)
    public void testSolverWithIncorrectExpression3() {
        BigDecimal result = new ExpressionSolver("3").solve();
    }

    @Test(expected = IllegalStateException.class)
    public void testSolverWithIncorrectExpression4() {
        BigDecimal result = new ExpressionSolver("3 2").solve();
    }

    @Test(expected = IllegalStateException.class)
    public void testSolverWithIncorrectExpression5() {
        BigDecimal result = new ExpressionSolver("3 (2 + 3)").solve();
    }

    @Test(expected = IllegalStateException.class)
    public void testSolverWithIncorrectExpression6() {
        BigDecimal result = new ExpressionSolver("3  - 2 + 3)").solve();
    }

    // TODO: 27.02.18 Добавить свои тесты. Поискать пример на счет параметризации выражений, подаваемых на вход
    // Чтобы не писать 100500 рестов, а задать какой-то массив значений.
}