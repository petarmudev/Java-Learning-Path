package PredvaritelenIzpit;

import java.util.Scanner;

public class Zad01_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //От конзолата се прочитат 5 реда:
        //•	На първи ред: цената в долари за процесора – реално число в интервала [200.00 … 3000.00]
        //•	На втори ред: цената в долари за видео карта – реално число в интервала [100.00 … 1500.00]
        //•	На трети ред: цената в долари за една RAM памет – реално число в интервала [80.00 ... 500.00]
        //•	На четвърти: ред брой RAM памети – цяло число в интервала [1 ... 4]
        //•   На пети ред: процент отстъпка – реално число в интервала [0.01 … 0.1]

        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoCardPrice = Double.parseDouble(scanner.nextLine());
        double ramModulePrice = Double.parseDouble(scanner.nextLine());
        int countRamModules= Integer.parseInt(scanner.nextLine());
        double discountPercentage = Double.parseDouble(scanner.nextLine());
        double dollar = 1.57; //leva
        double totalSum = ((processorPrice * (1.0 - discountPercentage)) + (videoCardPrice * (1.0 - discountPercentage)) + (ramModulePrice * countRamModules)) * dollar ;



        System.out.printf("Money needed - %.2f leva.", totalSum);


    }
}
