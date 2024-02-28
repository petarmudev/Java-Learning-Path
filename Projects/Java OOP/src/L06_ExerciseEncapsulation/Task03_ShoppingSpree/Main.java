package L06_ExerciseEncapsulation.Task03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] peopleInput = scanner.nextLine().split(";");
        String[] productsInput = scanner.nextLine().split(";");
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        addPeople(peopleInput, people);
        addProducts(productsInput, products);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            String personName = input.split("\\s+")[0];
            String productName = input.split("\\s+")[1];
            Person person = findPerson(people, personName);
            Product product = findProduct(products, productName);

            if (person != null && product != null) {
                try {
                    person.buyProduct(product);
                    System.out.printf("%s bought %s%n", personName, productName);
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
        for (Person person : people) {
            person.printBag();
        }
    }

    private static Product findProduct(List<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    private static Person findPerson(List<Person> people, String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    private static void addProducts(String[] productsInput, List<Product> products) {
        for (int i = 0; i < productsInput.length; i++) {
            String input = productsInput[i];
            String name = input.split("=")[0];
            double cost = Double.parseDouble(input.split("=")[1]);

            Product productToAdd = new Product(name, cost);
            products.add(productToAdd);
        }
    }

    private static void addPeople(String[] peopleInput, List<Person> people) {
        for (int i = 0; i < peopleInput.length; i++) {
            String input = peopleInput[i];
            String name = input.split("=")[0];
            int money = Integer.parseInt(input.split("=")[1]);

            Person person = new Person(name, money);
            people.add(person);
        }
    }
}
