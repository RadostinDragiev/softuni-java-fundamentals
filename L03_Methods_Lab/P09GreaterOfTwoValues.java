package L03_Methods_Lab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        getMax(input, a, b);
    }

    static void getMax(String input, String a, String b) {
        if (input.equals("int")) {
            int firstNumber = Integer.parseInt(a);
            int secondNumber = Integer.parseInt(b);
            System.out.println(integerMax(firstNumber, secondNumber));
        } else if (input.equals("char")) {
            char firstCh = a.charAt(0);
            char secondCh = b.charAt(0);
            System.out.println(chMax(firstCh, secondCh));
        } else {
            System.out.println(strMax(a, b));
        }
    }

    static int integerMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static char chMax(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static String strMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }
}
