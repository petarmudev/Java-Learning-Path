package L18_ExerciceGenerics_AllInOneTasks_GenericBox_BoxOfIntegers;

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
        /*
        Box<Integer> integerBox = new Box<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            integerBox.add(number);
        }
        System.out.println(integerBox);
         */
        //Задача 3:
        /*
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        box.swap(firstIndex, secondIndex);
        System.out.println(box);
        */
        //Задача 4
        /*
        Box<Integer> box = new Box<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        box.swap(firstIndex, secondIndex);
        System.out.println(box);
         */
        //Задача 5
        /*
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
        String element = scanner.nextLine(); //Търсения елемент
        System.out.println(box.countGreaterThat(element));

         */
        //Задача 6
        Box<Double> box= new Box<>();
        for (int i = 0; i < n; i++) {
            double doubleNumber = Double.parseDouble(scanner.nextLine());
            box.add(doubleNumber);
        }
        double element = Double.parseDouble(scanner.nextLine());
        System.out.println(box.countGreaterThat(element));
    }
}
