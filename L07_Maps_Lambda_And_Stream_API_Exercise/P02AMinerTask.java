package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resourcesList = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourcesList.containsKey(resource)) {
                resourcesList.put(resource, quantity);
            } else {
                resourcesList.put(resource, resourcesList.get(resource) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourcesList.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
