package L06_ExerciseEncapsulation.Task04_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setToppings(int toppingsCount) {
        if (toppingsCount < 0 || toppingsCount > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        } else {
            this.toppings = new ArrayList<>(toppingsCount);
        }
    }

    private void setName(String name) {
        if (!name.trim().isEmpty() && name.length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        //doughCal + toppingsCal
        return this.dough.calculateCalories() + this.toppings.stream().mapToDouble(t -> t.calculateCalories()).sum();
    }

}
