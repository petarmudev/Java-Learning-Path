import java.util.Scanner;

public class Zad09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allSqM = Double.parseDouble(scanner.nextLine());
        double ammount = allSqM * 7.61;
        double discount = ammount * 0.18; // 18% otstupka
        double finalPrice = ammount - discount;

        System.out.printf("The final price is: %f lv.%n", finalPrice);
        System.out.printf("The discount is: %f lv.", discount);
    }
}
