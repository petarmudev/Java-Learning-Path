package L05_WhileLoop_Exercise;

import java.util.Scanner;

public class Zad02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2. Подготовка за изпит
        //Напишете програма, в която Марин решава задачи от изпити, докато не получи съобщение "Enough" от лектора си. При всяка решена задача, той
        // получава оценка. Програмата трябва да приключи прочитането на данни при команда "Enough" или ако Марин получи определеният брой незадоволителни оценки.
        //Незадоволителна е всяка оценка, която е по-малка или равна на 4.
        //      Вход
        //          На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
        //      След това многократно се четат по два реда:
        //          Име на задача - текст
        //          Оценка - цяло число в интервала [2…6]

        int failedThreshold = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int equationsSolved = 0;
        double gradesSum = 0;
        String lastTask = "";
        boolean isFailed = false;

        while (failedTimes < failedThreshold) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                failedTimes++;
            }
            gradesSum += grade;
            equationsSolved++;
            lastTask = problemName;
        }
        if (failedTimes >= failedThreshold) {
            System.out.printf("You need a break, %d poor grades.", failedThreshold);
        } else {
            System.out.printf("Average score: %.2f%n", (gradesSum/equationsSolved));
            System.out.printf("Number of problems: %d%n", equationsSolved);
            System.out.printf("Last problem: %s", lastTask);
        }
        //      Изход
        //  Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
        //      "Average score: {средна оценка}"
        //      "Number of problems: {броя на всички задачи}"
        //      "Last problem: {името на последната задача}"
        //  Ако получи определения брой незадоволителни оценки:
        //      "You need a break, {брой незадоволителни оценки} poor grades."
        //Средната оценка да бъде форматирана до втория знак след десетичната запетая.
    }
}
