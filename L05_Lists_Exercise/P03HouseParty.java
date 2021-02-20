package L05_Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandsCount = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < commandsCount; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            if (command[2].equals("not")) {
                if (guests.contains(command[0])) {
                    String guestToRemove = command[0];
                    guests.remove(guestToRemove);
                } else {
                    System.out.printf("%s is not in the list!%n", command[0]);
                }
            } else {
                if (guests.contains(command[0])) {
                    System.out.printf("%s is already in the list!%n", command[0]);
                } else {
                    guests.add(command[0]);
                }
            }
        }

        for (String namesToPrint : guests) {
            System.out.println(namesToPrint);
        }
    }
}
