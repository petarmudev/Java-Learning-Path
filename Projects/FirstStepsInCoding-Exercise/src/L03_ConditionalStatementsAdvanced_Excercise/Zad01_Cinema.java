package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Кино
        //В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони. Има три вида прожекции с билети на различни цени:
        //Premiere – премиерна прожекция, на цена 12.00 лева.
        //Normal – стандартна прожекция, на цена 7.50 лева.
        //Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        //Напишете програма, която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа), въведени от потребителя и изчислява
        // общите приходи от билети при пълна зала. Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.

        //вход      |     изход
        //Premiere  |    1440.00
        //10        |    leva
        //12        |

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());

        double income = 0;
        if (projection.equals("Premiere")) {
            income = rows * colums * 12;
        } else if (projection.equals("Normal")) {
            income = rows * colums * 7.50;
        } else if (projection.equals("Discount")) {
            income = rows * colums * 5;
        }
        System.out.printf("%.2f leva", income);
    }
}
