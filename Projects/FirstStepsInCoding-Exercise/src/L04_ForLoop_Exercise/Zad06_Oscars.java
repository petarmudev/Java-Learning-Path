package L04_ForLoop_Exercise;

import java.util.Scanner;

public class Zad06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса.
        // Академията ще ви даде първоначални точки за актьора. След това всеки оценяващ ще дава своята оценка.
        // Точките, които актьора получава се формират от: дължината на името на оценяващия умножено по точките, които дава делено на две.
        //Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата, че дадения актьор е получил номинация.

        //Вход
        //Име на актьора - текст  // actorName
        //Точки от академията - реално число в интервала [2.0... 450.5]  //points
        //Брой оценяващи n - цяло число в интервала[1… 20]  //evaluative

        //На следващите n-на брой реда:
        //  .Име на оценяващия - текст  //evaluativeName
        //  .Точки от оценяващия - реално число в интервала [1.0... 50.0]  //pointsGiven

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int evaluatives = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < evaluatives; i++) {
            String evaluativeName = scanner.nextLine();
            double pointsGiven = Double.parseDouble(scanner.nextLine());
            points += ( evaluativeName.length() * pointsGiven ) / 2;
            if (points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!" , actorName, (1250.5 - points));

        //Изход
        //Да се отпечата на конзолата един ред:
        //Ако точките са над 1250.5:
        //"Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
        //Ако точките не са достатъчни:
        //	"Sorry, {име на актьора} you need {нужни точки} more!"
        //Резултатът да се форматирана до първата цифра след десетичния знак!

    }
}
