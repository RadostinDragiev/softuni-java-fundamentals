package L04_Methods_Exercise;

import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(" ");

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("end")) {

            commandInput = scanner.nextLine();
        }
    }
}
