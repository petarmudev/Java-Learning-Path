package L05_WhileLoop;

import java.util.Scanner;

public class Zad08_Re6enaOtTopuzakova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sum = 0;
        double average = 0;
        int countFail = 0;
        int level = 0;

        while (level <= 12) {

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                System.out.printf("%s has been excluded at %d grade", name, level);
                break;
            }
            sum += grade;
            level++;

            if (level == 12) {
                average = sum / 12;
                System.out.printf("%s graduated. Average grade: %.2f", name, average);
                break;
            }
        }
    }
}