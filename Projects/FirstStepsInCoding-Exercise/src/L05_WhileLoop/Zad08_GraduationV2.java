package L05_WhileLoop;

import java.util.Scanner;

public class Zad08_GraduationV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentsName = scanner.nextLine();

        double sum = 0;
        double average = 0;
        int grade = 1;
        while (grade <= 12) {
            double evaluation = Double.parseDouble(scanner.nextLine());
            if (evaluation < 4) {
                System.out.printf("%s has been excluded at %d grade", studentsName, grade);
                break;
            }
            sum += evaluation;
            grade++;

            if (grade > 12) {
                average = sum / 12;
                System.out.printf("%s graduated. Average grade: %.2f", studentsName, average);
                break;
            }
        }
    }
}
