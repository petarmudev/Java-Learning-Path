package L06_NestedLoops_Lab;

import java.util.Scanner;

public class Zad04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //4.	Сума от две числа
        //Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа. На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число. Ако няма нито една комбинация отговаряща на условието се отпечатва съобщение, че не е намерено.
        //Вход
        //Входът се чете от конзолата и се състои от три реда:
        //•	Първи ред – начало на интервала – цяло число в интервала [1...999]
        //•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        //•	Трети ред – магическото число – цяло число в интервала [1...10000]

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine()); // end > start
        int magicalNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        int count = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magicalNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicalNumber);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
            //Изход
            //На конзолата трябва да се отпечата един ред, според резултата:
            //•	Ако е намерена комбинация чиито сбор на числата е равен на магическото число
            //o	"Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
            //•	Ако не е намерена комбинация отговаряща на условието
            //o	"{броят на всички комбинации} combinations - neither equals {магическото число}"
        }if (!isFound){
            System.out.printf("%d combinations - neither equals %d", count, magicalNumber);
        }
    }
}