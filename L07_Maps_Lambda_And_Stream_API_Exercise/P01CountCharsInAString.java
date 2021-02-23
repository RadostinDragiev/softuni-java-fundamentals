package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Map<String, Integer> output = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                String letter = String.valueOf(input[i].charAt(j));
                if (!output.containsKey(letter)) {
                    output.put(letter, 1);
                } else {
                    output.put(letter, output.get(letter) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry:output.entrySet()) {
            System.out.println(entry.getKey() + " -> " +  entry.getValue());
        }
    }
}
