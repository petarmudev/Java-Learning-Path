package L18_ExerciceGenerics_AllInOneTasks_GenericBox_BoxOfIntegers;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
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

    public void swap(int firstIndex, int secondIndex) {
        T firstIndexElement = this.elements.get(firstIndex);
        T secondIndexElement = this.elements.get(secondIndex);
        this.elements.set(firstIndex, secondIndexElement);
        this.elements.set(secondIndex, firstIndexElement);

    }
    //count elements bigger than the given
    public int countGreaterThat (T element) {
        int count = 0;
        for (T elementInList : elements) {
            if (elementInList.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}
