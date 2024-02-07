package L18_ExerciceGenerics_Task01AndTask02_GenericBox_BoxOfIntegers;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> elements;

    public void add(T element) {
        this.elements.add(element);
    }

    public Box() {
        this.elements = new ArrayList<>();
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T element : this.elements) {
            builder.append(element.getClass().getName() + ": " + element).append("\n");
        }
        return builder.toString();
    }
}
