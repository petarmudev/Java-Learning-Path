package Fund_Exams_04.ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class Task01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            String[] commandParts = input.split("\\s");
            String command = commandParts[0];

            switch (command) {
                case "TakeOdd":   //Takes only the characters at odd indices and concatenates them to obtain the new raw password and then prints it.
                    StringBuilder newTempPass = new StringBuilder();
                    for (int i = 1; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            newTempPass.append(password.charAt(i));
                        }
                    }
                    password = newTempPass.toString();
                    System.out.println(password);
                    break;

                case "Cut":     //"Cut {index} {length}"
                    int index = Integer.parseInt(commandParts[1]);
                    int lenght = index + Integer.parseInt(commandParts[2]);

//                    String substring = newPassword.substring(0, index);
//                    String substringToConcat = newPassword.substring((lenght));

                    password = new StringBuilder(password).delete(index, lenght).toString();
                    System.out.println(password);
                    break;

                case "Substitute":      //"Substitute {substring} {substitute}"
                    // "Substitute :: -"
                    String target = commandParts[1];
                    String replacement = commandParts[2];

                    if (password.contains(target)) {
                        password = password.replaceAll(target, replacement);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
        }
        //Print: "Your password is: {password}"
        System.out.println("Your password is: " + password);
    }
}
