package L09_Regular_Expressions_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})(.|-|\\/)(?<month>[A-Z][a-z]{2})(\\2)(?<year>\\d{4})\\b");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print("Day: " + matcher.group("day"));
            System.out.print(", Month: " + matcher.group("month"));
            System.out.print(", Year: " + matcher.group("year"));
            System.out.println();
        }
    }
}
