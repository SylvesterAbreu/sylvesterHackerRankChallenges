package net.sylvestertech.java.easy.dataStructures;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

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
        return head == null ? new Node(data) : insertNodeInTheTail(head, data);
    }

    @Nullable
    private Node insertNodeInTheTail(Node head, int data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = new Node(data);
                break;
            }
            currentNode = currentNode.next;
        }
        return head;
    }

    public Node insertHead(Node head, int data) {
        return new Node(data, head);
    }
}


