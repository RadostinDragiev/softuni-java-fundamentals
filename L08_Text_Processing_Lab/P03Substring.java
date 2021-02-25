package L08_Text_Processing_Lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(wordToRemove)) {
            text = text.replace(wordToRemove, "");
        }

        System.out.println(text);
    }
}
