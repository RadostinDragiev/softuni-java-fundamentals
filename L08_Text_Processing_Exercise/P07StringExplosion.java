package L08_Text_Processing_Exercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '>') {
                result.append(currentChar);

                i++;
                int bomb = Integer.parseInt(String.valueOf(input.charAt(i)));
                while (bomb != 0) {
                    if (input.charAt(i) == '>') {
                        bomb += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                        result.append(input.charAt(i));
                    } else {
                        bomb--;
                    }
                    if (bomb > 0) {
                        i++;
                        if (i >= input.length()) {
                            break;
                        }
                    }
                }
            } else {
                result.append(currentChar);
            }
        }

        System.out.println(result.toString());
    }
}