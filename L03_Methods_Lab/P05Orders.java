package L03_Methods_Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        orderPrice(product, quantity);
    }

    static void orderPrice(String product, int quantity) {
        double sum = 0;
        switch (product) {
            case "coffee": {sum = quantity * 1.5; break;}
            case "water": {sum = quantity * 1.0; break;}
            case "coke": {sum = quantity * 1.4; break;}
            case "snacks": {sum = quantity * 2.0; break;}
        }

        System.out.printf("%.2f", sum);
    }
}
