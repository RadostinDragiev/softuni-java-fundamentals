package L02_Data_Types_And_Variables_Lab;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        int population = scanner.nextInt();
        int are = scanner.nextInt();

        String result = String.format("Town %s has population of %d and area %d square km.",
                town, population, are);
        System.out.println(result);
    }
}
