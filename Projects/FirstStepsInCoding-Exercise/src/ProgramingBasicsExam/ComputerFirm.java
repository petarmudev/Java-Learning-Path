package ProgramingBasicsExam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	n - брой компютри - цяло число в интервала [1…10]
        int computerCount = Integer.parseInt(scanner.nextLine());
        //На следващите n реда:
        //•	Числото, представляващо възможните продажби и рейтинга - цяло число в интервала [32…306]
        int salesAndRaiting = 0;
        Double salesMade = 0.00;
        Double averageRating = 0.00;
        int possibleSales = 0;
        Double rating = 0.00;
        Double totalSalesMade = 0.00;

        for (int i = 0; i < computerCount; i++) {
            salesAndRaiting = Integer.parseInt(scanner.nextLine());
            averageRating = salesAndRaiting % 10.00;
            rating += averageRating;
            possibleSales = salesAndRaiting / 10;

            if (averageRating == 2) {
                salesMade = possibleSales * 0.0;
            } else if (averageRating == 3) {
                salesMade = possibleSales / 2.00;
            } else if (averageRating == 4) {
                salesMade = possibleSales * 0.7;

            } else if (averageRating == 5) {
                salesMade = possibleSales * 0.85;

            } else if (averageRating == 6) {
                salesMade = possibleSales * 1.0;

            }
            totalSalesMade += salesMade ;

        }
        System.out.printf("%.2f\n", totalSalesMade);
        System.out.printf("%.2f", rating / computerCount);
    }
}
