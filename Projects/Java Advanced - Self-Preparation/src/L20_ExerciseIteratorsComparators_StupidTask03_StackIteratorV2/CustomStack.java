package L20_ExerciseIteratorsComparators_StupidTask03_StackIteratorV2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CustomStack<T> implements Iterable<T> {
    private List<T> collection;

    public CustomStack(T... data) {
        collection = new ArrayList<>();
        for (T item : data) {
            collection.add(item);
        }
    }

    public void push(T... elements) {
        for (T element : elements) {
            collection.add(element);
        }
    }

    public T pop() {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("No elements");
        } else {
            T element = collection.get(collection.size() - 1);
            collection.remove(collection.size() - 1);
            return element;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = collection.size() - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public T next() {
                return collection.get(currentIndex--);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {

        for (int i = this.collection.size() -1; i >= 0; i--) {
            action.accept(collection.get(i));
        }

    }
}
