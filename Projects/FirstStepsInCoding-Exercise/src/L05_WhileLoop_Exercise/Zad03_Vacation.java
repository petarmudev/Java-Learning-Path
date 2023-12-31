package L05_WhileLoop_Exercise;

import java.util.Scanner;

public class Zad03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3. Почивка
        //Джеси е решила да събира пари за екскурзия и иска от вас да ѝ помогнете да разбере дали ще успее да събере необходимата сума.
        // Тя спестява или харчи част от парите си всеки ден. Ако иска да похарчи повече от наличните си пари, то тя ще похарчи всичките и ще ѝ останат 0 лева.
        //          Вход
        //     От конзолата се четат:
        //      Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        //      Налични пари - реално число в интервала [0.00...25000.00]
        //     След това многократно се четат по два реда:
        //      Вид действие - текст с възможности "spend" и "save"
        //      Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendingCounter = 0;

        while (ownedMoney < neededMoney && spendingCounter < 5) {
            String action = scanner.nextLine();
            double actionAmount = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if (action.equals("save")) {
                ownedMoney += actionAmount;
                spendingCounter = 0;
            } else if (action.equals("spend")) {
                ownedMoney -= actionAmount;
                spendingCounter += 1;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
            if (spendingCounter == 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysCounter);
            }
            if (ownedMoney >= neededMoney) {
                System.out.printf("You saved the money for %d days.", daysCounter);
            }
        }


        //          Изход
        //Програмата трябва да приключи при следните случаи:
        //Ако 5 последователни дни Джеси само харчи, на конзолата да се изпише:
        //"You can't save the money."
        //"{Общ брой изминали дни}"
        //Ако Джеси събере парите за почивката на конзолата се изписва:
        //"You saved the money for {общ брой изминали дни} days."

    }
}
