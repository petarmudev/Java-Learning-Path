package L31_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Andy: 123";
        String pattern = "([A-Z][a-z]+): (?<number>\\d+)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);
        System.out.println(matcher.find()); // true
        System.out.println(matcher.group()); // Andy: 123
        System.out.println(matcher.group(0)); // Andy: 123
        System.out.println(matcher.group(1)); // Andy
        System.out.println(matcher.group(2)); // 123
        System.out.println(matcher.group("number")); // 123

        String regex2 = "[A-Za-z]+";
        String string = "Hello Java";
        Pattern pattern2 = Pattern.compile(regex2);
       // Matcher matcher = pattern2.matcher(string);
        String res = matcher.replaceAll("hi"); // hi hi
        String res2 = matcher.replaceFirst("hi"); // hi Java
        System.out.println(res);
        System.out.println(res2);
    }
}
