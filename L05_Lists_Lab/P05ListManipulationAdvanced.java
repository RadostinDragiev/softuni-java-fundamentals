package L05_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Contains")) {
                if (numbers.contains(Integer.parseInt(command[1]))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command[0].equals("Print")) {
                printNumbersByType(numbers, command[1]);
            } else if (command[0].equals("Get")) {
                System.out.println(sumAllNumbers(numbers));
            } else if (command[0].equals("Filter")) {
                printFilteredNumbers(numbers, command[1], Integer.parseInt(command[2]));
            }

            input = scanner.nextLine();
        }
    }

    static void printNumbersByType(List<Integer> numbers, String type) {
        if (type.equals("even")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 != 0) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
            System.out.println();
        }
    }

    static int sumAllNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        return sum;
    }

    static void printFilteredNumbers(List<Integer> numbers, String condition, int numberForFilter) {
        for (int i = 0; i < numbers.size(); i++) {
            if (condition.equals(">")) {
                if (numbers.get(i) > numberForFilter) {
                    System.out.print(numbers.get(i) + " ");
                }
            } else if (condition.equals("<")) {
                if (numbers.get(i) < numberForFilter) {
                    System.out.print(numbers.get(i) + " ");
                }
            } else if (condition.equals(">=")) {
                if (numbers.get(i) >= numberForFilter) {
                    System.out.print(numbers.get(i) + " ");
                }
            } else if (condition.equals("<=")) {
                if (numbers.get(i) <= numberForFilter) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        }
        System.out.println();
    }
}
