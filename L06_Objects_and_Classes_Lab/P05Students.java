package L06_Objects_and_Classes_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return town;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " is " + age + " years old";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] components = input.split("\\s+");
            String firstName = components[0];
            String lastName = components[1];
            int age = Integer.parseInt(components[2]);
            String town = components[3];

            Student student = new Student(firstName, lastName, age, town);
            students.add(student);

            input = scanner.nextLine();
        }

        String townToFind = scanner.nextLine();

        for (Student student : students) {
            if (student.getTown().equals(townToFind)) {
                System.out.println(student);
            }
        }
    }
}
