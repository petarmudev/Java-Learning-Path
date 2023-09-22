import java.util.Scanner;

public class Zad04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double inch = Double.parseDouble(input);
        double result = inch * 2.54;
        System.out.println(result);
    }
}
