package L16_Exercise_Workshop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addLast(6);
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        linkedList.forEach(el -> System.out.println(el));
        int[] array = linkedList.toArray();
        System.out.println(Arrays.toString(array));

    }
}
