package pro.sky.spring_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String calculator() {
        return calculator.calculator();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam ("num1") String num1,
                       @RequestParam ("num2") String num2) {
        return calculator.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam ("num1") String num1,
                       @RequestParam ("num2") String num2) {
        return calculator.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam ("num1") String num1,
                       @RequestParam ("num2") String num2) {
        return calculator.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam ("num1") String num1,
                           @RequestParam ("num2") String num2) {
        return calculator.divide(num1, num2);
    }
}
