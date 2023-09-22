import java.util.Scanner;

public class Zad01_PcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoCardPrice = Double.parseDouble(scanner.nextLine());
        double ramModulePrice = Double.parseDouble(scanner.nextLine());
        int countRamModules= Integer.parseInt(scanner.nextLine());
        double discountPercentage = Double.parseDouble(scanner.nextLine());
        double dollar = 1.57; //leva
        double totalSum = ((processorPrice * (1.0 - discountPercentage)) + (videoCardPrice * (1.0 - discountPercentage)) + (ramModulePrice * countRamModules)) * dollar ;



        System.out.printf("Money needed - %.2f leva.", totalSum);
    }
}
