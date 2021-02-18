package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double maxVolume = Double.MIN_VALUE;
        for (int i = 0; i < lines; i++) {
            String currentKegName = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume >= maxVolume) {
                maxVolume = volume;
                biggestKeg = currentKegName;
            }
        }

        System.out.println(biggestKeg);
    }
}
