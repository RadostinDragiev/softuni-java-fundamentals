package L05_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (!(firstPlayerDeck.isEmpty()) && !(secondPlayerDeck.isEmpty())) {
            if (firstPlayerDeck.get(0) > secondPlayerDeck.get(0)) {
                firstPlayerDeck.add(firstPlayerDeck.remove(0));
                firstPlayerDeck.add(secondPlayerDeck.remove(0));
            } else if (secondPlayerDeck.get(0) > firstPlayerDeck.get(0)) {
                secondPlayerDeck.add(secondPlayerDeck.remove(0));
                secondPlayerDeck.add(firstPlayerDeck.remove(0));
            } else {
                firstPlayerDeck.remove(0);
                secondPlayerDeck.remove(0);
            }
        }

        int sum = 0;
        if (firstPlayerDeck.isEmpty()) {
            for (int i = 0; i < secondPlayerDeck.size(); i++) {
                sum += secondPlayerDeck.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int i = 0; i < firstPlayerDeck.size(); i++) {
                sum += firstPlayerDeck.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
