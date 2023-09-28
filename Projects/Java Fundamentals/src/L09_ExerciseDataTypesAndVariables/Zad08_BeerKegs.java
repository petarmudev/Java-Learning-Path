package L09_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        int countKegs = Integer.parseInt(scanner.nextLine());
        //за всеки кег от 1 до последния ( countKegs):
        //1 model -> String
        // radius -> double
        //height -> integer
        //obem (Volume) -> PI * r * r * height
        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";
        for (int keg = 1; keg <= countKegs ; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }
        }
        System.out.println(maxModel);

    }
}
