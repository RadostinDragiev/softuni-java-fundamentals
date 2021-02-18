package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int symbol1 = scanner.nextInt();
        int symbol2 = scanner.nextInt();

        for (int i = symbol1; i <= symbol2; i++) {
            System.out.print((char) i + " ");
        }
    }
}
