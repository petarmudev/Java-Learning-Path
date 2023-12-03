package FinalExam;

import java.util.Scanner;

public class Task01_DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        while (true) {
            String inputCommand = scanner.nextLine();
            if (inputCommand.equals("Finish")) {
                break;
            }
            String[] commandParts = inputCommand.split(" ");
            String command = commandParts[0];

            switch (command) {
                case "Replace": //"Replace {currentChar} {newChar}"
                    String currentChar = commandParts[1];
                    String newChar = commandParts[2];
                    textInput = new StringBuilder(textInput).toString().replace(currentChar, newChar);
                    System.out.println(textInput);
                    break;
                case "Cut":    //"Cut {startIndex} {endIndex}"
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (isValidIndex(textInput, startIndex, endIndex)) {
                        String leftStr = textInput.substring(0, startIndex);
                        String rightStr = textInput.substring(endIndex + 1);
                        textInput = leftStr + rightStr;

                        System.out.println(textInput);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":    //"Make {Upper/Lower}"
                    String upperOrLower = commandParts[1];
                    if (upperOrLower.equals("Upper")) {
                        textInput = new StringBuilder(textInput).toString().toUpperCase();
                        System.out.println(textInput);
                    } else {
                        textInput = new StringBuilder(textInput).toString().toLowerCase();
                        System.out.println(textInput);
                    }
                    break;
                case "Check":   //"Check {string}"
                    String checkString = commandParts[1];
                    if (textInput.contains(checkString)) {
                        System.out.printf("Message contains %s%n", checkString);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", checkString);
                    }
                    break;
                case "Sum":     //"Sum {startIndex} {endIndex}"
                    startIndex = Integer.parseInt(commandParts[1]);
                    endIndex = Integer.parseInt(commandParts[2]);
                    int totalSum = 0;
                    if (isValidIndex(textInput, startIndex, endIndex)) {
                        String sumTheChars = textInput.substring(startIndex, endIndex + 1);
                        for (char symbol : sumTheChars.toCharArray()) {
                            totalSum += symbol;
                        }
                        System.out.println(totalSum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
        }
    }

    private static boolean isValidIndex(String textInput, int startIndex, int endIndex) {
        if ((startIndex >= 0) && (startIndex < textInput.length()) && (endIndex >= 0) && (endIndex < textInput.length())) {
            return true;
        } else {
            return false;
        }
    }
}
