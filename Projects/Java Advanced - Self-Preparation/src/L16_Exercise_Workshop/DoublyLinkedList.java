package L16_Exercise_Workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoublyLinkedList {
    //Constants
    public static final int INITIAL_SIZE = 0;

    //Характеристики на Листа
    private Node head;
    private Node tail;

    public int size = INITIAL_SIZE;

    //Функционалности

    public void addFirst(int value) {
        //add element in the start of the List
        //1. Make newNode with only value field
        Node newNode = new Node(value);
        //2.Check if List is empty
        if (isEmpty()) { //empty
            this.head = newNode;
            this.tail = newNode;
        } else { //not empty
            newNode.next = this.head;
            this.head.previous = newNode; //the current new item
            this.head = newNode;
        }
        this.size++;

    }

    public void addLast(int value) {
        //adds an element(Node) at the List's end(tail)
        if (isEmpty()) {
            addFirst(value); //same logic for the first element as the last
        } else {
            Node newNode = new Node(value);
            this.tail.next = newNode;
            newNode.previous = this.tail;
            this.tail = newNode;
            this.size++;
        }
    }

    public int removeFirst() {
        if (isEmpty()) {    //Empty List
            throw new IllegalStateException("Error when trying to remove element from empty list!");

        } else if (this.size == 1) {    //List with only one element(Node)
            int removedElement = this.head.currentValue;
            this.head = this.tail = null;
            this.size--;
            return removedElement;

        } else {    //List larger than 1 Node
            int removedElement = this.head.currentValue;
            this.head = this.head.next; //change tot the new head
            this.head.previous = null;
            this.size--;
            return removedElement;
        }
    }

    public int removeLast() {
        //Removes the last element from the List
        if (isEmpty()) {    //Empty List
            throw new IllegalStateException("Error when trying to remove element from empty list!");

        } else if (this.size == 1) {    //List with only one element(Node)
            int removedElement = this.head.currentValue;
            this.head = this.tail = null;
            this.size--;
            return removedElement;

        } else {    //List with more than 1 element
            int removedElement = this.tail.currentValue;    //get the value
            this.tail = this.tail.previous;     //Change the tail
            this.tail.next = null;      //Remove the next field
            this.size--;
            return removedElement;
        }
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;
        while (currentNode != null) {
            consumer.accept(currentNode.currentValue);
            currentNode = currentNode.next;
        }

    }

    public int[] toArray() {
        //1. Съхраняваме елементите
        List<Integer> resultList = new ArrayList<>();
        forEach(el -> resultList.add(el));
        //2.Преобразуваме листа в масив
        return resultList.stream().mapToInt(e -> e).toArray();

    }

    public int get(int index) {
        //Returns the value of the Node
        //1. Check if index is valid
        checkValidIndex(index);
        int result = 0; //holds the element of the given index
        //2. Optimise the searching algorithm
        if (index < this.size / 2) { //More towards the head
            Node currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            result = currentNode.currentValue; //the given index's value field
        } else {
            Node currentNode = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                currentNode = currentNode.previous;
            }
            result = currentNode.currentValue;
        }
        return result;
    }

    private void checkValidIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("The given index " + index + " is invalid: out of bounds.");
        }
    }

    private boolean isEmpty() {
        return this.size == 0;
    }


}
