package L14_ExerciseDefiningClasses.Task05_CarSalesman;

public class Car {
    //model
    private String model;
    //engine
    private Engine engine;
    //weight
    private int weight;
    //color
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override

    public String toString () {
        StringBuilder builder = new StringBuilder();
        /* {CarModel}:
            {EngineModel}:
            Power: {EnginePower}
            Displacement: {EngineDisplacement}
            Efficiency: {EngineEfficiency}
            Weight: {CarWeight}
            Color: {CarColor}   */
        builder.append(this.model).append(":").append("\n");
        builder.append(this.engine.getModel()).append(":").append("\n");
        builder.append("Power: ").append(this.engine.getPower()).append("\n");

        //Optional check
        builder.append("Displacement: ");
        if (this.engine.getDisplacement()== 0) {
            builder.append("n/a").append("\n");
        } else {
            builder.append(this.engine.getDisplacement()).append("\n");
        }

        builder.append("Efficiency: ");
        if (this.engine.getEfficiency()== null) {
            builder.append("n/a").append("\n");
        } else {
            builder.append(this.engine.getEfficiency()).append("\n");
        }

        builder.append("Weight: ");
        if (this.weight == 0) {
            builder.append("n/a").append("\n");
        } else {
            builder.append(this.weight).append("\n");
        }

        builder.append("Color: ");
        if (this.color == null) {
            builder.append("n/a").append("\n");
        } else {
            builder.append(this.color).append("\n");
        }
        return builder.toString();
    }
}
