package L06_Objects_and_Classes_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P03OpinionPoll {
    static class Person {
        private String name ;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", name, age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personsCount = Integer.parseInt(scanner.nextLine());

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < personsCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            persons.add(person);
        }

        persons.sort(Comparator.comparing(Person::getName));
        for (Person person : persons) {
            if (person.getAge() > 30) {
                System.out.println(person);
            }
        }
    }
}
