package L06_NestedLoops_Lab;

import java.util.Scanner;

public class Zad06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorsCount = Integer.parseInt(scanner.nextLine());
        int roomsCount = Integer.parseInt(scanner.nextLine());

        for (int floor = floorsCount; floor > 0; floor--) {
            for (int room = 0; room < roomsCount; room++) {
                if (floor == floorsCount) {
                    System.out.printf("L%d%d ", floor, room);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, room);
                } else {
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();
        }
    }
}
