package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceForApartment = 0;
        double priceForStudio = 0;

        switch (month) {
            case "May":
            case "October":
                //пресмятаме цената за общия брой нощувки
                priceForStudio = countNights * 50;
                priceForApartment = countNights * 65;
               //проверяваме дали имаме отстъпка при повече от 14 нощувки
                if (countNights > 14) {
                    priceForStudio = priceForStudio * 0.7;
                    priceForApartment = priceForApartment * 0.9;
                } else if (countNights > 7) {
                    priceForStudio = priceForStudio * 0.95;
                }
                break;

            case "June":
            case "September":

                priceForStudio = countNights * 75.20;
                priceForApartment = countNights * 68.70;

                if (countNights > 14) {
                    priceForApartment = priceForApartment * 0.90;
                    priceForStudio = priceForStudio * 0.80;

                }
                break;

            case "July":
            case "August":
                priceForStudio = countNights * 76;
                priceForApartment = countNights * 77;

                if (countNights > 14){
                    priceForApartment = priceForApartment * 0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceForApartment);
        System.out.printf("Studio: %.2f lv.", priceForStudio);
    }
}
