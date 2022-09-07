package pro.sky.spring_calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorService {
    @Override
    public String calculator() {
        return String.format("<h1>Добро пожаловать в калькулятор<h1/>");
    }

    @Override
    public String plus(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int suma =  number1 + number2;
        return String.format("<h2>%d + %d = %d<h2/>", number1,number2, suma);
    }

    @Override
    public String minus(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int delta =  number1 - number2;
        return String.format("<h2>%d - %d = %d<h2/>", number1,number2, delta);
    }

    @Override
    public String multiply(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int multiplication =  number1 * number2;
        return String.format("<h2>%d * %d = %d<h2/>", number1,number2, multiplication);
    }

    @Override
    public String divide(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int divider =  number1 / number2;
        return String.format("<h2>%d / %d = %d<h2/>", number1,number2, divider);
    }
}
