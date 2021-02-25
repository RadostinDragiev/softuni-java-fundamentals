package L08_Text_Processing_Exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int totalSum = calculateTheirValue(input[0], input[1]);
        System.out.println(totalSum);
    }

    private static int calculateTheirValue(String firstWord, String secondWord) {
        int sum = 0;
        for (int i = 0; i < Math.min(firstWord.length(), secondWord.length()); i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }
        for (int i = Math.min(firstWord.length(), secondWord.length()); i < Math.max(firstWord.length(), secondWord.length()); i++) {
            if (firstWord.length() > secondWord.length()) {
                sum += firstWord.charAt(i);
            } else {
                sum += secondWord.charAt(i);
            }
        }

        return sum;
    }

}
