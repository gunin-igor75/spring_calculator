package pro.sky.spring_calculator;

public interface CalculatorService {
    String calculator();
    String plus(String num1, String num2);
    String minus(String num1, String num2);
    String multiply(String num1, String num2);
    String divide(String num1, String num2);
}
