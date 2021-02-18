package L03_Arrays_Exercise;

import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());

        String string = scanner.nextLine();
        int[] bestDNA = new int[length];
        int bestSubsequence = 0;
        int bestSum = 0;
        int bestLine = 0;
        int bestTotalSum = 0;
        int currentLine = 0;
        int indexSubsequenceStart = 0;
        while (!(string.equals("Clone them!"))) {
            String[] numbersInput = string.split("!");
            int[] currentDNA = new int[numbersInput.length];
            for (int i = 0; i < numbersInput.length; i++) {
                currentDNA[i] = Integer.parseInt(numbersInput[i]);
            }

            int currentSubsequence = 0;
            int currentSum = 0;
            int currentSubStartIndex = 0;
            int currentTotalSum = 0;
            currentLine++;
            for (int i = 0; i < currentDNA.length; i++) {
                if (currentDNA[i] == 1){

                    if (i == 0 || currentDNA[i - 1] == 1) {
                        currentSubsequence++;
                        currentSum++;
                        if (currentSubsequence > 1) {
                            currentSubStartIndex = i - 1;
                        }
                    }
                }
            }

            if (currentSubsequence >= bestSubsequence) {
                if (currentSubStartIndex <= indexSubsequenceStart) {
                    if (currentTotalSum > bestTotalSum) {
                        bestSubsequence = currentSubsequence;
                        indexSubsequenceStart = currentSubStartIndex;
                        bestLine = currentLine;
                        bestTotalSum = currentTotalSum;
                        for (int i = 0; i < bestDNA.length; i++) {
                            bestDNA[i] = currentDNA[i];
                        }
                    }
                }
            }

            string = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestLine, bestSum);
        for (int number : bestDNA) {
            System.out.print(number + " ");
        }
    }
}