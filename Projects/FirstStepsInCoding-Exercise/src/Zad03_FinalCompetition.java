import java.util.Scanner;

public class Zad03_FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Final Competition
        //От конзолата се четат 4 реда:
        //1.	Брой танцьори – цяло число в интервала [1 … 10]
        //2.	Брой точки – реално число в интервала [1.00 … 10000.00]
        //3.	Сезон –  текст със следните възможности - "summer" или "winter"
        //4.	Място – текст със следните възможности - "Bulgaria" или "Abroad"

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();
        double charity = 0.75;
        double sum = 0;
        double total = 0;

        //double moneyWon = dancers * points;

        if (location.equals("Bulgaria") && season.equals("summer")) {
            sum = (points * dancers) * 0.95;
        } else if (location.equals("Bulgaria") && season.equals("winter")) {
            sum = (points * dancers) * 0.92;
        } else if (location.equals("Abroad") && season.equals("summer")) {
            sum = ((dancers * points) * 1.50) * 0.90;
        }else if (location.equals("Abroad") &&  season.equals("winter")) {
            sum = ((dancers * points) * 1.50) * 0.85;
        }

        total = sum * charity;
        System.out.printf("Charity - %.2f%n", total);
        System.out.printf("Money per dancer - %.2f", (sum - total) / dancers);
    }
}
