package L01_Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice =Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadset = 0;
        int trashedMouse = 0;
        int trashedKeyboard = 0;
        int trashedDisplay = 0;
        for (int i = 1; i <= lostGameCount; i++) {
            if (i % 2 == 0) {
                trashedHeadset++;
            }
            if (i % 3 == 0) {
                trashedMouse++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                trashedKeyboard++;
            }
        }
        if (trashedKeyboard >= 2) {
            trashedDisplay = Math.abs(trashedKeyboard / 2);
        }

        double totalExpenses = (trashedHeadset * headsetPrice) + (trashedMouse * mousePrice)
                + (trashedKeyboard * keyboardPrice) + (trashedDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
