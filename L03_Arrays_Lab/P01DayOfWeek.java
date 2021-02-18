package L03_Arrays_Lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requestedDay = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (requestedDay >= 1 && requestedDay <= 7) {
            System.out.println(days[requestedDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
