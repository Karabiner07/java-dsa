package dev.karabiner;

import dev.karabiner.linkedlists.SinglyLinkedListNode;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedListNode head = new SinglyLinkedListNode(10);

        SinglyLinkedListNode second = new SinglyLinkedListNode(20);

        SinglyLinkedListNode third = new SinglyLinkedListNode(30);

        SinglyLinkedListNode fourth = new SinglyLinkedListNode(40);

        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(null);




    }

}