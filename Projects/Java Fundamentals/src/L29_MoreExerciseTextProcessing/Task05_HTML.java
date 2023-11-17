package L29_MoreExerciseTextProcessing;

import java.util.Scanner;

public class Task05_HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleTitle = scanner.nextLine();
        String articleContent = scanner.nextLine();

        System.out.printf("<h1>%n    %s%n</h1>%n<article>%n    %s%n</article>%n", articleTitle, articleContent);

        while (true) {
            String comment = scanner.nextLine();
            if (comment.equals("end of comments")) {
                break;
            }
            System.out.printf("<div>%n    %s%n</div>%n", comment);
        }
    }
}
