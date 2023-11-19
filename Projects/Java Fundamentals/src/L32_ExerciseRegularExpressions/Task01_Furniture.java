package L32_ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        double totalSum = 0;
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        while (true) {
            String input = scanner.nextLine();
            //Valid input format: ">>{furniture name}<<{price}!{quantity}"
            if (input.equals("Purchase")) {
                break;
            }
            //Проверка дали входните данни отговарят на шаблона
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                //Валидни входни данни
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                totalSum += price * quantity;


            }
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}
