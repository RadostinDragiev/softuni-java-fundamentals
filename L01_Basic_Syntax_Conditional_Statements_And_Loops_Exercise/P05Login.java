package L01_Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        String password = "";
        for (int i = username.length(); i > 0; i--) {
            password += username.charAt(i-1);
        }
        String input = scanner.nextLine();
        boolean isAccountBlocked = false;
        int logginFails = 0;
        while (!input.equals(password)) {
            logginFails++;
            if (logginFails >= 4) {
                isAccountBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        if (isAccountBlocked) {
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
