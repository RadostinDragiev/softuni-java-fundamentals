package L04_Methods_Exercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber, secondNumber, thirdNumber);
    }

    static void printSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }
    }
}
