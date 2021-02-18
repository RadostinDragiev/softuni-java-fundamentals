package L02_Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int elevatorCapacity = scanner.nextInt();

        int courses = (int) Math.ceil((double) numberOfPeople / elevatorCapacity);
        System.out.println(courses);
    }
}
