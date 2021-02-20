package L05_Lists_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            int firstNumber = numbers.get(i);
            int lastNumber = numbers.get(numbers.size() - 1);
            numbers.set(i, (firstNumber + lastNumber));
            numbers.remove(numbers.size() - 1);
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
