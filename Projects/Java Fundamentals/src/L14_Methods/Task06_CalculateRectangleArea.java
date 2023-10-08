package L14_Methods;

import java.util.Scanner;

public class Task06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        rectangleAreaCalc(width, height);

    }

    public static double rectangleAreaCalc (double width, double height){
        return width * height;
    }
}
