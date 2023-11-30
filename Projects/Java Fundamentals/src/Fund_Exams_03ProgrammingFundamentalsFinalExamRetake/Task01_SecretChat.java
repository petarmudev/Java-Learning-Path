package Fund_Exams_03ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class Task01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Решено на L35_ExamPreparation2

        //String cosealedMessage = scanner.nextLine();
        StringBuilder consealedMsg = new StringBuilder(scanner.nextLine());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Reveal")) {
                break;
            }
            String[] commandParts = input.split(":\\|:");
            String command = commandParts[0];
            switch (command) {
                case "InsertSpace":     // "InsertSpace:|:{index}"
                    int index = Integer.parseInt(commandParts[1]);
                    consealedMsg.insert(index, " ");
                    System.out.println(consealedMsg);
                    break;

                case "Reverse":     //"Reverse:|:{substring}"
                    String substring = commandParts[1];
                    if (consealedMsg.toString().contains(substring)) {

                        //1. махаме текста от съобщението.
                        int indexOfSubstring = consealedMsg.indexOf(substring);
                        consealedMsg.delete(indexOfSubstring, indexOfSubstring + substring.length());

                        //2. Reverse съобщението.
                        String reversedSubstring = new StringBuilder(substring).reverse().toString();

                        //3.
                        consealedMsg.append(reversedSubstring);
                        System.out.println(consealedMsg);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "ChangeAll":       //"ChangeAll:|:{substring}:|:{replacement}"
                    String substringToChange = commandParts[1];
                    String replacement = commandParts[2];
                    consealedMsg = new StringBuilder(consealedMsg.toString().replace(substringToChange, replacement));
                    System.out.println(consealedMsg);
                    break;
                default:
                    break;
            }

        }
        System.out.printf("You have a new text message: %s", consealedMsg.toString());

    }
}
