package L04_ForLoop_Lab;

import java.util.Scanner;

public class Zad05_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        for (int index = 0; index <= text.length() - 1; index++) {
            System.out.println(text.charAt(index));
        }
    }
}
