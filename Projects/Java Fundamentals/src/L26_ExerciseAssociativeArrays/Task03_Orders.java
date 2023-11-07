package L26_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("buy")) {
                break;
            }
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (productsPrice.containsKey(product)) {
                productsPrice.put(product, price);
            }
            if (productsQuantity.containsKey(product)) {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
            }
            productsPrice.putIfAbsent(product, price);
            productsQuantity.putIfAbsent(product, quantity);
        }
        //Принтиране по условие:
//        "{productName} -> {totalPrice}"
//        Format the average total price to the 2nd decimal place.
        productsPrice.entrySet().forEach(entry -> {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue() * productsQuantity.get(entry.getKey()));
        });
    }
}
