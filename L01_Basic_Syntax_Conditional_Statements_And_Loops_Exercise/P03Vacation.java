package L01_Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String peopleType = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;
        if (peopleType.equals("Students")) {
            switch (day) {
                case "Friday": {totalPrice = peopleCount * 8.45; break;}
                case "Saturday": {totalPrice = peopleCount * 9.80; break;}
                case "Sunday": {totalPrice = peopleCount * 10.46; break;}
            }
            if (peopleCount >= 30) {
                totalPrice *= 0.85;
            }
        } else if (peopleType.equals("Business")) {
            if (peopleCount >= 100) {
                peopleCount -= 10;
            }
            switch (day) {
                case "Friday": {totalPrice = peopleCount * 10.90; break;}
                case "Saturday": {totalPrice = peopleCount * 15.60; break;}
                case "Sunday": {totalPrice = peopleCount * 16; break;}
            }
        } else {
            switch (day) {
                case "Friday": {totalPrice = peopleCount * 15; break;}
                case "Saturday": {totalPrice = peopleCount * 20; break;}
                case "Sunday": {totalPrice = peopleCount * 22.50; break;}
            }
            if (peopleCount >= 10 && peopleCount <= 20) {
                totalPrice *= 0.95;
            }
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
