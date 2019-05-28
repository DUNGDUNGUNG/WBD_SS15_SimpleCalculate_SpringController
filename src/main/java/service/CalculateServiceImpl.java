package service;

public class CalculateServiceImpl implements CalculateService {
    @Override
    public String calculate(float a, float b, String operand) {
        switch (operand){
            case "+":
                return a + " + " + b + "=" + (a + b);
            case "-":
                return a + " - " + b + "=" + (a - b);
            case "*":
                return a + " * " + b + "=" + (a * b);
            case "/":
                return a + " / " + b + "=" + (a / b);
        }
        return "error";
    }
}
