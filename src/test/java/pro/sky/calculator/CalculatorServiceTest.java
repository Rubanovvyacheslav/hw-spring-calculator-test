package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.services.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void plusSuccess1() {
        int num1 = 3;
        int num2 = 4;

        String result = calculatorService.plus(num1, num2);
        String expectedResult = "3+4=7";
        assertEquals(expectedResult, result);
    }
    @Test
    void plusSuccess2() {
        int num1 = 7;
        int num2 = 6;

        String result = calculatorService.plus(num1, num2);
        String expectedResult = "7+6=13";
        assertEquals(expectedResult, result);
    }
    @Test
    void minusSuccess1() {
        int num1 = 7;
        int num2 = 1;

        String result = calculatorService.minus(num1, num2);
        String expectedResult = "7-1=6";
        assertEquals(expectedResult, result);
    }
    @Test
    void minusSuccess2() {
        int num1 = 15;
        int num2 = 11;

        String result = calculatorService.minus(num1, num2);
        String expectedResult = "15-11=4";
        assertEquals(expectedResult, result);
    }
    @Test
    void multiplySuccess1() {
        int num1 = 4;
        int num2 = 5;

        String result = calculatorService.multiply(num1, num2);
        String expectedResult = "4*5=20";
        assertEquals(expectedResult, result);
    }
    @Test
    void multiplySuccess2() {
        int num1 = 3;
        int num2 = 4;

        String result = calculatorService.multiply(num1, num2);
        String expectedResult = "3*4=12";
        assertEquals(expectedResult, result);
    }
    @Test
    void divideSuccess1() {
        int num1 = 12;
        int num2 = 3;

        String result = calculatorService.divide(num1, num2);
        String expectedResult = "12/3=4.0";
        assertEquals(expectedResult, result);
    }
    @Test
    void divideSuccess2() {
        int num1 = 24;
        int num2 = 4;

        String result = calculatorService.divide(num1, num2);
        String expectedResult = "24/4=6.0";
        assertEquals(expectedResult, result);
    }
@Test
    void divideZeroSuccess() {
    int num1 = 24;
    int num2 = 0;

    String excpectedErrorMessage = "На ноль делить нельзя";
    Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num2));
    assertEquals(excpectedErrorMessage, exception.getMessage());
    }

    @Test
    void greetingsSuccess() {

        String expectedResult = "Добро пожаловать в калькулятор";

        String actualResult = calculatorService.greetings();
        assertEquals(expectedResult, actualResult);
    }
}


