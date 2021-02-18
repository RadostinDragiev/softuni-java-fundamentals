package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int start = 97;
        int end = 97 + n;
        for (int i = start; i < end; i++) {
            for (int j = start; j < end; j++) {
                for (int k = start; k < end; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
