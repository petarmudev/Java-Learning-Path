package L34_ExamPreparation;

import java.util.Scanner;

public class Task01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Travel")) {
                break;
            }

            String[] commandParts = line.split(":");
            String command = commandParts[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String stopText = commandParts[2];
                    if (isValidIdx(index, stops)) {
                        String left = stops.substring(0, index);
                        String right = stopText + stops.substring(index);
                        stops = left + right;
                    }
                    break;
                case "Remove Stop":
                    index = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);
                    if (isValidIdx(index, stops) && isValidIdx(secondIndex, stops)) {
                        String left = stops.substring(0, index);
                        String right = stops.substring(secondIndex + 1);
                        stops = left + right;
                    }
                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];

                    stops = stops.replaceAll(oldString, newString);

                    break;
                default:
                    break;
            }
            System.out.println(stops);
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }

    private static boolean isValidIdx(int index, String stops) {
        return index >= 0 && index < stops.length();
    }
}
