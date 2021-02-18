package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterTankCapacity = 255;

        int lines = Integer.parseInt(scanner.nextLine());
        int waterInTank = 0;
        for (int i = 0; i < lines; i++) {
            int incomingWater = Integer.parseInt(scanner.nextLine());
            if (waterInTank + incomingWater > waterTankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                waterInTank += incomingWater;
            }
        }

        System.out.println(waterInTank);
    }
}
