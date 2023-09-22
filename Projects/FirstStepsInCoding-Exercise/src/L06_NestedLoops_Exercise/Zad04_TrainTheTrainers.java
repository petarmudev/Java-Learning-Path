package L06_NestedLoops_Exercise;

import java.util.Scanner;

public class Zad04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int presentationCount = 0;
        double sumGrades = 0;
        while (!input.equals("Finish")) {
            double currentSum = 0;
            String presentationName = input;
       //     presentationCount++;
            for (int i = 0; i < countPeople; i++) {
                double currentInput = Double.parseDouble(scanner.nextLine());
                currentSum += currentInput;
                sumGrades += currentInput;
                presentationCount++;
            }
            System.out.printf("%s - %.2f.%n", presentationName, (currentSum / countPeople));

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumGrades / presentationCount);
    }
}
