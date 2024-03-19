package L08_Exercise_Inheritance.Task06_Animals.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("Beast!")) {
            try {
                String[] info = scanner.nextLine().split("\\s+");
                String name = info[0];
                int age = Integer.parseInt(info[1]);
                String gender = info[2];

                if (command.equals("Dog")) {
                    Dog dog = new Dog(name, age, gender);
                    System.out.printf("%s%n", dog);
                } else if (command.equals("Frog")) {
                    Frog frog = new Frog(name, age, gender);
                    System.out.printf("%s%n", frog);
                } else if (command.equals("Cat")) {
                    Cat cat = new Cat(name, age, gender);
                    System.out.printf("%s%n", cat);
                } else if (command.equals("Kitten")) {
                    Kitten kitten = new Kitten(name, age);
                    System.out.printf("%s%n", kitten);
                } else if (command.equals("Tomcat")) {
                    Tomcat tomcat = new Tomcat(name, age);
                    System.out.printf("%s%n", tomcat);
                } else {
                    continue;
                }
            } catch (IllegalArgumentException exception) {
                System.out.printf("%s%n", exception.getMessage());
            }
            command = scanner.nextLine();
        }
    }
}