package L01_Basic_Syntax_Conditional_Statements_And_Loops_More_Exercise;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = Integer.parseInt(scanner.nextLine());
        int numberB = Integer.parseInt(scanner.nextLine());
        int numberC = Integer.parseInt(scanner.nextLine());

       int maxNumber = 0;
       int averageNumber = 0;
       int minNumber = 0;

       if (numberA > numberB && numberA > numberC) {
           maxNumber = numberA;
       } else if (numberB > numberA && numberB > numberC) {
           maxNumber = numberB;
       } else {
           maxNumber = numberC;
       }

       if (numberA <= numberB && numberA <= numberC) {
           minNumber = numberA;
       } else if (numberB <= numberA & numberB <= numberC) {
           minNumber = numberB;
       } else {
           minNumber = numberC;
       }

       if (numberA < maxNumber && numberA > minNumber) {
           averageNumber = numberA;
       } else if (numberB < maxNumber && numberB > minNumber) {
           averageNumber = numberB;
       } else {
           averageNumber = numberC;
       }

       System.out.println(maxNumber);
       System.out.println(averageNumber);
       System.out.println(minNumber);
    }
}
