package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.*;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<Double>> productList = new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String[] inputData = input.split("\\s+");

            List<Double> tempPlace = productList.get(inputData[0]);
            if (tempPlace == null) {
                tempPlace = new ArrayList<>();
                tempPlace.add(Double.parseDouble(inputData[1]));
                tempPlace.add(Double.parseDouble(inputData[2]));
            } else {
                double price = Double.parseDouble(inputData[1]);
                double quantity = Double.parseDouble(inputData[2]);
                tempPlace.set(0, price);
                tempPlace.set(1, tempPlace.get(1) + quantity);
            }
            productList.put(inputData[0], tempPlace);


            input = scanner.nextLine();
        }

        Map<String, Double> productCoastList = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : productList.entrySet()) {
            List<Double> tempPlace = entry.getValue();
            productCoastList.put(entry.getKey(), tempPlace.get(0) * tempPlace.get(1));
        }

        productCoastList.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
}
