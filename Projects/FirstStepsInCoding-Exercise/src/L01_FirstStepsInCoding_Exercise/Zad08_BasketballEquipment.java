package L01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Zad08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //.Basketball Equipment
        //1.Нужна екипировка:
        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        //2. Четем 1 вход - цената НА ГОДИШНАТА ТАКСА ЗА ТРЕНИРОВКИ.

        //3. Да се отпечата на конзолата колко ще са разходите на Джеси, ако започне да спортува баскетбол.

        int feePerYear = Integer.parseInt(scanner.nextLine());

        double trainersPrice = feePerYear - (feePerYear * 0.40); // feePerYear * 0.60;
        double basketSuitPrice = trainersPrice * 0.80; // trainersPrice - trainersPrice * 0.20;
        double ballPrice = basketSuitPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalPrice = trainersPrice + basketSuitPrice + ballPrice + accessoriesPrice + feePerYear;

        System.out.println(totalPrice);


    }
}
