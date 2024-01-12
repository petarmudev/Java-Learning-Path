package L04_StacksAndQueuesExercise;

import com.sun.source.tree.BreakTree;

import java.util.*;
import java.util.stream.Collectors;

public class Task05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        if (isBalanced(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isBalanced(List<String> input) {
        Deque<String> openParenthesesStack = new ArrayDeque<>();
        boolean isBalanced = false;
        for (int i = 0; i < input.size(); i++) {
            String symbol = input.get(i);
            switch (symbol) {
                case "}":
                    if (openParenthesesStack.isEmpty()) {
                        return false;
                    } else {
                        String openBrace = openParenthesesStack.pop();
                        if (!openBrace.equals("{")) {
                            return false;
                        }
                    }
                    break;
                case "]":
                    if (openParenthesesStack.isEmpty()) {
                        return false;
                    } else {
                        String openBrace = openParenthesesStack.pop();
                        if (!openBrace.equals("[")) {
                            return false;
                        }
                    }
                    break;
                case ")":
                    if (openParenthesesStack.isEmpty()) {
                        return false;
                    } else {
                        String openBrace = openParenthesesStack.pop();
                        if (!openBrace.equals("(")) {
                            return false;
                        }
                    }
                    break;
                default:
                    openParenthesesStack.push(symbol);
                    break;
            }
        }
        return true;
    }
}
