package L14_Methods;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 5;
        int end = 10;
        printNumbers(start, end);

        printStudent("Avram", 23, 5.67);

        System.out.println(readFullName(scanner));

    }

    public static void printStudent(String name, int age, double grade) {
        System.out.printf("Student: %s; Age: %d, Grade: %.2f\n",
                name, age, grade);
    }

    public static void printNumbers ( int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();

    }

    public static String readFullName(Scanner sc) {
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        return firstName + " " + lastName;
    }
}
