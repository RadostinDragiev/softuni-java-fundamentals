package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> companyData = new TreeMap<>();
        while (!input.equals("End")) {
            String[] inputLine = input.split(" -> ");
            String companyName = inputLine[0];
            String employee = inputLine[1];

            List<String> temPlace = companyData.get(companyName);
            if (!companyData.containsKey(companyName)) {
                temPlace = new ArrayList<>();
                temPlace.add(employee);
            } else {
                if (!temPlace.contains(employee)) {
                    temPlace.add(employee);
                }
            }
            companyData.put(companyName, temPlace);

            input = scanner.nextLine();
        }

        companyData.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().stream().forEach(e -> {
                System.out.printf("-- %s%n", e);
            });
        });
    }
}
