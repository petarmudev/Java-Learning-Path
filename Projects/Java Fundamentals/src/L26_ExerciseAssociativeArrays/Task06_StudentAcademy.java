package L26_ExerciseAssociativeArrays;

import java.util.*;

public class Task06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentsList = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countStudents; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            //1. Има такъв студент
            if (studentsList.containsKey(studentName)) {
                List<Double> currentGrades = studentsList.get(studentName);
                currentGrades.add(grade);
            }
            //2. Няма още такъв студент
            else {
                studentsList.put(studentName, new ArrayList<>());
                studentsList.get(studentName).add(grade);
            }
            System.out.println();
        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsList.entrySet()) {
            //entry ->
            //entry.getKey()
            //entry.getValue()
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double average = getAverageGrade(grades);

            if (average >= 4.50) {
                studentAverageGrade.put(studentName, average);
            }
        }
        studentAverageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();

    }
}
