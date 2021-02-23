package L06_Objects_and_Classes_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Student {
        private String firsName;
        private String lastName;
        private double grade;

        public Student(String firsName, String lastName, double grade) {
            this.firsName = firsName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", firsName, lastName, grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentsCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            Student student = new Student(input[0], input[1], Double.parseDouble(input[2]));
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
