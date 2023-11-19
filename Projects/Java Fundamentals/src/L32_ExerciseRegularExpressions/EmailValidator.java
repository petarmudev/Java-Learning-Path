package L32_ExerciseRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {

        String pattern = "(?<username>[A-Za-z0-9]+[\\-\\.\\_]?[A-Za-z0-9]+)@(?<host>[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+)+)";


        String[] emails = {
                "info@softuni-bulgaria.org",
                "kiki@hotmail.co.uk",
                "no-reply@github.com",
                "s.peterson@mail.uu.net",
                "info-bg@software-university.software.academy",
                "--123@gmail.com",
                "…@mail.bg",
                ".info@info.info",
                "_steve@yahoo.cn",
                "mike@helloworld",
                "mike@.unknown.soft.",
                "s.johnson@invalid-"
        };

        Pattern emailPattern = Pattern.compile(pattern);

        for (String email : emails) {
            Matcher matcher = emailPattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email.");
            } else {
                continue;
            }
        }
        for (String email : emails) {
            Matcher matcher = emailPattern.matcher(email);
            if (matcher.matches()) {
                continue;
            } else {
                System.out.println(email + " is an invalid email.");
            }
        }
    }
}
