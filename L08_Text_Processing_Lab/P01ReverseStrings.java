package L08_Text_Processing_Lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String word = input;

            String reversedWord = reverseWord(word);

            System.out.printf("%s = %s%n", word, reversedWord);
            input = scanner.nextLine();
        }
    }

    private static String reverseWord(String word) {
        String returnWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            returnWord += word.charAt(i);
        }
        return returnWord;
    }
}
