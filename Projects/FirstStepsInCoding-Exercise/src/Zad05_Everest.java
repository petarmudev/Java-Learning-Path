import java.util.Scanner;

public class Zad05_Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Атанас е алпинист, чиято следваща цел е изкачването на Еверест. Вашата задача е да напишете програма която да следи до каква височина
        // е достигнал Атанас и за колко дни е изкачил върха. Той започва изкачването си от ден първи от базов лагер, който е на 5 364 метра,
        // а самият връх е на 8 848м. Преди всяко изкачване на определени метри, Атанас може да си почине в някой лагер и да продължи на следващия ден,
        // или да продължи изкачването без да спре, като максималното време, в което той може да изкачва върха е 5 дни.
        // Програмата приключва при получаване на командата "END", при достигане на върха(8 848м) или при превишаване на разрешените 5 дни за изкачване.

        //до каква височина е стигнал
        // и за колко дни е изкачил върха
        //Той започва изкачването си от ден първи от базов лагер, който е на 5 364 метра, а самият връх е на 8 848м
        int altitude = 5364;
        int countDays = 1;
        String isSleeping = "";
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            isSleeping = input;
            altitude += Integer.parseInt(scanner.nextLine());
            if (isSleeping.equals("Yes")) {
                countDays++;
            }
            if (countDays == 5) {
                break;
            }
            if (altitude >= 8848) {
                System.out.printf("Goal reached for %d days!", countDays);
                return;
            }

            input = scanner.nextLine();
        }
        System.out.println("Failed!");
        System.out.println(altitude);

    }
}
