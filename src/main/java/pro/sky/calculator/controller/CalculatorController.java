package pro.sky.calculator.controller;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import pro.sky.calculator.services.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @ExceptionHandler({MissingServletRequestParameterException.class})
    public String handleException(MissingServletRequestParameterException e) {
        return "Не хватает параметров";
    }

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divide(num1, num2);
    }
}
