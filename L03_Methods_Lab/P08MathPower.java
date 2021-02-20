package L03_Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int powerNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(printPoweredNumber(number, powerNumber)));
    }

    static double printPoweredNumber(double number, int powerNumber) {
        double result = Math.pow(number, powerNumber);
        return result;
    }
}
