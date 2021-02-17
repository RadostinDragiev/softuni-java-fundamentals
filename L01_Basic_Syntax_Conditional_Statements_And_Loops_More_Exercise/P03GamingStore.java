package L01_Basic_Syntax_Conditional_Statements_And_Loops_More_Exercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyCap = Double.parseDouble(scanner.nextLine());

        double moneySpendForGames = 0;
        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            if (input.equals("OutFall 4")) {
                if (moneyCap < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    moneySpendForGames += 39.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("CS: OG")) {
                if (moneyCap < 15.99) {
                    System.out.println("Too Expensive");
                } else {
                    moneySpendForGames += 15.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("Zplinter Zell")) {
                if (moneyCap < 19.99) {
                    System.out.println("Too Expensive");
                } else {
                    moneySpendForGames += 19.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("Honored 2")) {
                if (moneyCap < 59.99) {
                    System.out.println("Too Expensive");
                } else {
                    moneySpendForGames += 59.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("RoverWatch")) {
                if (moneyCap < 29.99) {
                    System.out.println("Too Expensive");
                } else {
                    moneySpendForGames += 29.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                if (moneyCap < 39.99) {
                    System.out.println("Too Expensive");
                } else {
                    moneySpendForGames += 39.99;
                    System.out.printf("Bought %s%n", input);
                }
            } else {
                System.out.println("Not Found");
            }

            if (moneySpendForGames >= moneyCap) {
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();
        }

        if (moneyCap > moneySpendForGames) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpendForGames, moneyCap - moneySpendForGames);
        }
    }
}
