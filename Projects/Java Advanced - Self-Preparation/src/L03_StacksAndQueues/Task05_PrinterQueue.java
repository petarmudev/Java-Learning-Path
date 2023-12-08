package L03_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("print")) {
                break;
            }
            if (input.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String canceledDocument = printerQueue.poll();
                    System.out.println("Canceled " + canceledDocument);
                }
            } else {
                printerQueue.offer(input);
            }
        }
        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
