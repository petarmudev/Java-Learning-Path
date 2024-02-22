package L03_WorkingWithAbstraction.Task02_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = getCoordinates(scanner);

        Point bottomLeft = new Point(coordinates[0], coordinates[1]);

        int xTopRight = coordinates[2];
        int yTopRight = coordinates[3];
        Point topRight = new Point(xTopRight, yTopRight);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int searchedPointsCount = Integer.parseInt(scanner.nextLine());
        Point searchedPoint = null;

        for (int i = 0; i < searchedPointsCount; i++) {
            int[] pointCoordinates = getCoordinates(scanner);
            searchedPoint = new Point(pointCoordinates[0], pointCoordinates[1]);

            System.out.println(rectangle.contains(searchedPoint));
        }
    }

    private static int[] getCoordinates(Scanner scanner) {
        int[] coordinates = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return coordinates;
    }
}
