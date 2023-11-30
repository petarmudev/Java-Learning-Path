package L36_01.ProgrammingFundamentalsFinalExamRetake;

import java.awt.*;
import java.util.Scanner;

public class Task01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();      //encrypted text input
        StringBuilder decryptedText = new StringBuilder(inputText);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Decode")) {
                break;
            }
            //"Move {number of letters}"
            //"Insert {index} {value}"
            //"ChangeAll {substring} {replacement}"

            String[] commandParts = input.split("\\|");
            String command = commandParts[0];
            switch (command) {
                case "Move":
                    int numberOfLetters =Integer.parseInt(commandParts[1]);
                    //todo the rest of the logic

                    break;

                case "Insert":
                    int index =Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    //todo the rest...
                    break;

                    case "ChangeAll":
                        String substringToReplace = commandParts[1];
                        String replacementString = commandParts[2];
                        //todo the rest...
//                        int startIndex = decryptedText.indexOf(substringToReplace);
//                        int endIndex = decryptedText.lastIndexOf(substringToReplace);
//                        decryptedText.replace(startIndex, endIndex, replacementString);
                        decryptedText = new StringBuilder(decryptedText.toString().replaceAll(substringToReplace, replacementString));

                    break;
                default:
                    break;
            }
        }
        //Print.
        // "The decrypted message is: {message}"
        System.out.printf("The decrypted message is: %s", decryptedText);
    }

}
