package L05_Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String end = scanner.nextLine();

        while (!end.equals("3:1")) {
            String[] commands = end.split("\\s+");
            if (commands[0].equals("merge")) {
                mergePositions(input, Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
            } else if (commands[0].equals("divide")) {
                int indexToDivide = Integer.parseInt(commands[1]);
                int partitions = Integer.parseInt(commands[2]);
                String wordToDivide = input.get(indexToDivide);
                input.remove(indexToDivide);
                List<Character> strToDivide = new ArrayList<>();
                for (int i = 0; i < wordToDivide.length(); i++) {
                    strToDivide.add(wordToDivide.charAt(i));
                }
                for (int i = 0; i < partitions; i++) {
                    String dividedWord = "";
                    for (int j = 0; wordToDivide.length() / partitions > j; j++) {
                        if (!strToDivide.isEmpty()) {
                            dividedWord += strToDivide.get(0);
                            strToDivide.remove(0);
                        }
                    }
                    if (i + 1 == partitions && !strToDivide.isEmpty()) {
                        for (int j = 0; j < strToDivide.size(); j++) {
                            dividedWord += strToDivide.get(0);
                            strToDivide.remove(0);
                        }
                    }
                    input.add(indexToDivide + i, dividedWord);
                }
                int deb = 0;
            }
            end = scanner.nextLine();
        }

        printResult(input);
    }

    static String mergePositions(List<String> text, int startIndex, int endIndex) {
        String mergedInput = "";

        if (startIndex < 0) {
            startIndex = 0;
        }

        if (endIndex >= text.size() - 1) {
            endIndex = text.size() - 1;
        }

        int mergedCount = startIndex;
        while (mergedCount <= endIndex) {
            mergedInput += text.get(startIndex);
            text.remove(startIndex);
            mergedCount++;
        }
        if (startIndex < text.size()) {
            text.add(startIndex, mergedInput);
        } else {
            text.add(mergedInput);
        }

        return mergedInput;
    }

    static void printResult(List<String> text) {
        for (String printOutput : text) {
            System.out.print(printOutput + " ");
        }
    }
}
