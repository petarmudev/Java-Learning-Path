package L06_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        //сумаМечове = (Math.ceil(студентсЦоунт + 10%) * цена на брой)
        double sumSabers = Math.ceil(studentsCount + 0.10 * studentsCount) * priceSaber;
        //сума Роби = priceRobe * studentsCount
        double sumRobes = studentsCount * priceRobe;
        //сума коланите = (studentsCount - studentsCount / 6) * priceBelt // всеки 6-ти е безплатен
        double sumBelts = (studentsCount - (studentsCount / 6))* priceBelt;
        //обща сума = сумаМечове + сумаРоби + сумаКолани

        double totalSum = sumSabers + sumRobes + sumBelts;

        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - budget);
        }





    }
}
