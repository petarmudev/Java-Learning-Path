package L06_ExerciseEncapsulation.Task04_PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        //2 * weight * flourType * bakingTechnique
        double flourTypeCoefficient = 0;
        if (flourType.equals("White")) {
            flourTypeCoefficient = 1.5;
        } else if (flourType.equals("Wholegrain")) {
            flourTypeCoefficient = 1.0;
        }
        double bakingTechniqueCoefficient = 0;
        switch (bakingTechnique) {
            case "Crispy":
                bakingTechniqueCoefficient = 0.9;
                break;
            case "Chewy":
                bakingTechniqueCoefficient = 1.1;
                break;
            case "Homemade":
                bakingTechniqueCoefficient = 1.0;
                break;
        }
        return (2 * this.weight) * flourTypeCoefficient * bakingTechniqueCoefficient;
    }
}
