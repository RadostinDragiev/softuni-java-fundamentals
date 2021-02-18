package L02_Data_Types_And_Variables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < numbersCount; i++) {
            String numberStr = scanner.next();
            BigDecimal number = new BigDecimal(numberStr);
            sum = sum.add(number);
        }

        System.out.println(sum);
    }
}
