package L02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You are given a group of people, type of the group, on which day of the week they will stay. Based on that information, calculate how much they must pay and print that price on the console. Use the table below. In each cell is the price for a single person. The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.
            	    Friday	 Saturday	Sunday
        Students	8.45      9.80  	10.46
        Business	10.90	  15.60 	16
        Regular	    15        20	    22.50
    There are also discounts based on some conditions:
    •	Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
    •	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
    •	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%
            You should reduce the prices in that EXACT order.
                    Examples
            Input   	Output
            30
            Students
            Sunday	    Total price: 266.73

            40
            Regular
            Saturday	Total price: 800.00


            50
            Business
            Friday	    Total price: 545.00



         */
        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;
        double discount = 1;

        switch (dayOfWeek) {
            case "Friday":
                if (groupType.equals("Students")) {
                    price = 8.45;
                    if (groupSize >= 30) {
                        discount = 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 10.90;
                    if (groupSize >= 100) {
                        groupSize -= 10;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 15;
                    if (groupSize >= 10 && groupSize <= 20){
                        discount = 0.95;
                    }
                }
                break;
            case "Saturday":
                if (groupType.equals("Students")) {
                    price = 9.8;
                    if (groupSize >= 30) {
                        discount = 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 15.60;
                    if (groupSize >= 100) {
                        groupSize -= 10;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 20;
                    if (groupSize >= 10 && groupSize <= 20){
                        discount = 0.95;
                    }
                }
                break;
            case "Sunday":
                if (groupType.equals("Students")) {
                    price = 10.46;
                    if (groupSize >= 30) {
                        discount = 0.85;
                    }
                } else if (groupType.equals("Business")) {
                    price = 16;
                    if (groupSize >= 100) {
                        groupSize -= 10;
                    }
                } else if (groupType.equals("Regular")) {
                    price = 22.50;
                    if (groupSize >= 10 && groupSize <= 20){
                        discount = 0.95;
                    }
                }
                break;
            default:
                break;
        }
        System.out.printf("Total price: %.2f", groupSize * price * discount);
    }
}
