package L06_ExerciseEncapsulation.Task03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {
            this.products.add(product);
            this.money -= product.getCost();
        } else {
            String message = this.name + " can't afford " + product.getName();
            throw new IllegalArgumentException(message);
        }
    }

    public String getName() {
        return this.name;
    }


    public void printBag() {
        if (products.isEmpty()) {
            System.out.println(name + " - Nothing bought");
        } else {
            System.out.print(name + " - ");
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.print(product.getName());
                if (i < products.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
