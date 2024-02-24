package L03_WorkingWithAbstraction.Task04_HotelReservation;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = 20 * Season.Summer.getMultiplier();
        String[] input = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDaysStay = Integer.parseInt(input[1]);
        String seasonInput = input[2];
        Season currentSeason = Season.valueOf(seasonInput);
        String discountInput = input[3];
        DiscountType discountType = DiscountType.valueOf(discountInput);

        double finalPrice = PriceCalculator.calculateFinalPrice(pricePerDay, numberOfDaysStay, currentSeason, discountType);
        System.out.printf("%.2f", finalPrice);

    }
}
