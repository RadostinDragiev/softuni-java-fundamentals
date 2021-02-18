package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());

        int spice = 0;
        int daysCounter = 0;
        while (yield > 0) {
            if (yield < 100) {
                if (spice < 26) {
                    break;
                }
                spice -= 26;
                break;
            }
            spice += (yield -26);
            yield -= 10;
            daysCounter++;
        }

        System.out.println(daysCounter);
        System.out.println(spice);
    }
}
