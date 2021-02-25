package L08_Text_Processing_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        int counter = 0;
        while (counter < input.size()) {
            if (counter + 1 >= input.size()) {
                break;
            }
            if (input.get(counter).equals(input.get(counter + 1))) {
                input.remove(counter + 1);
            } else {
                counter++;
            }
        }

        System.out.println(String.join("", input));
    }
}
