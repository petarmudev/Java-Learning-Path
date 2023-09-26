package Projects.untitled.src;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int forfeit = 0;

        for (int i = 1; i <= n; i++) {

            String siteName = scanner.nextLine();

            if (siteName.equals("Facebook"))
                forfeit += 150;
            else if (siteName.equals("Instagram"))
                forfeit += 100;
            else if (siteName.equals("Reddit"))
                forfeit += 50;

            if (forfeit >= salary) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > forfeit)
            System.out.printf("%d", salary - forfeit);
    }
}


