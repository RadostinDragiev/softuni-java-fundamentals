package L03_Methods_Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToPrint = scanner.nextLine();
        int printerCount = Integer.parseInt(scanner.nextLine());

        printWord(wordToPrint, printerCount);
    }

    static void printWord(String word, int counter) {
        String[] words = new String[counter];
        for (int i = 0; i < words.length; i++) {
            words[i] = word;
        }

        word = String.join("", words);
        System.out.println(word);
    }
}
