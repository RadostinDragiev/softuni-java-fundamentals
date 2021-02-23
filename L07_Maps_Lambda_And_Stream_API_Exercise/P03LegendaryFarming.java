package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.*;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //shards, fragments, motes
        Map<String, Integer> rareResources = new HashMap<>();
        rareResources.put("shards", 0);
        rareResources.put("fragments", 0);
        rareResources.put("motes", 0);
        Map<String, Integer> junkResources = new TreeMap<>();

        boolean areThereEnoughResources = false;
        while (!areThereEnoughResources) {
            String[] input = scanner.nextLine().toLowerCase().split("\\s+");
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String resource = input[i + 1];
                if (rareResources.containsKey(resource)) {
                    rareResources.put(resource, rareResources.get(resource) + quantity);

                    if (rareResources.get(resource) >= 250) {
                        areThereEnoughResources = true;
                        break;
                    }
                } else {
                    if (junkResources.containsKey(resource)) {
                        junkResources.put(resource, junkResources.get(resource) + quantity);
                    } else {
                        junkResources.put(resource, quantity);
                    }
                }
            }
        }

        if (rareResources.get("shards") >= 250) {
            rareResources.put("shards", rareResources.get("shards") - 250);
            System.out.println("Shadowmourne obtained!");
            rareResultPrinter(rareResources, junkResources);
        } else if (rareResources.get("fragments") >= 250) {
            rareResources.put("fragments", rareResources.get("fragments") - 250);
            System.out.println("Valanyr obtained!");
            rareResultPrinter(rareResources, junkResources);
        } else {
            rareResources.put("motes", rareResources.get("motes") - 250);
            System.out.println("Dragonwrath obtained!");
            rareResultPrinter(rareResources, junkResources);
        }

    }

    public static void rareResultPrinter(Map<String, Integer> listOfItems, Map<String, Integer> junkList) {
        listOfItems.entrySet().stream().sorted((f,s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());
                    }
                    return result;
                }).forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        for (Map.Entry<String, Integer> entry : junkList.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
