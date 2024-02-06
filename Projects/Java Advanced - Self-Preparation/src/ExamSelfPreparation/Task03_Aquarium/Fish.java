package ExamSelfPreparation.Task03_Aquarium;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Fish {
    private String name;
    private String color;
    private int fins;

    public Fish(String name, String color, int fins) {
        this.name = name;
        this.color = color;
        this.fins = fins;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getFins() {
        return fins;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Fish: ").append(this.name).append("\n");
        builder.append("Color: ").append(this.color).append("\n"); //.append(System.lineSeparator());
        builder.append("Number of fins: ").append(this.fins);
        return builder.toString();
    }
    /*
        • verride toString() method in the format:
"Fish: {name}
Color: {color}
Number of fins: {fins}"
     */
}
