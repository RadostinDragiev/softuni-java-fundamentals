package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());

        for (int i = input.size() - 1; i >= 0; i--) {
            input.add(input.remove(i));
        }

        String deb = String.join(" ", input);
        String[] output = deb.split("\\s+");
        for (String number : output) {
            System.out.print(number + " ");
        }
    }
}
