package L23_DesignPatterns_MartinPaunov.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    // https://refactoring.guru/design-patterns/prototype

        Register register = new Register();
        //-------------------clone---------------
        Item book = register.getItem("Book"); //Това е "клонинг"(друг адрес в паметта)
        // на този обект в паметта на Map-a: registry. В дебъг се виждат различните адреси

        System.out.println(book.getName()); //Show the original's name

        book.setName("The hobbit"); //Променя името само на клонирания обект, без да
        //променя името на оригиналния обект в регистъра(в Мап-а). Вместо да създава нов обект, променя/клонира оригиналния - полезно

        System.out.println(book.getName());
    }
}
