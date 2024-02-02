package L14_ExerciseDefiningClasses.Task05_CarSalesman;

public class Engine {
    private String model;
    private int power;
    private  int displacement;
    private String efficiency;

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }




}
