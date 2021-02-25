package L08_Text_Processing_Exercise;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceFirst("^0+(?!$)", "");
        int numberToMultiply = Integer.parseInt(scanner.nextLine());

        if (input.isEmpty()) {
            input = "0";
        }

        if (numberToMultiply == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder revercedOutput = new StringBuilder();
        int reminder = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(String.valueOf(input.charAt(i)));
            int calculation = number * numberToMultiply + reminder;
            if (calculation >= 10) {
                int toAppend = calculation % 10;
                reminder = calculation / 10;
                revercedOutput.append(toAppend);
            } else {
                revercedOutput.append(calculation);
                reminder = 0;
            }

            if (i == 0 && reminder != 0) {
                String remind = Integer.toString(reminder);
                String revercedNum = new StringBuffer(remind).reverse().toString();
                revercedOutput.append(revercedNum);
            }
        }

        System.out.println(revercedOutput.reverse());

    }
}
