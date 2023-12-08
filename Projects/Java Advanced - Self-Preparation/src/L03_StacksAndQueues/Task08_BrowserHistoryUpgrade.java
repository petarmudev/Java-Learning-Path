package L03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        String defaultMsg = "no previous URLs";
        //String current = "";
        while (true) {
            String input = scanner.nextLine();
            if ("Home".equals(input)) {
                break;
            }
            if (input.equals("back")) {
                if (browserHistory.size() == 1) {
                    System.out.println(defaultMsg);
                } else if (browserHistory.isEmpty()) {
                    System.out.println(defaultMsg);
                } else {
                    forwardHistory.addFirst(browserHistory.peek());
                    browserHistory.pop();
                    if (browserHistory.isEmpty()) {
                        System.out.println(defaultMsg);
                    } else {
                        System.out.println(browserHistory.peek());
                    }
                }
            } else if (input.equals("forward")) {       //forward
                if (forwardHistory.size() < 1) {
                    System.out.println("no next URLs");

                } else {
                    System.out.println(forwardHistory.peek());
                    browserHistory.push(forwardHistory.pop());
                    //forwardHistory.clear();
                }

            } else {        //forward address

                browserHistory.push(input);
                System.out.println(input);
                forwardHistory.clear();
            }
        }
    }
}
