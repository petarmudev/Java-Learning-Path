package Fund_Exams_04.ProgrammingFundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOrRows = Integer.parseInt(scanner.nextLine());
        String regex = "(@#+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < numberOrRows; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String sum = "";
                boolean hasDigit = false;
                for (char symbol : matcher.group("barcode").toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        hasDigit = true;
                        sum += symbol;
                    }
                }
                if (hasDigit) {
                    System.out.printf("Product group: %s%n", sum);
                } else {
                    System.out.println("Product group: 00");
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
