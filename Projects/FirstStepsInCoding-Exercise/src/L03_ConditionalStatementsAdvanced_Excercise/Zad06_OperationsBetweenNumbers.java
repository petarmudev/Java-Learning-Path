package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена математическа операция с тях.
        Възможните операции са: Събиране (+), Изваждане (-), Умножение (*), Деление (/) и Деление с остатък (%).
        При събиране, изваждане и умножение на конзолата трябва да се отпечата резултатът и дали той е четен или нечетен.
        При обикновеното деление – резултатът. При модулното деление – остатъка.
        Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели.
        В този случай трябва да се отпечата специално съобщение.*/

            /*Вход

    От конзолата се прочитат 3 реда, въведени от потребителя:
        · N1 – цяло число в интервала [0...40 000]
        · N2 – цяло число в интервала [0...40 000]
        · Оператор – един символ измеду: "+", "-", "*", "/", "%" */

        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int sum = 0;
        double sum2 = 0;

        //Правим switch, според оператора -> case "+",case "-",case "*",case "/",case "%"
        switch (symbol) {
            //В зависимост от символа изпълняваме съответните действия
            case "+":
                sum = num + num2;
                //Проверяваме дали е четно или не
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num, symbol, num2, sum);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num, symbol, num2, sum);
                }
                break;
            case "-":
                sum = num - num2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num, symbol, num2, sum);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num, symbol, num2, sum);
                }
                break;
            case "*":
                sum = num * num2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num, symbol, num2, sum);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num, symbol, num2, sum);
                }
                break;
            case "/": //Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели.
                // В този случай трябва да се отпечата специално съобщение.
                if (num2 != 0) {
                    sum2 = (1.0 * num) / num2;
                    System.out.printf("%d / %d = %.2f", num, num2, sum2);
                } else {
                    System.out.printf("Cannot divide %d by zero", num);
                }
                break;
            case "%":
                if (num2 != 0) {
                    sum2 = num % num2;
                    System.out.printf("%d %s %d = %.0f", num, symbol, num2, sum2);
                } else {
                    System.out.printf("Cannot divide %d by zero", num);
                }

                break;
        }

        /*
    Изход
    Да се отпечата на конзолата един ред:
    · Ако операцията е събиране, изваждане или умножение:
        o "{N1} {оператор} {N2} = {резултат} – {even/odd}"
    · Ако операцията е деление:
        o "{N1} / {N2} = {резултат}" – резултатът е форматиран до вторият знак след дес.запетая
    · Ако операцията е деление с остатък:
        o "{N1} % {N2} = {остатък}"
    · В случай на деление с 0 (нула):
        o "Cannot divide {N1} by zero"*/


    }
}
