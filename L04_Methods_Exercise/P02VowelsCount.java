package L04_Methods_Exercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        System.out.println(vowelsFromText(text));
    }

    static int vowelsFromText(String text) {
        int vowels = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': vowels++;
            }
        }

        return vowels;
    }
}
