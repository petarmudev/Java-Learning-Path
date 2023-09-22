package L01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Zad09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fish Tank
        //1.Трябва да се пресметне колко литра вода ще събира аквариума, ако се знае, че определен процент от вместимостта му е заета от:
        // пясък, растения, нагревател и помпа.
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
        //Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentAccessories = Double.parseDouble(scanner.nextLine());

        double fishtankVolume = lenght * width * height * 0.001; //куб.см.>литри

        double litersNeeded = fishtankVolume * (1 - percentAccessories/100);

        System.out.println(litersNeeded);




    }


}
