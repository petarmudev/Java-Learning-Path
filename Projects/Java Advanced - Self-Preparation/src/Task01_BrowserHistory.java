import java.util.ArrayDeque;
import java.util.Scanner;

public class Task01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();

        String defaultMsg = "no previous URLs";
        String current = "";
        while (true) {
            String input = scanner.nextLine();
            if ("Home".equals(input)) {
                break;
            }
            if (input.equals("back")) {
                if (history.size() == 1) {
                    System.out.println(defaultMsg);
                } else {
                    history.pop();
                    if (history.isEmpty()) {
                        System.out.println(defaultMsg);
                    } else {
                        System.out.println(history.peek());
                    }
                }
            } else {
                history.push(input);
                System.out.println(input);
            }
        }
    }
}
