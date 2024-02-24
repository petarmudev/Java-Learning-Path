package L20_ExerciseIteratorsComparators_Task01_02_ListyIterator_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator implements Iterable<ListyIterator> {
    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        if (data.isEmpty()) {
            this.index = -1;
        } else {
            this.index = 0;
        }
    }

    public boolean move() {
        if (this.index > -1 && this.index < this.data.size() - 1) {
            this.index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if (this.index < this.data.size() - 1) {
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println(this.data.get(this.index));

    }
    public void printAll() {
        forEach(e -> System.out.print(e + " "));
    }

    @Override
    public Iterator<ListyIterator> iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return index < data.size() - 1;
            }

            @Override
            public Object next() {
                return data.get(index++);
            }
        };
    }

    @Override
    public void forEach(Consumer action) {

        for (String input : data) {
            action.accept(input);
        }
    }
}
