package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> specialNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int bomb = specialNumbers.get(0);
        int power = specialNumbers.get(1);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(bomb)) {
                for (int j = 0; j < power; j++) {
//                    int indexPlus = numbers.get((i - 1) - j);
//                    int indexMinus = numbers.get((i + 1) + j);
                    if ((i - 1) - j >= 0) {
                        numbers.set((i - 1) - j, 0);
                    }
                    if ((i + 1) + j < numbers.size()) {
                        numbers.set((i + 1) + j, 0);
                    }
                }
                numbers.set(i, 0);
            }
        }

        printResult(numbers);

    }

    static void printResult(List<Integer> numbers) {
        int sum = 0;
        for (int add : numbers) {
            sum += add;
        }

        System.out.println(sum);
    }
}
