package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            if (commands[0].equals("Add")) {
                wagons.add(Integer.parseInt(commands[1]));
            } else {

                for (int i = 0; i < wagons.size(); i++) {
                    int incomingPassengers = Integer.parseInt(input) + wagons.get(i);
                    if (incomingPassengers <= maxCapacity) {
                        wagons.set(i, incomingPassengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (int number : wagons) {
            System.out.print(number + " ");
        }
    }
}
