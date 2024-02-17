package L24_RegularExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_ChickenSnack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> amountMoney = new ArrayDeque<>();        //Stack: push   pop   peek
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(amountMoney::push);
        ArrayDeque<Integer> foodPrices = new ArrayDeque<>();     //Queue: offer  poll  peek
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(foodPrices::offer);

        int changeLeft = 0;
        int foodBuyed = 0;
        while (!amountMoney.isEmpty() && !foodPrices.isEmpty()) {
            Integer amount = amountMoney.pop() + changeLeft;
            changeLeft = 0;
            Integer price = foodPrices.poll();

            if (amount.equals(price)) {
                foodBuyed++;
            }
            if (amount > price) {
                foodBuyed++;
                changeLeft = amount - price;
            }
        }
        //End print
        if (foodBuyed >= 4) {
            System.out.printf("Gluttony of the day! Henry ate %d foods.", foodBuyed);
        } else if (foodBuyed > 1) {
            System.out.printf("Henry ate: %d foods.%n", foodBuyed);
        } else if (foodBuyed == 1) {
            System.out.printf("Henry ate: %d food.%n", foodBuyed);
        } else {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        }

    }
}
