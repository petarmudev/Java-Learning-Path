import java.util.Scanner;

public class Zad05_GreetingByName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Hello, " + firstName + "!");
    }
}
