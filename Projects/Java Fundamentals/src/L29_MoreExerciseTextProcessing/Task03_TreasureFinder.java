package L29_MoreExerciseTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03_TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] key = scanner.nextLine().split("\\s+");
        List<String> locations = new ArrayList<>();
        String decodedText = "";
        int count = 0;
        //int currentKey = Integer.parseInt(key[0]);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("find")) {
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                //  "ikegfp'jpne)bv=41P83X@"
                int currentKey = Integer.parseInt(key[count]);
                decodedText += (char) (input.charAt(i) - currentKey) + "";

                count++;
                if (count >= key.length) {
                    count = 0;
                }
            }
            String resource = decodedText.substring(decodedText.indexOf("&") + 1, decodedText.lastIndexOf("&"));
            String location = decodedText.substring(decodedText.indexOf("<") + 1, decodedText.indexOf(">"));
            //System.out.printf("Found %s at %s%n", resource, location );
            locations.add(String.format("Found %s at %s%n", resource, location));
            decodedText = "";
            count = 0;
        }
        System.out.println(String.join("", locations));
    }
}
