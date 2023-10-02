package L12_ExerciseArrays;

import java.util.Scanner;

public class Zad02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that prints common elements in two arrays.
        You have to compare the elements of the second array to the elements of the first.
         */
        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        for (String el2:secondArray) {
            for (String el1:firstArray) {
                if (el2.equals(el1))
                System.out.print(el2 + " ");
            }
        }
    }
}
