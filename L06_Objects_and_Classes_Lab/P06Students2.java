package L06_Objects_and_Classes_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {
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

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public void setAge(int age) {
            this.age = age;
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

            if (isStudentWithSameName(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setTown(town);

            } else {
                Student student = new Student(firstName, lastName, age, town);
                students.add(student);
            }

            input = scanner.nextLine();
        }

        String townToFind = scanner.nextLine();

        for (Student student : students) {
            if (student.getTown().equals(townToFind)) {
                System.out.println(student);
            }
        }
    }

    static boolean isStudentWithSameName(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }

        return existingStudent;
    }
}
