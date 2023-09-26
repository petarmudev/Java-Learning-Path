package L04_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.
        The input holds two lines:
        the number of people (n)
        and the capacity (p) of the elevator

        Input   Output  Comments
        17      6       5 courses * 3 people + 1 course * 2 persons
        3
        -----------------------------------------------------------
        4       1       All the people fit inside the elevator.
        5               Only one course is needed.
        -----------------------------------------------------------
        10      2       2 courses * 5 people
        5
        -----------------------------------------------------------
                Hints
        •	You should divide n by p. This gives you the number of full courses (e.g. 17 / 3 = 5).
        •	If n does not divide p without a remainder, you will need one additional partially full course (e.g. 17 % 3 = 2).
        •	Another approach is to round up n / p to the nearest integer (ceiling), e.g. 17/3 = 5.67 -> rounds up to 6.
        •	Sample code for the round-up calculation:

         */
        int n = Integer.parseInt(scanner.nextLine()); //num of people
        int p = Integer.parseInt(scanner.nextLine()); //people capacity

        //number of full courses
        int courses = (int)Math.ceil((double)n/p);
        System.out.println(courses);
    }
}
