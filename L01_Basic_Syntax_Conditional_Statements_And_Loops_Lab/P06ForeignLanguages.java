package L01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contry = scanner.nextLine();

        String language = "";
        switch (contry) {
            case "USA":
            case "England": {language = "English"; break;}
            case "Spain":
            case "Argentina":
            case "Mexico": {language = "Spanish"; break;}
            default: { language = "unknown"; break;}
        }

        System.out.println(language);
    }
}
