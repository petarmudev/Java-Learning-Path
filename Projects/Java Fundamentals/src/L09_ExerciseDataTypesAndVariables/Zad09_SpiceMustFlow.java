package L09_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int startingYield = Integer.parseInt(scanner.nextLine());
        //stop: startingYield < 100
        // continue: startingYield >= 100
        int days = 0;
        int total = 0; //обща стойност на събраните подпрвки


        while (startingYield >= 100) {
            days ++;
            //колко подправки събираме/ден
            int spicePerDay = startingYield -26;
            total += spicePerDay;


            startingYield -= 10;
        }
        if (total > 26) {
            total -= 26;
        }else {
            total = 0;
        }
        System.out.println(days);
        System.out.println(total);
    }
}
