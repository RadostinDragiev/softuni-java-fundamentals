package L08_Text_Processing_Exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");



        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            boolean isValid = false;
            if (currentWord.length() >= 3 && currentWord.length() <= 16) {
                for (int j = 0; j < currentWord.length(); j++) {
                    if (!Character.isLetterOrDigit(currentWord.charAt(j))) {
                        if (!(currentWord.charAt(j) == '-')) {
                            if (!(currentWord.charAt(j) == '_')) {
                                isValid = false;
                                break;
                            }
                        }
                    } else {
                        isValid = true;
                    }
                }
                if (isValid) {
                    System.out.println(currentWord);
                }
            }
        }
    }
}
