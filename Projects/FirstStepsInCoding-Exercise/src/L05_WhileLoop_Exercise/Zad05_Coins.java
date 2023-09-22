package L05_WhileLoop_Exercise;

import java.util.Scanner;

public class Zad05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Производителите на вендинг машини искали да направят машините си да връщат възможно най-малко монети ресто.
        // Напишете програма, която приема сума - рестото, което трябва да се върне и изчислява с колко най-малко монети може да стане това.

        double changeLeva = Double.parseDouble(scanner.nextLine());
        double changeInCoins = Math.floor(changeLeva * 100);   //!!! с вход 0.56 double дава неточност ор 0.0000000000001 и джъдж се побърква!!!
        int countOfCoins = 0;

        while (changeInCoins > 0) {
            if (changeInCoins >= 200) {
                countOfCoins++;
                changeInCoins -= 200;
            } else if (changeInCoins >= 100) {
                countOfCoins++;
                changeInCoins -= 100;
            } else if (changeInCoins >= 50) {
                countOfCoins++;
                changeInCoins -= 50;
            } else if (changeInCoins >= 20) {
                countOfCoins++;
                changeInCoins -= 20;
            } else if (changeInCoins >= 10) {
                countOfCoins++;
                changeInCoins -= 10;
            } else if (changeInCoins >= 5) {
                countOfCoins++;
                changeInCoins -= 5;
            } else if (changeInCoins >= 2) {
                countOfCoins++;
                changeInCoins -= 2;
            } else if (changeInCoins >= 1) {
                countOfCoins++;
                changeInCoins -= 1;
            }
        }
        System.out.println(countOfCoins);
    }
}
