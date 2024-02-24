package L18_ExerciseGenerics_Task07_CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList <T extends Comparable<T>>{
    private List<T> elements;
    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }
    public T remove (int index) {
        return this.elements.remove(index);
    }
    public boolean contains(T element) {
        return this.elements.contains(element);
    }
    public void swap(int firstIndex, int secondIndex) {
        T firstIndexElement = this.elements.get(firstIndex);
        T secondIndexElement = this.elements.get(secondIndex);
        this.elements.set(firstIndex, secondIndexElement);
        this.elements.set(secondIndex, firstIndexElement);

    }
    public int countGreaterThat (T element) {
        int count = 0;
        for (T elementInList : elements) {
            if (elementInList.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
    public T getMax() {
        return this.elements.stream()
                .max((a, b) -> a.compareTo(b))
                .get();
    }
    public T getMin() {
        return this.elements.stream()
                .min((a, b) -> a.compareTo(b))
                .get();
    }
    public void print() {
        this.elements.forEach(System.out::println);
        /*for (T element : elements) {
            System.out.println(element);
        }
         */
    }
    public void sort () {
        this.elements.sort((a, b) -> a.compareTo(b));
    }
}
