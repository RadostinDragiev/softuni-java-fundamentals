package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingRegister = new LinkedHashMap<>();
        for (int i = 0; i < numberOfLines; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (input[0].equals("register")) {
                if (!parkingRegister.containsKey(input[1])) {
                    parkingRegister.put(input[1], input[2]);
                    System.out.printf("%s registered %s successfully%n", input[1], input[2]);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", parkingRegister.get(input[1]));
                }
            } else {
                if (parkingRegister.containsKey(input[1])) {
                    System.out.printf("%s unregistered successfully%n", input[1]);
                    parkingRegister.remove(input[1]);
                } else {
                    System.out.printf("ERROR: user %s not found%n", input[1]);
                }
            }
        }

        parkingRegister.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
