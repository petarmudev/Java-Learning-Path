package L23_Workshop_AlgorithmsIntroduction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task03_SumOfCoins_SimpleExampleDesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input in lv.
        double changeInLv = Double.parseDouble(scanner.nextLine());
        //convert to stotinki
        int changeInSt = (int) (changeInLv * 100);
        Map<Integer, Integer> coinsMap = new HashMap<>();
        coinsMap.put(10, 0);
        coinsMap.put(5, 0);
        coinsMap.put(2, 0);
        coinsMap.put(1, 0);
        while (changeInSt > 0) {
            if (changeInSt > 10) {
                changeInSt -= 10;
                coinsMap.put(10, coinsMap.get(10) + 1);
            } else if (changeInSt > 5) {
                changeInSt -= 5;
                coinsMap.put(5, coinsMap.get(5) + 1);
            } else if (changeInSt > 2) {
                changeInSt -= 2;
                coinsMap.put(2, coinsMap.get(2) + 1);
            } else if (changeInSt > 1) {
                changeInSt -= 1;
                coinsMap.put(1, coinsMap.get(1) + 1);
            }
        }
        System.out.println("10 st: " + coinsMap.get(10));
        System.out.println("5 st: " + coinsMap.get(5));
        System.out.println("2 st: " + coinsMap.get(2));
        System.out.println("1 st: " + coinsMap.get(1));
    }
}
