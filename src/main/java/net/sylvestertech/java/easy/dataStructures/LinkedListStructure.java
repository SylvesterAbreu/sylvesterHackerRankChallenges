package net.sylvestertech.java.easy.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class LinkedListStructure {

    private final List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void print(Node head) {
        printHead(head);
    }

    private void printHead(Node head) {
        Node currentHead = head;
        while (currentHead != null) {
            list.add(currentHead.data);
            currentHead = currentHead.next;
        }
    }
}

class Node {
    final int data;
    final Node next;

    Node(final int data, final Node head) {
        this.data = data;
        next = head;
    }
}
