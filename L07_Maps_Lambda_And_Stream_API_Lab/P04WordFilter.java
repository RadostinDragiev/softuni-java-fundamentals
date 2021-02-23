package L07_Maps_Lambda_And_Stream_API_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputWord = scanner.nextLine().split("\\s+");
        Arrays.stream(inputWord).filter(x -> x.length() % 2 == 0)
                .forEach(x -> System.out.println(x));

    }
}
