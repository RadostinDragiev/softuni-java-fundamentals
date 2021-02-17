package L01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

public class P08DivisibleBy3 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
