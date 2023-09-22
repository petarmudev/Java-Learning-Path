package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Студент трябва да отиде на изпит в определен час. Той идва в изпитната зала в даден час на пристигане.
        Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на изпита или до половин час преди това.
        Ако е пристигнал по-рано повече от 30 минути, той е подранил. Ако е дошъл след часа на изпита, той е закъснял.
        Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали студентът е дошъл навреме,
        дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.*/

        /*   Вход
        От конзолата се четат 4 цели числа (по едно на ред), въведени от потребителя
            · Първият ред съдържа час на изпита – цяло число от 0 до 23.
            · Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
            · Третият ред съдържа час на пристигане – цяло число от 0 до 23.
            · Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59
*/
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        //превръщаме в една мерна единица - минути
        int totalExamMinutes = (examHour * 60) + examMinutes;
        int totalArriveMinutes = (arriveHour * 60) + arriveMinutes;
        int diff = Math.abs(totalArriveMinutes - totalExamMinutes);
        //pravim proverka dli e zakusnql

        if (totalArriveMinutes > totalExamMinutes) {  //тук проверяваме дали е закъснял
            System.out.println("Late");
            if (diff < 60) {                          //Ако е закъснял до 60 мин.
                System.out.printf("%d minutes after the start", diff);
            } else {                                  //Ако е закъснял над 1 час.
                int totalLateHour = diff / 60;
                int totalLateMin = diff % 60;
                System.out.printf("%d:%02d hours after the start", totalLateHour, totalLateMin);
            }
        } else if (totalExamMinutes > totalArriveMinutes && (totalExamMinutes - totalArriveMinutes) <= 30) { //тук е дошъл(навреме) до 30 мин преди изпита
            System.out.println("On time");
            System.out.printf("%d minutes before the start", diff);
        } else if (diff == 0) {                          //Ако е точно навреме.
            System.out.println("On time");
        } else {                                        //Ако е подранил повече от 30 мин.
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int totalEarlyHour = diff / 60;
                int totalEarlyMinutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", totalEarlyHour, totalEarlyMinutes);
            }
        }



         /*Изход
        На първият ред отпечатайте:
            · "Late", ако студентът пристига по-късно от часа на изпита.
            · "On time", ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
            · "Early", ако студентът пристига повече от 30 минути преди часа на изпита.

        Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
            · "mm minutes before the start" за идване по-рано с по-малко от час.
            · "hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
            · "mm minutes after the start" за закъснение под час.
            · "hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03
*/


    }
}
