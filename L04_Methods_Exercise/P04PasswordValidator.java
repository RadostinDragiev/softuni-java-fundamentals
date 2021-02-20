package L04_Methods_Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine().toLowerCase();

        passwordValidate(password);
    }

    static void passwordValidate(String text) {
        boolean first = containEnoughSymbols(text);
        boolean second = containsLetterAndDigits(text);
        boolean third = containsTwoDigits(text);

        if (first && second && third) {
            System.out.println("Password is valid");
        }
    }

    static boolean containEnoughSymbols(String text) {
        if (text.length() >= 6 && text.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    static boolean containsLetterAndDigits(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!(text.charAt(i) >= 48 && text.charAt(i) <= 57 || text.charAt(i) >= 97 && text.charAt(i) <= 122)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }

        return true;
    }

    static boolean containsTwoDigits(String text) {
        int digitsCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 48 && text.charAt(i) <= 57) {
                digitsCounter++;
            }
        }

        if (digitsCounter < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        } else {
            return true;
        }
    }
}
