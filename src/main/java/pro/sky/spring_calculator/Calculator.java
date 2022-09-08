package pro.sky.spring_calculator;

import org.springframework.stereotype.Service;

import javax.print.DocFlavor;

@Service
public class Calculator implements CalculatorService {
    @Override
    public String calculator() {
        return "<h1>Добро пожаловать в калькулятор<h1/>";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        String response = check(num1, num2);
        if (!response.equals("good")) {
            return response;
        }
        int suma = num1 + num2;
        return String.format("<h2>%d + %d = %d<h2/>", num1, num2, suma);
    }


    @Override
    public String minus(Integer num1, Integer num2) {
        String response = check(num1, num2);
        if (!response.equals("good")) {
            return response;
        }
        int delta = num1 - num2;
        return String.format("<h2>%d - %d = %d<h2/>", num1, num2, delta);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        String response = check(num1, num2);
        if (!response.equals("good")) {
            return response;
        }
        int multiplication = num1 * num2;
        return String.format("<h2>%d * %d = %d<h2/>", num1, num2, multiplication);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        String response = check(num1, num2);
        if (!response.equals("good")) {
            return response;
        }
        if (num2 == 0) {
            return "<h1>Деление на 0<h2>";
        }
        int divider = num1 / num2;
        return String.format("<h2>%d / %d = %d<h2/>", num1, num2, divider);
    }

    private String check(Integer num1, Integer num2) {
        String response = "good";
        if (num1 == null && num2 == null) {
            response = "<h2>Не переданы параметры<h2/>";
        } else if (num1 == null) {
            response = "<h2>Не передан параметр num1<h2/>";
        } else if (num2 == null) {
            response = "<h2>Не передан параметр num2<h2/>";
        }
        return response;
    }
}
