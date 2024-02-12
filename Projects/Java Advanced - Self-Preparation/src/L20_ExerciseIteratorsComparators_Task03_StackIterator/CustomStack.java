package L20_ExerciseIteratorsComparators_Task03_StackIterator;


import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class CustomStack implements Iterable<Integer> {
    private List<Integer> data;
    private int endIndex;

    public int getSize() {
        return endIndex;
    }

    public CustomStack(List<Integer> data) {
        this.data = data;
        if (this.data.isEmpty()) {
            this.endIndex = 0;
        } else {
            this.endIndex = data.size() - 1;
        }
    }

    public void push(List<Integer> data) {
        this.data.addAll(data);
    }

    public void pop() {
        if (endIndex >= 0) {
            endIndex--;
        } else {
            System.out.println("No elements");
            return;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return endIndex > 0;
            }

            @Override
            public Integer next() {
                return endIndex--;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {

        for (int i = endIndex; i >= 0; i--) {
            action.accept(data.get(i));
        }

    }
}