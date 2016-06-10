package net.sylvestertech.java.easy.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class LinkedListStructure {

    public static List<Integer> getListOfValues(Node head) {
        List<Integer> list = new ArrayList<>();
        Node currentHead = head;
        while (currentHead != null) {
            list.add(currentHead.data);
            currentHead = currentHead.next;
        }
        return list;
    }

    public static Node insertInTheTail(Node head, int data) {
        return null == head ? new Node(data) : LinkedListInsert.inTheTail(head, data);
    }

    public static Node insertHead(Node head, int data) {
        return new Node(data, head);
    }

    public static Node insertAtGivenPosition(Node head, int data, int position) {
        return head == null ? new Node(data) : LinkedListInsert.valueAtGivenPosition(head, position, data);
    }
}
