package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double snowballValue = 0;
        double bestSnow = 0;
        double bestTime = 0;
        double bestQuality = 0;
        for (int i = 0; i < n; i++) {
            double snow = Double.parseDouble(scanner.nextLine());
            double time = Double.parseDouble(scanner.nextLine());
            double quality = Double.parseDouble(scanner.nextLine());

            double snowDidivedByTime = snow / time;
            double value = Math.pow(snowDidivedByTime, quality);

            if (value >= snowballValue) {
                snowballValue = value;
                bestSnow = snow;
                bestTime = time;
                bestQuality = quality;
            }
        }

        System.out.printf("%.0f : %.0f = %.0f (%.0f)", bestSnow, bestTime, snowballValue, bestQuality);
    }
}
