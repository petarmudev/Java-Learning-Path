package L06_ExerciseEncapsulation.Task04_PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pizza
        String pizzaData = scanner.nextLine(); //Pizza {pizzaName} {numberOfToppings}
        String pizzaName = pizzaData.split("\\s+")[1];
        int numberOfToppings = Integer.parseInt(pizzaData.split("\\s+")[2]);

        Pizza pizza = new Pizza(pizzaName, numberOfToppings);

        //dough
        String doughData = scanner.nextLine(); //Dough {flourType} {bakingTechnique} {weightInGrams}
        String flourType = doughData.split("\\s+")[1];
        String bakingTechnique = doughData.split("\\s+")[2];
        double doughWeight = Double.parseDouble(doughData.split("\\s+")[3]);
        Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
        //add dough to the pizza
        pizza.setDough(dough);

        String toppingData = scanner.nextLine();
        while (!toppingData.equals("END")) { //until END receive toppings
            //Topping {toppingType} {weightInGrams}
            String toppingType = toppingData.split("\\s+")[1];
            double toppingWeight = Double.parseDouble(toppingData.split("\\s+")[2]);
            Topping topping = new Topping(toppingType, toppingWeight);
            //add topping to the pizza
            pizza.addTopping(topping);

            toppingData = scanner.nextLine(); //read new topping
        }
        //Print the pizza
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
