package L12_ExerciseArrays;

import java.util.Scanner;

public class Zad01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*You will be given a count of wagons in a train n.
         On the next n lines, you will receive how many people will get on that wagon.
         In the end, print the whole train and the sum of the people on the train.

         */
        int input = Integer.parseInt(scanner.nextLine());
        int [] wagons = new int[input];
        int sum = 0;
        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            sum += wagons[i];
        }
        for (int index: wagons) {
            System.out.print(index +" ");
        }
        System.out.printf("%n%d", sum);


    }
}
