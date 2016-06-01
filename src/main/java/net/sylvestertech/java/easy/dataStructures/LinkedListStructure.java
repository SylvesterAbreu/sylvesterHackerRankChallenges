package net.sylvestertech.java.easy.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class LinkedListStructure {

    public static List<Integer> getListOfValues(Node head) {
        final List<Integer> list = new ArrayList<>();
        Node currentHead = head;
        while (currentHead != null) {
            list.add(currentHead.data);
            currentHead = currentHead.next;
        }
        return list;
    }

    public static Node insert(Node head, int data) {
        return head == null ? new Node(data) : LinkedListInsert.addToTheTail(head, data);
    }

    public static Node insertHead(Node head, int data) {
        return new Node(data, head);
    }
}


