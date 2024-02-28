package L06_ExerciseEncapsulation.Task04_PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") ||
                toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight > 0 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", toppingType ));
        }
    }

    public double calculateCalories() {
        double toppingCoefficient = 0;
        switch (this.toppingType) {
            case "Meat":
                toppingCoefficient = 1.2;
                break;
            case "Veggies":
                toppingCoefficient = 0.8;
                break;
            case "Cheese":
                toppingCoefficient = 1.1;
                break;
            case "Sauce":
                toppingCoefficient = 0.9;
                break;
        }
        return (2 * weight) * toppingCoefficient;
    }
}
