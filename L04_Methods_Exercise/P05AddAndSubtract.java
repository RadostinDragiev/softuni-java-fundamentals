package L04_Methods_Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractThird(sumFirstTwo(firstNumber, secondNumber), thirdNumber));
    }

    static int sumFirstTwo(int first, int second) {
        return first + second;
    }

    static int subtractThird(int firstSum, int third) {
        return firstSum - third;
    }
}
