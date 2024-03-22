
import java.time.LocalDate;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter date in the following format:\nDD/MM/YYYY");
        String date = s.nextLine();
        boolean isLeap = false;
        int day = Integer.parseInt(date.split("\\s+|\\D+")[0]);
        int month = Integer.parseInt(date.split("\\s+|\\D+")[1]);
        int year = Integer.parseInt(date.split("\\s+|\\D+")[2]);

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            isLeap = true;
        }
        if (Integer.toString(day).length() > 2) {
            System.out.println("Day must contains maximum two digits!");
        }
        if (isLeap && month == 2 && day > 29) {
            System.out.println("Leap year.\nPlease enter day between 1 and 29");
            return;
        } else if (!isLeap && month == 2 && day > 28) {
            System.out.println("Not a leap year.\nPlease enter day between 1 and 28");
            return;
        } else if (day < 1 || day > 31) {
            System.out.println("Please enter day between 1 and 31");
            return;
        }
        if (Integer.toString(month).length() > 2) {
            System.out.println("Month must contains maximum two digits!");
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("Please enter month between 1 and 12");
            return;
        }
        if (Integer.toString(year).length() != 4) {
            System.out.println("Year must contains exactly four digits!");
            return;
        }
        LocalDate current = LocalDate.of(year, month, day);
        String dow = current.getDayOfWeek().name();

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDateTime now = LocalDateTime.now();
        if (current.isAfter(LocalDate.now())) {
            System.out.printf("Day of the week on that date will be:\n%s\n", dow.toLowerCase());
        } else {
            System.out.printf("Day of the week on that date was:\n%s\n", dow.toLowerCase());
        }
    }
}




