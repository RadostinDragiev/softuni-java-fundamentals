package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int m2 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());

        int poketTargets = 0;
        int incomingN1 = n1;
        do {
            incomingN1 -= m2;
            poketTargets++;
            if (incomingN1 * 2.0 == n1 && y3 != 0) {
                incomingN1 /= y3;

            }
        } while (incomingN1 >= m2);

        System.out.println(incomingN1);
        System.out.println(poketTargets);
    }
}
