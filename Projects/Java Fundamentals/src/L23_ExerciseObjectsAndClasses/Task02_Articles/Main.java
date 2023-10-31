package L23_ExerciseObjectsAndClasses.Task02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleData = scanner.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        //статия -> title, content, author
        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            //1. command = Edit: {new content}.split(": ") -> ["Edit", "{new content}"]
            //2. command = ChangeAuthor: {new author} ...
            //3. command = Rename: {new title}...
            String[] commandParts = command.split(": ");
            String commandName = commandParts[0];
            String commandParameter = commandParts[1];
            switch (commandName) {
                case "Edit":
                    //commandParameter = "{new content}"
                    article.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    //сменя текущото заглавие с това от командата:
                    article.rename(commandParameter);
                    break;
                default:
                    break;
            }
        }
       // System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
       // System.out.println();
        System.out.println(article.toString());
    }
}
