package L03_ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Zad07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
      /*  Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст) - въведени от потребителя
       и проверява дали офисът на фирма е отворен, като работното време на офисът е от 10-18 часа, от понеделник до събота включителн*/

        if (hour <10 || hour > 18 || dayOfWeek.equals("Sunday")){
            System.out.println("closed");
        } else {
            System.out.println("open");
        }

    }

}
