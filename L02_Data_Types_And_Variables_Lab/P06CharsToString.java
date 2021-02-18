package L02_Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letterA = scanner.next().charAt(0);
        char letterB = scanner.next().charAt(0);
        char letterC = scanner.next().charAt(0);

        System.out.printf("%c%c%c", letterA, letterB, letterC);
    }
}
