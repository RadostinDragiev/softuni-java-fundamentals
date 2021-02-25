package L08_Text_Processing_Exercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder wordToPrint = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = (char) (input.charAt(i) + 3);
            wordToPrint.append(ch);
        }

        System.out.println(wordToPrint.toString());
    }
}
