package pro.sky.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }


    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }

        double result = (double) num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }
}
