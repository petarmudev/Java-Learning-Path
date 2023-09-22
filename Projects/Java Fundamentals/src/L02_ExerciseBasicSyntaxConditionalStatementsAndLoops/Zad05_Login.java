package L02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You will be given a string representing a username. The password will be that username reversed.
        Until you receive the correct password, print on the console "Incorrect password. Try again.".
        When you receive the correct password, print "User {username} logged in."
        However, on the fourth try, if the password is still not correct, print "User {username} blocked!" and end the program.
         */

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;

        }
        int countWrongPassword = 0;
        String enteredPass = scanner.nextLine();
        while (!enteredPass.equals(password)) {
            //грешна парола
            countWrongPassword++; //брояч за грешни опити
            if (countWrongPassword == 4) {
                System.out.printf("User %s blocked!", username);
                return; // break; прекратява опита , а не цялата програма надолу
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();
            if (enteredPass.equals(password)) {
                //TODO uslovieto

            }
        }//вярна парола
        System.out.printf("User %s logged in.", username);
    }
}
