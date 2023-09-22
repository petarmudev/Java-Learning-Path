package L04_ForLoop_Exercise;

import java.util.Scanner;

public class Zad07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //7. Трекинг мания
        //Катерачи от цяла България се събират на групи и набелязват следващите върхове за изкачване. Според размера на групата,
        // катерачите ще изкачват различни върхове.
        //  Група до 5 човека включително – изкачват Мусала
        //  Група от 6 до 12 човека включително – изкачват Монблан
        //  Група от 13 до 25 човека включително – изкачват Килиманджаро
        //  Група от 26 до 40 човека включително –  изкачват К2
        //  Група от 41 (включително) или повече човека – изкачват Еверест
        //Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.

        //Вход
        //От конзолата се четат поредица от числа, всяко на отделен ред:
        //  На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
        //  За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]

        int numOfGroups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montBlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        double totalPeople = 0;

        for (int i = 0; i < numOfGroups; i++) {
            int groupSize = Integer.parseInt(scanner.nextLine());
            totalPeople += groupSize;
            if (groupSize < 6) {
                musala += groupSize;
            } else if (groupSize < 13) {
                montBlanc += groupSize;
            } else if (groupSize < 26) {
                kilimanjaro += groupSize;
            } else if (groupSize < 41) {
                k2 += groupSize;
            } else everest += groupSize;
        }

        //Изход
        //Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00% с точност до втората цифра след десетичната запетая.
        //Първи ред - процентът изкачващи Мусала
        //Втори ред – процентът изкачващи Монблан
        //Трети ред – процентът изкачващи Килиманджаро
        //Четвърти ред – процентът изкачващи К2
        //Пети ред – процентът изкачващи Еверест
        //System.out.println(totalPeople)

        System.out.printf("%.2f%%%n", ((musala / totalPeople) * 100));
        System.out.printf("%.2f%%%n", (montBlanc / totalPeople * 100));
        System.out.printf("%.2f%%%n", (kilimanjaro / totalPeople * 100));
        System.out.printf("%.2f%%%n", (k2 / totalPeople * 100));
        System.out.printf("%.2f%%%n", (everest / totalPeople * 100));
    }
}
