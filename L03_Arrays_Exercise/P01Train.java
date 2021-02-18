package L03_Arrays_Exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());

        int[] people = new int[wagons];
        int peopleSum = 0;
        for (int i = 0; i < wagons; i++) {
            int peoplePerWagon = Integer.parseInt(scanner.nextLine());
            people[i] = Integer.parseInt(String.valueOf(peoplePerWagon));
            peopleSum += peoplePerWagon;
        }

        for (int number : people) {
            System.out.print(number + " ");
        }
        System.out.printf("%n%d", peopleSum);
    }
}
