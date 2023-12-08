package L03_StacksAndQueues;

import java.util.Scanner;

public class Task03_V2DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(Integer.toBinaryString(number));
    }
}
