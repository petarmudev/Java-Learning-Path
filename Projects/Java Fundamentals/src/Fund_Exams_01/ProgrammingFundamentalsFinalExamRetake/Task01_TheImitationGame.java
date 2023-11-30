package Fund_Exams_01.ProgrammingFundamentalsFinalExamRetake;

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
            //Input:
            //"Move {number of letters}"
            //"Insert {index} {value}"
            //"ChangeAll {substring} {replacement}"
            String[] commandParts = input.split("\\|");
            String command = commandParts[0];
            switch (command) {

                case "Move":    //"Move {number of letters}"
                    int numberOfLetters = Integer.parseInt(commandParts[1]);
                    String textToMove = decryptedText.substring(0, numberOfLetters);
                    //todo the rest of the logic
                    if (numberOfLetters >= 0 && numberOfLetters < decryptedText.length()) {
                        decryptedText.delete(0, numberOfLetters);
                        decryptedText.append(textToMove);
                    }
                    break;

                case "Insert":  //"Insert {index} {value}"
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    if (index >=0 && index <= decryptedText.length()) {
                        decryptedText.insert(index, value);
                    }
                    break;

                case "ChangeAll":   //"ChangeAll {substring} {replacement}"
                    String substringToReplace = commandParts[1];
                    String replacementString = commandParts[2];

                    decryptedText = new StringBuilder(decryptedText.toString().replace(substringToReplace, replacementString));
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
