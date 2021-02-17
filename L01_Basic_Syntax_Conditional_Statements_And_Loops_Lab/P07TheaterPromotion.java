package L01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P07TheaterPromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int age = scanner.nextInt();

        boolean isError = false;
        int ticketPrice = 0;
        if (age >= 0 && age <= 18) {
            switch (dayType) {
                case "Weekday": {ticketPrice = 12; break;}
                case "Weekend": {ticketPrice = 15; break;}
                case "Holiday": {ticketPrice = 5; break;}
            }
        } else if (age >= 18 && age <= 64) {
            switch (dayType) {
                case "Weekday": {ticketPrice = 18; break;}
                case "Weekend": {ticketPrice = 20; break;}
                case "Holiday": {ticketPrice = 12; break;}
            }
        } else if (age >= 64 && age <= 122) {
            switch (dayType) {
                case "Weekday": {ticketPrice = 12; break;}
                case "Weekend": {ticketPrice = 15; break;}
                case "Holiday": {ticketPrice = 10; break;}
            }
        } else {
            isError = true;
        }

        if (!isError) {
            System.out.printf("%d$", ticketPrice);
        } else {
            System.out.println("Error!");
        }
    }
}
