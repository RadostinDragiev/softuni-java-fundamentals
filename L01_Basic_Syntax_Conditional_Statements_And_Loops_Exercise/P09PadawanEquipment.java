package L01_Basic_Syntax_Conditional_Statements_And_Loops_Exercise;

import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyCap = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lihtsaberCoast = lightsaberPrice * Math.ceil(studentsCount * 1.10);
        double robeCoast = robePrice * studentsCount;
        double beltCoast = beltPrice * studentsCount;
        if (studentsCount >=6) {
            int freeBelt = Math.abs(studentsCount / 6);
            beltCoast -= freeBelt * beltPrice;
        }

        double totalCoast = lihtsaberCoast + robeCoast + beltCoast;
        if (totalCoast <= moneyCap) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCoast);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalCoast - moneyCap);
        }
    }
}
