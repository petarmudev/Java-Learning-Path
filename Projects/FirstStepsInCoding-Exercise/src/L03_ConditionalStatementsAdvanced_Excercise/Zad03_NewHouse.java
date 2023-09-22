package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

    /*Марин и Нели си купуват къща не далеч от София. Нели толкова много обича цветята, че Ви убеждава да напишете програма,
     която да изчисли колко ще им струва, да си засадят определен брой цветя и дали наличния бюджет ще им е достатъчен.
     Различните цветя са с различни цени.

    цвете           Роза | Далия | Лале | Нарцис | Гладиола

    Цена на лв/брой   5  | 3.80  | 2.80 | 3      | 2.50

    */

        /*Съществуват следните отстъпки:
        · Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        · Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
        · Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        · Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        · Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%*/

        double totalSum = 0;

        switch (flowerType) {
            case "Roses":
                //пресмятаме цената за Розите без отстъпка.
                totalSum = countFlowers * 5;
                //превим проверка дали розите са > 80 --> имаме 10% отстъпка при повече.
                if (countFlowers > 80) {
                    totalSum = totalSum * 0.9;
                }
                break;
            case "Dahlias":
                //пресмятаме цената за Далийте без отстъпка.
                totalSum = countFlowers * 3.80;
                //превим проверка дали Далийте са > 90 --> имаме 15% отстъпка при повече.
                if (countFlowers > 90) {
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Tulips":
                //пресмятаме цената за Лалетата без отстъпка.
                totalSum = countFlowers * 2.80;
                //превим проверка дали Лалетата са > 80 --> имаме 15% отстъпка при повече.
                if (countFlowers > 80) {
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Narcissus":
                //пресмятаме цената за Нарцисите без отстъпка.
                totalSum = countFlowers * 3;
                //Проверяваме дали Нарцисите са < 120 --> цената се УВЕЛИЧАВА с 15%.
                if (countFlowers < 120 ) {
                    totalSum = totalSum * 1.15;
                }
                break;
            case "Gladiolus":
                //пресмятаме цената за Гладиолите без отстъпка.
                totalSum = countFlowers * 2.50;
                //Проверяваме дали Гладиолите са < 80 --> цената се оскъпява с 20%
                if (countFlowers < 80 ) {
                    totalSum = totalSum * 1.20;
                }
                break;
        }

        double diff = Math.abs (budget - totalSum);
        //проверяваме дали бюджетът е достатъчен.
        if (budget >= totalSum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowerType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
