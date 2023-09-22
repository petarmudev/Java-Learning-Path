package L06_NestedLoops_Exercise;

import java.util.Scanner;

public class Zad06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = "";
        int studentsTickets = 0;
        int standartTickets = 0;
        int kidsTickets = 0;

        int cinemaPlaces = 0;
        int counter = 0;
//Вход
//  Входът е поредица от цели числа и текст:
//•	        На първия ред до получаване на командата "Finish" - име на филма – текст
//•	        На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
//•	        За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
//o	                Типа на закупения билет - текст ("student", "standard", "kid")

        String input = scanner.nextLine(); //докато получим Finish
        while (!input.equals("Finish")) { //докато получим Finish ще четем
            movieName = input;
            cinemaPlaces = Integer.parseInt(scanner.nextLine());  //свободните места за всеки! филм.

            while (!input.equals("End") && counter < cinemaPlaces) {
                input = scanner.nextLine();
                switch (input) {
                    case "standard":
                        standartTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        break;
                    case "student":
                        studentsTickets++;
                        break;
                    default:
                        return;
                }
            }
            double percentage = ((standartTickets + studentsTickets + kidsTickets) / (cinemaPlaces * 1.0)) * 100;
            System.out.printf("%s - %.2f%% full.", movieName, percentage);




            input = scanner.nextLine();
        }

    }
}
