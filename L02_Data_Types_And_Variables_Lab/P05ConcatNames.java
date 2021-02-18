package L02_Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameA = scanner.nextLine();
        String nameB = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = String.format("%s%s%s", nameA, delimiter, nameB);
        System.out.println(result);
    }
}
