package L05_Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commands = command.split(" ");

            if (commands[0].equals("Add")) {
                numbers.add(Integer.parseInt(commands[1]));
            } else if (commands[0].equals("Remove")) {
                numbers.remove(Integer.valueOf(Integer.parseInt(commands[1])));
            } else if (commands[0].equals("RemoveAt")) {
                numbers.remove(Integer.parseInt(commands[1]));
            } else if (commands[0].equals("Insert")) {
                numbers.add(Integer.parseInt(commands[2]), Integer.parseInt(commands[1]));
            }

            command = scanner.nextLine();
        }

        printLis(numbers);
    }

    private static void printLis(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
