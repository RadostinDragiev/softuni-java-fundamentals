package L06_Objects_and_Classes_Lab;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputWord = scanner.nextLine().split("\\s+");
        Random random = new Random();

        for (int i = 0; i < inputWord.length; i++) {
            int j = random.nextInt(inputWord.length);

            String tempWord = inputWord[i];
            inputWord[i] = inputWord[j];
            inputWord[j] = tempWord;
        }

        System.out.println(String.join(System.lineSeparator(), inputWord));
    }
}
