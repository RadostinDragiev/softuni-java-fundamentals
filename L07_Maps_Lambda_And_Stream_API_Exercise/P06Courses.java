package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String[] inputLine = input.split(" : ");

            List<String> tempList = courses.get(inputLine[0]);
            if (!courses.containsKey(inputLine[0])) {
                tempList = new ArrayList<>();
                tempList.add(inputLine[1]);
            } else {
                tempList.add(inputLine[1]);
            }
            courses.put(inputLine[0], tempList);
            courses.get(inputLine[0]).sort((a, b) -> a.compareTo(b));

            input = scanner.nextLine();
        }

        courses.entrySet().stream().sorted((f,s) ->
                s.getValue().size()-f.getValue().size()
        ).forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().sorted(String::compareTo).
                    forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}
