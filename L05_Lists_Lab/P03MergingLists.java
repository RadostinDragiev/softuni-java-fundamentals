package L05_Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lineOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> lineTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mergedLine = new ArrayList<>();

        for (int i = 0; i < Math.max(lineOne.size(), lineTwo.size()); i++) {
            if (i < lineOne.size()) {
                mergedLine.add(lineOne.get(i));
            }

            if (i < lineTwo.size()) {
                mergedLine.add(lineTwo.get(i));
            }
        }

        printLines(mergedLine);
    }

    private static void printLines(List<Integer> line) {
        for (int number : line) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
