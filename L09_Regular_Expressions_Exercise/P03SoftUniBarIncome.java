package L09_Regular_Expressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("%(?<customer>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d+.?\\d?)\\$");
        String input = scanner.nextLine();

        double revenue = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String client = matcher.group("customer");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                double coast = quantity * price;
                revenue += coast;
                System.out.printf("%s: %s - %.2f%n", client, product, coast);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", revenue);
    }
}
