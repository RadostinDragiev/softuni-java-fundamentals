package L07_Maps_Lambda_And_Stream_API_Exercise;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLine = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsData = new LinkedHashMap<>();
        for (int i = 0; i < inputLine; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            List<Double> tempList = studentsData.get(student);
            if (!studentsData.containsKey(student)) {
                tempList = new ArrayList<>();
                tempList.add(grade);
                tempList.add(1.0);
            } else {
                tempList.set(0, tempList.get(0) + grade);
                tempList.set(1, tempList.get(1) + 1);
            }
            studentsData.put(student, tempList);
        }

        Map<String, Double> studentsGrades = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsData.entrySet()) {
            List<Double> tempList = entry.getValue();
            double finalGrade = tempList.get(0) / tempList.get(1);
            if (finalGrade >= 4.5) {
                studentsGrades.put(entry.getKey(), finalGrade);
            }
        }

        studentsGrades.entrySet().stream().sorted((x, y) -> y.getValue().compareTo(x.getValue()))
                .forEach(entry -> {
                    System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
                });
    }
}
