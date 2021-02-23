package L06_Objects_and_Classes_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P07OrderByAge {
    static class Person {
        private String name;
        private String ID;
        private int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name, ID, age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputArr = input.split("\\s+");
            Person person = new Person(inputArr[0], inputArr[1], Integer.parseInt(inputArr[2]));
            people.add(person);
            input = scanner.nextLine();
        }

        people.sort(Comparator.comparing(Person::getAge));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
