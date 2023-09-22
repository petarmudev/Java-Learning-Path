package L05_WhileLoop_Exercise;

import java.util.Scanner;

public class Zad07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //На осемнадесетия си рожден ден на Хосе взел решение, че ще се изнесе да живее на квартира. Опаковал багажа си в кашони и намерил подходяща
        // обява за апартамент под наем. Той започва да пренася своя багаж на части, защото не може да пренесе целия наведнъж.
        // Има ограничено свободно пространство в новото си жилище, където може да разположи вещите, така че мястото да бъде подходящо за живеене.
        //Напишете програма, която изчислява свободния обем от жилището на Хосе, който остава след като пренесе багажа си.
        //      Бележка: Един кашон е с точни размери:  1m. x 1m. x 1m.

        //Вход
        //Потребителят въвежда следните данни на отделни редове:
        //  1. Широчина на свободното пространство - цяло число в интервала [1...1000]
        //  2. Дължина на свободното пространство - цяло число в интервала [1...1000]
        //  3. Височина на свободното пространство - цяло число в интервала [1...1000]
        //  4. На следващите редове (до получаване на команда "Done") - брой кашони, които се пренасят в квартирата - цяло число в интервала [1...10000]
        //Програмата трябва да приключи прочитането на данни при команда "Done" или ако свободното място свърши.

        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lenghtFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());
        int totalFreeSpaceArea = widthFreeSpace * lenghtFreeSpace * heightFreeSpace;
        int luggageArea = 0;
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            luggageArea += Integer.parseInt(command);
            if (luggageArea > totalFreeSpaceArea) {
                System.out.printf("No more free space! You need %d Cubic meters more.", luggageArea - totalFreeSpaceArea);
                break;
            }

            command = scanner.nextLine();
        }
        if (command.equals("Done")) {
            System.out.printf("%d Cubic meters left.", totalFreeSpaceArea - luggageArea);
        }


        //Изход
        //Да се отпечата на конзолата един от следните редове:
        //Ако стигнете до командата "Done" и има още свободно място:
        //"{брой свободни куб. метри} Cubic meters left."
        //Ако свободното място свърши преди да е дошла команда "Done":
        //"No more free space! You need {брой недостигащи куб. метри} Cubic meters more."

    }
}
