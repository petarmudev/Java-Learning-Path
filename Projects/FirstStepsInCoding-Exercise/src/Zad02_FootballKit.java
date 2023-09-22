import java.util.Scanner;

public class Zad02_FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tShirtPrice = Double.parseDouble(scanner.nextLine());
        double sumRequired = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tShirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double budsPrice = (tShirtPrice + shortsPrice) * 2;

        double totalPrice = (tShirtPrice + shortsPrice + socksPrice + budsPrice) * 0.85;

        if (totalPrice >= sumRequired) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", totalPrice);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", sumRequired - totalPrice);
        }
    }
}
