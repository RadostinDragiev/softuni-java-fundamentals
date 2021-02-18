package L03_Arrays_Lab;

import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineOne = scanner.nextLine().split(" ");
        String[] lineTwo = scanner.nextLine().split(" ");

        boolean areTheyEqual = true;
        int indexCounter = 0;
        for (int i = 0; i < lineOne.length; i++) {
            if (!(lineOne[i].equals(lineTwo[i]))) {
                areTheyEqual = false;
                break;
            }
            indexCounter++;
        }

        int lineOneSum = 0;
        if (areTheyEqual) {
            for (int i = 0; i < lineOne.length; i++) {
                int tempNum = Integer.parseInt(lineOne[i]);
                lineOneSum += tempNum;
            }
        }

        if (areTheyEqual) {
            System.out.printf("Arrays are identical. Sum: %d", lineOneSum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", indexCounter);
        }
    }
}
