package L03_Arrays_Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        String[] secondLine = scanner.nextLine().split(" ");

        for (int secondWord = 0; secondWord < secondLine.length; secondWord++) {
            for (int firstWord = 0; firstWord < firstLine.length; firstWord++) {
                if (secondLine[secondWord].equals(firstLine[firstWord])) {
                    System.out.print(secondLine[secondWord] + " ");
                }
            }
        }
    }
}
