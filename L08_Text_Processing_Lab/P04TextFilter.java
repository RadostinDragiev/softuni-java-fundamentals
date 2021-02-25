package L08_Text_Processing_Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] forbiddenWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < forbiddenWords.length; i++) {
            String fWord = forbiddenWords[i];
            String wordToReplace = censorWord(fWord);
            while (text.contains(fWord)) {
                text = text.replace(fWord, wordToReplace);
            }
        }

        System.out.println(text);
    }

    private static String censorWord(String fWord) {
        String[] wordInArr = new String[fWord.length()];
        for (int i = 0; i < fWord.length(); i++) {
            wordInArr[i] = "*";
        }

        return String.join("", wordInArr);
    }
}
