package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        int calculation = ((number1 + number2) / number3) * number4;
        System.out.println(calculation);
    }
}
