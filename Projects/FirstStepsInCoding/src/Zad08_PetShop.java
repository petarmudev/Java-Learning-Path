import java.util.Scanner;

public class Zad08_PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dogCount = Integer.parseInt(scanner.nextLine());
        int catCount = Integer.parseInt(scanner.nextLine());
        double dogFood = 2.5 * dogCount;
        double catFood = 4 * catCount;

        System.out.println((dogFood + catFood)+" lv.");

        }
    }
