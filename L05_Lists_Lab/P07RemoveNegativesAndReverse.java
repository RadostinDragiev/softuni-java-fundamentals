package L05_Lists_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int indexCounter = 0;
        while (indexCounter < numbers.size()){
            if (numbers.get(indexCounter) < 0) {
                numbers.remove(indexCounter);
            } else {
                indexCounter++;
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);
            for (int nums : numbers) {
                System.out.print(nums + " ");
            }
        }
    }
}
