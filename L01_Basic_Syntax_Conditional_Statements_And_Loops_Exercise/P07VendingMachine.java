package L01_Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double moneyForProduct = 0;
        while (!input.equals("Start")) {
            double incomingMoney = Double.parseDouble(input);
            if (incomingMoney == 0.1 || incomingMoney == 0.2 || incomingMoney == 0.5 ||
                    incomingMoney == 1 || incomingMoney == 2) {
                moneyForProduct += incomingMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", incomingMoney);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            boolean isEnoughMoney = true;
            if (product.equals("Nuts")) {
                if (moneyForProduct >= 2) {
                    System.out.println("Purchased Nuts");
                    moneyForProduct -= 2;
                } else {
                    isEnoughMoney = false;
                }
            } else if (product.equals("Water")) {
                if (moneyForProduct >= 0.7) {
                    System.out.println("Purchased Water");
                    moneyForProduct -= 0.7;
                } else {
                    isEnoughMoney = false;
                }
            } else if (product.equals("Crisps")) {
                if (moneyForProduct >= 1.5) {
                    System.out.println("Purchased Crisps");
                    moneyForProduct -= 1.5;
                } else {
                    isEnoughMoney = false;
                }
            } else if (product.equals("Soda")) {
                if (moneyForProduct >= 0.8) {
                    System.out.println("Purchased Soda");
                    moneyForProduct -= 0.8;
                } else {
                    isEnoughMoney = false;
                }
            } else if (product.equals("Coke")) {
                if (moneyForProduct >= 1) {
                    System.out.println("Purchased Coke");
                    moneyForProduct -= 1;
                } else {
                    isEnoughMoney = false;
                }
            } else {
                System.out.println("Invalid product");
            }

            if (!isEnoughMoney) {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", moneyForProduct);
    }
}
