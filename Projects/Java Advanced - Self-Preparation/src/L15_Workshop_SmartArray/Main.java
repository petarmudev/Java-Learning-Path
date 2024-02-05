package L15_Workshop_SmartArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartArray smartArray = new SmartArray();
        smartArray.add(1);
        smartArray.add(2);
        smartArray.add(3);
        smartArray.add(4);
        smartArray.add(5);
        System.out.println(smartArray.remove(4));
        System.out.println(smartArray.remove(0));
        System.out.println(smartArray.remove(2));
        System.out.println();

        for (int i = 0; i < smartArray.size(); i++) {
            System.out.println(smartArray.get(i));
        }
    }
}
