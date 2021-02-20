package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersLine = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            if (command[0].equals("Delete")) {
                removeElement(numbersLine, Integer.parseInt(command[1]));
            } else if (command[0].equals("Insert")) {
                int index = Integer.parseInt(command[2]);
                if (index >= 0 && index < numbersLine.size()) {
                    numbersLine.add(index, Integer.valueOf(command[1]));
                }
            }

            input = scanner.nextLine();
        }

        printResult(numbersLine);
    }

    static void removeElement(List<Integer> numbers, int element) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == element) {
                numbers.remove(i);
                i = 0;
            }
        }
    }

    static void printResult(List<Integer> toPrint) {
        for (int num : toPrint) {
            System.out.print(num + " ");
        }
    }
}
