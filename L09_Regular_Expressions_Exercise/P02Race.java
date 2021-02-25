package L09_Regular_Expressions_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] participants = scanner.nextLine().split(", ");

        Map<String, Integer> ranking = new HashMap<>();
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d|[A-Za-z]");
        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            int distance = 0;

            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String text = matcher.group();
                if (Character.isDigit(text.charAt(0))) {
                    distance += Integer.parseInt(text);
                } else {
                    name.append(text);
                }
            }

            for (String participant : participants) {
                if (participant.contentEquals(name)) {
                    if (ranking.containsKey(String.valueOf(name))) {
                        ranking.put(String.valueOf(name), ranking.get(participant) + distance);
                    } else {
                        ranking.put(String.valueOf(name), distance);
                    }
                }
            }


            input = scanner.nextLine();
        }
        Map<Integer, String> sortedRanking = new LinkedHashMap<>();
        ranking.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(x -> sortedRanking.put(x.getValue(), x.getKey()));

        List<String> winners =  new ArrayList<>();
        sortedRanking.entrySet().stream().limit(3).forEach(x -> winners.add(x.getValue()));

        System.out.printf("1st place: %s%n", winners.get(0));
        System.out.printf("2nd place: %s%n", winners.get(1));
        System.out.printf("3rd place: %s", winners.get(2));
        System.out.println();
    }
}
