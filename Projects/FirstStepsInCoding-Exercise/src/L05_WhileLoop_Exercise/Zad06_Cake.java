package L05_WhileLoop_Exercise;

import java.util.Scanner;

public class Zad06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());

        int area = width * lenght;
        int piecesTaken = 0;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            piecesTaken += Integer.parseInt(command);
            if (piecesTaken >= area){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(area - piecesTaken));
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("STOP")) {
            System.out.println((area - piecesTaken) + " pieces are left.");
        }
    }
}
