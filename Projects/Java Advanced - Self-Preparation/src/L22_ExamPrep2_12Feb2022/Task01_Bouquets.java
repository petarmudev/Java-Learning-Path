package L22_ExamPrep2_12Feb2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> tulips = new ArrayDeque<>();        //Stack: push   pop   peek
        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt).forEach(tulips::push);
        ArrayDeque<Integer> daffodils = new ArrayDeque<>();     //Queue: offer  poll  peek
        Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt).forEach(daffodils::offer);


        int bouquetsMade = 0;
        int tempStore = 0;
        while (!tulips.isEmpty() && !daffodils.isEmpty()) {
            int tulip = tulips.peek();
            int daffodil = daffodils.peek();

            int sum = tulip + daffodil;

            while (sum > 15 && tulip > 2) {
                tulip -= 2;
                sum = tulip + daffodil;
            }

            if (sum == 15) {
                bouquetsMade++;
            } else {
                tempStore += sum;
            }
            tulips.pop();
            daffodils.poll();
        }
        if (tempStore != 0) {
            bouquetsMade += tempStore / 15;
        }
        if (bouquetsMade < 5) {
            System.out.printf("You failed... You need more %d bouquets.%n", 5 - bouquetsMade);
        } else {
            System.out.printf("You made it! You go to the competition with %d bouquets!%n", bouquetsMade);
        }
    }
}
