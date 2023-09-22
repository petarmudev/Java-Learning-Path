package L01_FirstStepsInCoding_Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zad06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Входът се чете от конзолата и съдържа точно 4 реда:
        //  .1 Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //  .2 Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //  .3 Количество разредител (в литри) - цяло число в интервала [1…30]
        //  .4 Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

        //2. Пресмятаме колко стрябва да плати за всеки материал по отделно. (найлон 1.50 за кв.м.; Боя - 14.50лв/л.;
        // Разредител за боя - 5.00лв./л.

        //3. Общата сума за материалите + торбички.
        //4. Да пресметнем цената за труда.
        //5 Крайната сума > принтираме

        //1.

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int neededThinner = Integer.parseInt(scanner.nextLine());
        int neededHours = Integer.parseInt(scanner.nextLine());

        //2.

        double nylonPrice = (neededNylon + 2) * 1.50; //2 кв.м. добавка, за да стигне
        double paintPrice = (neededPaint + neededPaint * 0.1) * 14.50; //(neededPaint + neededPaint * 10/100.0) * 14.50
        double thinnerPrice = neededThinner * 5;

        double totalMaterials = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double buildersPrice = (totalMaterials * 0.3) * neededHours;

        double totalSum = totalMaterials + buildersPrice;

        System.out.println(totalSum);


    }
}
