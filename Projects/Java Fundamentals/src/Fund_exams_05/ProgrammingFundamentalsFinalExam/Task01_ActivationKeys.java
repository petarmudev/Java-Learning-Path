package Fund_exams_05.ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class Task01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Generate")) {
                break;
            }
            String[] commandParts = input.split(">>>");
            String command = commandParts[0];
            switch (command) {     //There are several types of instructions, split by ">>>":
                case "Contains":    //•	"Contains>>>{substring}":
                    String substring = commandParts[1];
                    if (rawKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", rawKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":    //•	"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                    String toUpperOrLower = commandParts[1];
                    int startIndex = Integer.parseInt(commandParts[2]);
                    int endIndex = Integer.parseInt(commandParts[3]);
                    String startConcat = rawKey.substring(0, startIndex);
                    String endConcatenate = rawKey.substring(endIndex);
                    if (toUpperOrLower.equals("Upper")) {

                        String toUpper = rawKey.substring(startIndex, endIndex).toUpperCase();
                        rawKey = startConcat + toUpper + endConcatenate;
                        System.out.println(rawKey);
                    } else if (toUpperOrLower.equals("Lower")) {
                        String toLower = rawKey.substring(startIndex, endIndex).toLowerCase();
                        rawKey = startConcat + toLower + endConcatenate;
                        System.out.println(rawKey);
                    }
                    break;

                case "Slice":    //•	"Slice>>>{startIndex}>>>{endIndex}":
                    startIndex = Integer.parseInt(commandParts[1]);
                    endIndex = Integer.parseInt(commandParts[2]);
                    String leftString = rawKey.substring(0, startIndex);
                    String rightString = rawKey.substring(endIndex);
                    rawKey = leftString + rightString;
                    System.out.println(rawKey);

                    break;
                default:
                    break;
            }
        }
        System.out.println("Your activation key is: " + rawKey);
    }
}
