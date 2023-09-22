package L01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Zad02_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме радиани от конзолара.
        //2. Пресмятаме колко е: градус = радиан * 180 / π. Числото π в Java програми е достъпно чрез Math.PI.
        //3. Принтираме резултата.

        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);

    }
}
