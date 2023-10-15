package L17_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Read a number n and n lines of products. Print a numbered list of all the products ordered by name.

        Input                       Output
        -----------------------------------------------------
        4                           1.Apples
        Potatoes                    2.Onions
        Tomatoes                    3.Potatoes
        Onions                      4.Tomatoes
        Apples
        */
        List<String> products = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
