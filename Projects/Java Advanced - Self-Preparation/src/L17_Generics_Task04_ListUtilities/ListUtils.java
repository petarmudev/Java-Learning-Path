package L17_Generics_Task04_ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtils {
    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return Collections.max(list);
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        //Или това...:
        T currentMin = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            T currentElement = list.get(i);
            if (currentMin.compareTo(currentElement) > 0) {
                currentMin = currentElement;
            }
        }
        return currentMin; //...до тук. Или долното ->
        //-> return Collections.min(list);
    }
}
