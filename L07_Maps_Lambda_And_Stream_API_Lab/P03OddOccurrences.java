package L07_Maps_Lambda_And_Stream_API_Lab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().toLowerCase().split("\\s+");

        Map<String, Integer> words = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (!words.containsKey(input[i])) {
                words.put(input[i], 1);
            } else {
                words.put(input[i], words.get(input[i]) + 1);
            }
        }

        List<String> output = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                output.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", output));
    }
}
