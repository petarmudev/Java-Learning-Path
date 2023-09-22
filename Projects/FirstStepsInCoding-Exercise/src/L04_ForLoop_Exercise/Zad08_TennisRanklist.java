package L04_ForLoop_Exercise;

import java.util.Scanner;

public class Zad08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //8. Световна ранглиста по тенис
        //Григор Димитров е тенисист, чиято следваща цел е изкачването в световната ранглиста по тенис за мъже.
        //През годината Гришо участва в определен брой турнири, като за всеки турнир получава точки, които зависят от позицията,
        // на която е завършил в турнира. Има три варианта за завършване на турнир:
        //      W - ако е победител получава 2000 точки
        //      F - ако е финалист получава 1200 точки
        //      SF - ако е полуфиналист получава 720 точки
        //Напишете програма, която изчислява колко ще са точките на Григор след изиграване на всички турнири, като знаете с колко точки стартира
        // сезона. Също изчислете колко точки средно печели от всички изиграни турнири и колко процента от турнирите е спечелил.

        //Вход
        //От конзолата първо се четат два реда:
        //Брой турнири, в които е участвал – цяло число в интервала [1…20]
        //Начален брой точки в ранглистата - цяло число в интервала [1...4000]
        //За всеки турнир се прочита отделен ред:
        //Достигнат етап от турнира – текст – "W", "F" или "SF"
        int tournamentsCount = Integer.parseInt(scanner.nextLine()); //[1…20]
        int startingPoints = Integer.parseInt(scanner.nextLine());  //[1...4000]
        int pointsReceived = 0;
        int winningCount = 0;
        for (int i = 0; i < tournamentsCount; i++) {

            String stageReached = scanner.nextLine();
            switch (stageReached) {
                case "W":
                    winningCount++;
                    pointsReceived += 2000;
                    break;
                case "F":
                    pointsReceived += 1200;
                    break;
                case "SF":
                    pointsReceived += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", (startingPoints + pointsReceived));
        System.out.printf("Average points: %d%n", (pointsReceived / tournamentsCount));
        System.out.printf("%.2f%%", (winningCount / (tournamentsCount * 1.0) * 100));


        //Изход
        //Отпечатват се три реда в следния формат:
        //"Final points: {брой точки след изиграните турнири}"
        //"Average points: {средно колко точки печели за турнир}"
        //"{процент спечелени турнири}%"
        //Средните точки да бъдат закръглени към най-близкото цяло число надолу, а процентът да се форматира до втората цифра след десетичния знак.

    }
}
