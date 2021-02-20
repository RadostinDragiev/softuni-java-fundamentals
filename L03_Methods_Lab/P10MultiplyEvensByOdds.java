package L03_Methods_Lab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 0) {
            number = Math.abs(number);
        }

        multiplyNumbers(number);
    }

    static void multiplyNumbers(int number) {
        String numberToStr = String.valueOf(number);
        int[] numberArr = new int[numberToStr.length()];
        numberToArr(numberToStr, numberArr);

        int evenSum = evenAdd(numberArr);
        int oddSum = oddAdd(numberArr);
        System.out.println(evenSum * oddSum);

    }

    static int[] numberToArr(String number, int[] numberArr) {
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return numberArr;
    }

    static int evenAdd(int[] numbers) {
        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            }
        }

        return evenSum;
    }

    static int oddAdd(int[] numbers) {
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddSum += numbers[i];
            }
        }

        return oddSum;
    }
}