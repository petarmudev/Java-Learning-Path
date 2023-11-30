package Fund_Exams_01.ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Решено на L35_ExamPreparation2 !!!

        String foodInfo = scanner.nextLine();
        String regex = "(#|\\|)(?<item>[A-Za-z]+\\s?[A-Za-z]+)\\1(?<date>[0-9]{2}/[0-9]{2}/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(foodInfo);

        int totalCaloriesSum = getTotalCalories(pattern, foodInfo);
        System.out.printf("You have food to last you for: %d days!%n", totalCaloriesSum / 2000);

        while (matcher.find()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", matcher.group("item"), matcher.group("date"), matcher.group("calories"));
        }

    }

    private static int getTotalCalories(Pattern pattern, String foodInfo) {
        Matcher matcher = pattern.matcher(foodInfo);
        int totalCaloriesSum = 0;
        while (matcher.find()) {
            totalCaloriesSum += Integer.parseInt(matcher.group("calories"));
        }
        return totalCaloriesSum;
    }
}
