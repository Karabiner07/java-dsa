package dev.karabiner.linkedlists;


public class SinglyLinkedListUtil {

    public static void display(SinglyLinkedListNode list) {
        SinglyLinkedListNode current = list;

        while (current != null) {
            System.out.print(current.getData() + " --> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
