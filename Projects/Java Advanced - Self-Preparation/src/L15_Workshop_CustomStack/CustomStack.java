package L15_Workshop_CustomStack;

import java.util.function.Consumer;

public class CustomStack {
    //Constants константи
    public static final int INITIAL_CAPACITY = 4; //Конвенция за константи(главните букви)!
    public static final int INITIAL_SIZE = 0;
    public static final int SHRING_THRESHOLD = 4;
    private int[] data; //holds our elements in SmartArray
    private int size; //holds the SmartArray's size
    private int capacity; //holds the SmartArray's (size+buffer) capacity

    public CustomStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.size = INITIAL_SIZE;
        this.capacity = INITIAL_CAPACITY;
    }

    public void push(int element) {
        //push -> adds element at the end
        this.ensureCapacity();
        this.data[this.size] = element;
        this.size++;
    }

    public int pop() {
        //pop -> removes and returns the last element
        this.size--;
        if (this.capacity / this.size > SHRING_THRESHOLD) {  //Check for too big(unused) capacity
            this.shrink();
        }
        int itemToPop = this.data[size];
        this.data[size] = 0; //delete if from the array
        return itemToPop; //return the item
    }

    public int peek() {
        //peek -> returns the last element
        return this.data[size - 1];
    }

    private void ensureCapacity() {
        if (this.size == this.capacity) {
            this.resize();
        }
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


    public void ensureStackNotEmpty() {
        if (this.size == 0) {
            throw new IndexOutOfBoundsException("Out CustomStack is empty");
        }
    }

    private void shrink() {
        this.capacity = this.capacity / 2;
        int[] temp = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    //todo forEach()
    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }
}
