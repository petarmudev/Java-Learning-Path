package L15_Workshop.SmartArray;

import java.util.function.Consumer;

public class SmartArray {
    //Constants константи
    public static final int INITIAL_CAPACITY = 4; //Конвенция за константи(главните букви)!
    public static final int INITIAL_SIZE = 0;
    public static final int SHRING_THRESHOLD = 4;
    private int[] data; //holds our elements in SmartArray
    private int size; //holds the SmartArray's size
    private int capacity; //holds the SmartArray's (size+buffer) capacity

    public SmartArray() {
        this.size = INITIAL_SIZE;
        this.capacity = INITIAL_CAPACITY; //constant
        this.data = new int[INITIAL_CAPACITY]; //constant начална
    }

    //add element
    public void add(int element) {
        ensureCapacity();
        this.data[size] = element; //size==first free index
        size++;
    }

    //add element at given index
    public void add(int index, int element) {
        this.checkIndex(index);
        ensureCapacity();
        this.size++;
        this.shiftRight(index); //free space for the item
        this.data[index] = element; //add the element on the index
    }

    public int size() {
        return this.size;
    }

    private void resize() {
        //добавяме капацитет към нашия масив
        this.capacity = this.capacity * 2;
        int[] tempData = new int[capacity];
        for (int i = 0; i < this.size; i++) {
            tempData[i] = data[i];
        }
        this.data = tempData;
    }

    public int get(int index) {
        //Check the index
        this.checkIndex(index);
        return this.data[index];
    }

    public int remove(int index) {
        int numberToRemove = this.get(index);
        this.shiftLeft(index);
        size--;
        if (this.capacity / this.size > SHRING_THRESHOLD) {  //Check for too big(unused) capacity
            this.shrink();
        }
        return numberToRemove;
    }

    private void shrink() {
        this.capacity = this.capacity / 2;
        int[] temp = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    private void shiftLeft(int index) {
        for (int i = index + 1; i < this.size; i++) {
            this.data[i - 1] = this.data[i];
        }
        this.data[size - 1] = 0; //трием последния индекс, за да не стои в дебъгера. Но не е наложително
    }

    private void shiftRight(int index) {
        for (int i = this.size - 1; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
    }

    private void checkIndex(int index) {
        //Check the index in range of size
        if (index >= this.size || index < 0) {
            String errorMessage = String.format("Index %d is out of bound for our SmartArray", index);
            throw new IndexOutOfBoundsException(errorMessage);
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    private void ensureCapacity() {
        if (this.size == this.capacity) {
            this.resize();
        }
    }
    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }
}
