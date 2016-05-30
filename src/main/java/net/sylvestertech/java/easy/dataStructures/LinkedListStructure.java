package net.sylvestertech.java.easy.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class LinkedListStructure {

    private final List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void print(Node head) {
        Node currentHead = head;
        while (currentHead != null) {
            list.add(currentHead.data);
            currentHead = currentHead.next;
        }
    }

    public Node insert(Node head, int data) {
        final Node node = new Node(data);
        if (head == null) {
            return node;
        }
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = node;
                break;
            }
            currentNode = currentNode.next;
        }
        return head;
    }
}

class Node {
    int data;
    Node next;

    Node(final int data, final Node head) {
        this.data = data;
        next = head;
    }

    Node(final int data) {
        this(data, null);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Node)) {
            return false;
        }
        return data == ((Node) obj).data;
    }
}
