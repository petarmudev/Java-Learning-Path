package L05_WhileLoop_Exercise;

import java.util.Scanner;

public class Zad04_WalkingRe6enaOtKastamanov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // създаваме една String променлива за командата, която ще получаваме -> "Going Home" или стъпки, които са направени
        String command = scanner.nextLine();

        // правим променлива, в която съхраняваме общия брой стъпки
        int sumSteps = 0;

        //цикъл докато не получим команда "Going Home" или стъпките станат >= 10000
        while (!command.equals("Going home")){

            //щом нямаме Going home -> парсваме command -> int, което са текущи стъпки
            int currentSteps = Integer.parseInt(command);

            //увеличаваме сумата на стъпките
            sumSteps += currentSteps;

            // проверяваме дали стъпките са повече или равни на 10000
            if(sumSteps >= 10000){
                break;
            }

            //прочитаме следващия ред -> Going home или брой стъпки
            command = scanner.nextLine();
        }

        //проверка ако получим команда Going home -> прочитаме стъпките до вкъщи -> прибавяме ги към общия брой стъпки
        if(command.equals("Going home")){
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            sumSteps += stepsToHome;
        }

        //правим проверка дали сме постигнали целта от 10000
        if (sumSteps >= 10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - 10000);
        }else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        }
    }
}
