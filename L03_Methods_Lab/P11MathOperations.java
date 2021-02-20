package L03_Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        ;

        System.out.println(new DecimalFormat("0.####").format (calculation(operator, firstNumber, secondNumber)));
    }

    static double calculation(String operator, double firstNumber, double secondNumber) {
        double sum = 0;
        switch (operator) {
            case "+": {sum = firstNumber + secondNumber; break;}
            case "-": {sum = firstNumber - secondNumber; break;}
            case "*": {sum = firstNumber * secondNumber; break;}
            case "/": {sum = firstNumber / secondNumber; break;}
        }

        return sum;
    }
}
