package L10_Exercise_InterfacesAndAbstraction.Task04_FoodShortage.foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < numberOfPeople; i++) {

            String[] buyerParts = scanner.nextLine().split("\\s+");
            Buyer buyer = null;
            String name = buyerParts[0];
            int age = Integer.parseInt(buyerParts[1]);
            if (buyerParts.length == 3) {
                String group = buyerParts[2];
                buyer = new Rebel(name, age , group);

            } else if(buyerParts.length == 4){
                String id = buyerParts[2];
                String birthDate = buyerParts[3];
                buyer = new Citizen(name, age, id, birthDate);
            }
            buyers.put(name, buyer);
        }
        String buyerName = scanner.nextLine();
        while (!"End".equals(buyerName)) {
            Buyer buyer = buyers.get(buyerName);
            if (buyer != null) {
                buyer.buyFood();
            }

            buyerName = scanner.nextLine();
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFood);
    }
}