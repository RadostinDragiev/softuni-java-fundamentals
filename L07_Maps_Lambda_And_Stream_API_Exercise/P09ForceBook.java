package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> forceBook = new HashMap<>();
        while (!input.equals("Lumpawaroo")) {
            String[] commandsLine = null;

            String forceSide = "";
            String forceName = "";
            List<String> tempList = null;
            if (input.contains(" | ")) {
                commandsLine = input.split(" \\| ");
                forceSide = commandsLine[0];
                forceName = commandsLine[1];
                tempList = forceBook.get(forceSide);

                if (!forceBook.containsKey(forceSide)) {
                    tempList = new ArrayList<>();
                }

                boolean containAtAnotherList = false;
                for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                    if (entry.getValue().contains(forceName)) {
                        containAtAnotherList = true;
                    }

                }
                if (!tempList.contains(forceName) && !containAtAnotherList) {
                    tempList.add(forceName);
                }
                forceBook.put(forceSide, tempList);
            } else {
                commandsLine = input.split(" -> ");
                forceSide = commandsLine[1];
                forceName = commandsLine[0];
                tempList = forceBook.get(forceSide);

                String finalForceName = forceName;
                forceBook.forEach((key, value) -> value.remove(finalForceName));
                if (tempList == null) {
                    tempList = new ArrayList<>();
                }
                tempList.add(forceName);
                forceBook.put(forceSide, tempList);
                System.out.printf("%s joins the %s side!%n", forceName, forceSide);
            }
            input = scanner.nextLine();
        }

        forceBook.entrySet().stream().sorted((f, s) -> {
            int result = s.getValue().size()-f.getValue().size();
            if (result == 0) {
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(entry -> {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                entry.getValue().stream().sorted(String::compareTo).forEach(e -> {
                    System.out.printf("! %s%n", e);
                });
            }
        });

        System.out.println();
    }
}
