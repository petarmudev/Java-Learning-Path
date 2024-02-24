package L03_WorkingWithAbstraction.Task04_HotelReservation;

public class PriceCalculator {
    public static double calculateFinalPrice(double pricePerDay, int daysStay, Season season, DiscountType discountType) {
        double price = pricePerDay * daysStay;
        price = price * season.getMultiplier();
        price = price * (100 - discountType.getDiscount()) / 100.0;
        return price;
    }
}
