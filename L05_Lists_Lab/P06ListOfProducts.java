package L05_Lists_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productsCount = Integer.parseInt(scanner.nextLine());
        List<String> productsNames = new ArrayList<>();

        for (int i = 0; i < productsCount; i++) {
            productsNames.add(scanner.nextLine());
        }

        Collections.sort(productsNames);
        for (int i = 0; i < productsNames.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, productsNames.get(i));
        }
    }
}
