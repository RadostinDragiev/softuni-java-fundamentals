package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            int numberToDo = 0;
            int index = 0;

            if (command[0].equals("Add")) {
                numberToDo = Integer.parseInt(command[1]);
                numbers.add(numberToDo);
            } else if (command[0].equals("Insert")) {
                index = Integer.parseInt(command[2]);
                if (index >= 0 && index < numbers.size()) {
                    numberToDo = Integer.parseInt(command[1]);
                    numbers.add(index, numberToDo);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command[0].equals("Remove")) {
                index = Integer.parseInt(command[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command[0].equals("Shift")) {
                int positionsToMove = 0;
                int tempPlace = 0;
                if (command[1].equals("left")) {
                    positionsToMove = Integer.parseInt(command[2]);
                    for (int i = 0; i < positionsToMove; i++) {
                        tempPlace = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(tempPlace);
                    }
                } else {
                    positionsToMove = Integer.parseInt(command[2]);
                    for (int i = 0; i < positionsToMove; i++) {
                        tempPlace = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, tempPlace);
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int nums : numbers) {
            System.out.print(nums + " ");
        }
    }
}
