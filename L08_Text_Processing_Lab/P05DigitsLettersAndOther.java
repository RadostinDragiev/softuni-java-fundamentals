package L08_Text_Processing_Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder alphabet = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder restOfInput = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                alphabet.append(currentChar);
            } else if (Character.isDigit(currentChar)) {
                digits.append(currentChar);
            } else {
                restOfInput.append(currentChar);
            }
        }

        System.out.println(digits.toString());
        System.out.println(alphabet.toString());
        System.out.println(restOfInput.toString());
    }
}
