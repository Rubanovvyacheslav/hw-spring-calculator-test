package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.services.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParametrizedTest {

    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(1, 1, "1+1=2"),
                Arguments.of(4, 3, "4+3=7"),
                Arguments.of(2, 7, "2+7=9")
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.plus(num1, num2));
    }


    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(1, 1, "1-1=0"),
                Arguments.of(4, 3, "4-3=1"),
                Arguments.of(10, 7, "10-7=3")
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.minus(num1, num2));
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(7, 2, "7*2=14"),
                Arguments.of(4, 3, "4*3=12"),
                Arguments.of(10, 7, "10*7=70")
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(8, 2, "8/2=4.0"),
                Arguments.of(36, 6, "36/6=6.0"),
                Arguments.of(10, 2, "10/2=5.0")
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String result) {
        assertEquals(result, calculatorService.divide(num1, num2));
    }
}
