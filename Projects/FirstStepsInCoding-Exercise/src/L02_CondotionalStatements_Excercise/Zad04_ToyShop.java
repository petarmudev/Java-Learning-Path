package L02_CondotionalStatements_Excercise;

import java.util.Scanner;

public class Zad04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //6. Магазин за детски играчки
        //Петя има магазин за детски играчки. Тя получава голяма поръчка, която трябва да изпълни.
        // С парите, които ще спечели иска да отиде на екскурзия.
        //Цени на играчките:
        //Пъзел - 2.60 лв.
        //Говореща кукла - 3 лв.
        //Плюшено мече - 4.10 лв.
        //Миньон - 8.20 лв.
        //Камионче - 2 лв.
        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        // От спечелените пари Петя трябва да даде 10% за наема на магазина.
        // Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

        //  double puzzlePrice = 2.60;
        //  double talkingDollPrice = 3;
        //  double teddyBearPrice = 4.10;
        // double minionPrice = 8.20;
        // double truckPrice = 2;

        //Вход
        //От конзолата се четат 6 реда:
        //1. Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2. Брой пъзели - цяло число в интервала [0… 1000]
        //3. Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4. Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5. Брой миньони - цяло число в интервала [0 … 1000]
        //6. Брой камиончета - цяло число в интервала [0 … 1000]

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        //Прочетохме входите данни

        double totalAmount = puzzleCount * 2.60 + dollsCount * 3 + teddyBearsCount * 4.10 + minionsCount * 8.20 + trucksCount * 2;
        double totalCount = puzzleCount + dollsCount + teddyBearsCount + minionsCount + trucksCount;
        double discount = 0;

        if (totalCount >= 50) {
            discount = 25;
        }
        double amountWithDiscount = totalAmount - totalAmount * (discount / 100);
        double rent = amountWithDiscount / 10;
        double finalAmount = amountWithDiscount - rent;

        if (finalAmount >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", (finalAmount - tripPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", (tripPrice - finalAmount));
        }

    }

}
