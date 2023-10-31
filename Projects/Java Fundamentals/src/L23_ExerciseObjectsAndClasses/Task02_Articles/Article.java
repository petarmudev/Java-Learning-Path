package L23_ExerciseObjectsAndClasses.Task02_Articles;

public class Article {
    private String title;
    private String content;
    private String author;


    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // методи:
    //1. Edit
    public void edit(String newContent) {
        this.content = newContent;

    }

    //2.Change author -> променя автора
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    //3. rename
    public void rename(String newTitle) {
        this.title = newTitle;
    }

    //getters -> методи, чрез които взимаме стойността на полето
    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    //Override toString:
    @Override
    public String toString(){
        return this.title + " - " + this.content + ": " + this.author;
    }

}
