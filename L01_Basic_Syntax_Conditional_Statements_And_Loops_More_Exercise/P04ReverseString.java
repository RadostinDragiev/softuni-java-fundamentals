package L01_Basic_Syntax_Conditional_Statements_And_Loops_More_Exercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (int i = word.length(); i > 0; i--) {
            System.out.print(word.charAt(i-1));
        }
    }
}
