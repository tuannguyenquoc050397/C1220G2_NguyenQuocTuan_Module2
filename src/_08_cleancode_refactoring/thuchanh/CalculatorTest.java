package _08_cleancode_refactoring.thuchanh;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static final char EQUAL = '=';

    @Test
    @DisplayName("Testing addition")
    public void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operand = ADDITION;
        int expected = 2;
        int result = Calculator.calculate(firstOperand, secondOperand, operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    public void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operand = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    public void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        char operand = MULTIPLICATION;
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    public void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        char operand = DIVISION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operand);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    public void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operand = DIVISION;

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(firstOperand, secondOperand, operand);
                });
    }

    @Test
    @DisplayName("Testing wrong operator")
    public void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operand = EQUAL;

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(firstOperand, secondOperand, operand);
                });
    }
}
