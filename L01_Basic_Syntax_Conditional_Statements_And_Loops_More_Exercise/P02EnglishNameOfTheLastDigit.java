package L01_Basic_Syntax_Conditional_Statements_And_Loops_More_Exercise;

import java.util.Scanner;

public class P02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 10) {
            number %= 10;
        }

        String numberWhitWord = "";
        switch (number) {
            case 0: {numberWhitWord = "zero"; break;}
            case 1: {numberWhitWord = "one"; break;}
            case 2: {numberWhitWord = "two"; break;}
            case 3: {numberWhitWord = "three"; break;}
            case 4: {numberWhitWord = "four"; break;}
            case 5: {numberWhitWord = "five"; break;}
            case 6: {numberWhitWord = "six"; break;}
            case 7: {numberWhitWord = "seven"; break;}
            case 8: {numberWhitWord = "eight"; break;}
            case 9: {numberWhitWord = "nine"; break;}
        }

        System.out.println(numberWhitWord);
    }
}
