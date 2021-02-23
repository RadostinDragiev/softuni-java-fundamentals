package L07_Maps_Lambda_And_Stream_API_Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        int linesCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < linesCount; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            List<String> currentSynonyms = synonyms.get(word);
            if (currentSynonyms == null) {
                currentSynonyms = new ArrayList<>();
            }
            currentSynonyms.add(synonym);
            synonyms.put(word, currentSynonyms);

        }

        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
