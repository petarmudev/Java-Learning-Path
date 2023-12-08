package L03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        ArrayDeque<Integer> indexStack = new ArrayDeque<>();

        for (int index = 0; index < inputText.length(); index++) {
            char ch = inputText.charAt(index);
            if (ch == '(') {
                indexStack.push(index);
            } else if (ch == ')') {
                int endIndex = index;
                int startIndex = indexStack.pop();
                String substring = inputText.substring(startIndex, endIndex + 1);
                System.out.println(substring);
            }
        }
    }
}
