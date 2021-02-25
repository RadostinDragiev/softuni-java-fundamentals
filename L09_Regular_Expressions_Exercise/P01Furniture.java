package L09_Regular_Expressions_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(>{2})(?<furni>\\w+)(<{2})(?<price>\\d+.\\d+|\\d+)(!)(?<quantity>\\d+)");
        String input = scanner.nextLine();
        List<String> typeOfFurnitures = new ArrayList<>();
        double totalPrice = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String furniture = matcher.group("furni");
                double coast = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                typeOfFurnitures.add(furniture);
                totalPrice += (coast * quantity);
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        typeOfFurnitures.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}
