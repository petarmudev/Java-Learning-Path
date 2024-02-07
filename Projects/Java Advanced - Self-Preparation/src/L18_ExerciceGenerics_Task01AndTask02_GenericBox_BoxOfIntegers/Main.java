package L18_ExerciceGenerics_Task01AndTask02_GenericBox_BoxOfIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //Задача 1:
        /*
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
        System.out.println(box);
        */

        //Задача 2:
        Box<Integer> integerBox = new Box<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            integerBox.add(number);
        }
        System.out.println(integerBox);
    }
}
