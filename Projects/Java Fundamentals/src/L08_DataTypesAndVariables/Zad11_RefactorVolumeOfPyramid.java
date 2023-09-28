package L08_DataTypesAndVariables;

import java.util.Scanner;

public class Zad11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You are given a working code that finds the volume of a pyramid.
        However, you should consider that the variables exceed their optimum span and have improper naming.
        Also, search for variables that have multiple purposes.

        *Hints
        ⦁	Reduce the span of the variables by declaring them at the moment they receive a value, not before
        ⦁	Rename your variables to represent their real purpose (example: "dul" should become length, etc.)
        ⦁	Search for variables that have multiple purposes. If you find any, introduce a new variable.

         */

        //V = (1/3) Bh, where 'B' is the base area and 'h' is the height of the pyramid

        System.out.print("Length: ");
        double lenght = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());
        double V = (lenght * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
