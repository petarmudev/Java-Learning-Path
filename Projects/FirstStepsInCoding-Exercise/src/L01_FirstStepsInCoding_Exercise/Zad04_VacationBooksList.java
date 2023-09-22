package L01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Zad04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Понеже Жоро предпочита да играе с приятели навън, вашата задача е да му помогнете да изчисли колко часа на ден
        // трябва да отделя, за да прочете необходимата литература.
        //Вход
        //От конзолата се четат 3 реда:
        //1. Брой страници в текущата книга – цяло число в интервала [1…1000]
        //2. Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        //3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]

        int pagesCount =Integer.parseInt(scanner.nextLine());
        int pagesPerHourRead = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalReadingTime = pagesCount / pagesPerHourRead;
        int requiredHours = totalReadingTime / days;

        System.out.println(requiredHours);

    }
}
