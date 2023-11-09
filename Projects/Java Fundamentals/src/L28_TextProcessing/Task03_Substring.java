package L28_TextProcessing;

import java.util.Scanner;

public class Task03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();

        while (true) {
            int index = text.indexOf(word);
            if (index == -1) {
                break;
            }

            String leftSubstring = text.substring(0, index);
            String rightSubstring = text.substring(index + word.length());

            text = leftSubstring + rightSubstring;
        }
        System.out.println(text);
    }
}
