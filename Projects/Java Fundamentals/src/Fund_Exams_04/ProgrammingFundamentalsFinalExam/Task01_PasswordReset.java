package Fund_Exams_04.ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class Task01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String newPassword = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            String[] commandParts = input.split("\\s");
            String command = commandParts[0];

            switch (command) {
                case "TakeOdd":   //Takes only the characters at odd indices and concatenates them to obtain the new raw password and then prints it.

                    for (int i = 1; i < text.length(); i += 2) {
                        newPassword += text.charAt(i);
                    }
                    System.out.println(newPassword);
                    break;

                case "Cut":     //"Cut {index} {length}"
                    int index = Integer.parseInt(commandParts[1]);
                    int lenght = Integer.parseInt(commandParts[2]);

                    String substring = newPassword.substring(0, index);
                    String substringToConcat = newPassword.substring((index + lenght));

                    newPassword = substring + substringToConcat;
                    System.out.println(newPassword);
                    break;

                case "Substitute":      //"Substitute {substring} {substitute}"
                    // "Substitute :: -"
                    String replace = commandParts[1];
                    String replacement = commandParts[2];

                    if (newPassword.contains(replace)) {
                        newPassword = newPassword.replaceAll(replace, replacement);
                        System.out.println(newPassword);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
                default:
                    break;
            }
        }
        //Print: "Your password is: {password}"
        System.out.printf("Your password is: %s", newPassword);
    }
}
