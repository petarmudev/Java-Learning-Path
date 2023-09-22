package L06_NestedLoops_Exercise;

import java.util.Scanner;

public class Zad06_CinemaTicketsv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filmName = scanner.nextLine();
        String input = "";
        int allSeats = 0;

        int seatsCounter = 0;
        int totalTickets = 0;
        double studentTicket = 0;
        double standardTicket = 0;
        double kidTicket = 0;
        double percentCounter = 0;


        while (!filmName.equals("Finish")) {

            allSeats = Integer.parseInt(scanner.nextLine());
            input = scanner.nextLine();
            while (!input.equals("End")) {
                totalTickets++;
                seatsCounter++;
                percentCounter = allSeats;
                if (input.equals("student"))
                    studentTicket++;
                else if (input.equals("standard"))
                    standardTicket++;
                else if (input.equals("kid"))
                    kidTicket++;
                if (seatsCounter == allSeats) {
                    System.out.println(filmName + " - 100.00% full.");
                    break;
                }
                input = scanner.nextLine();
            }
            if (input.equals("End"))
                System.out.printf("%s - %.2f%% full.%n", filmName, (seatsCounter / percentCounter) * 100);
            seatsCounter = 0;
            filmName = scanner.nextLine();
        }
        System.out.println("Total tickets: " + totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (studentTicket / totalTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (standardTicket / totalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (kidTicket / totalTickets) * 100);
    }
}

