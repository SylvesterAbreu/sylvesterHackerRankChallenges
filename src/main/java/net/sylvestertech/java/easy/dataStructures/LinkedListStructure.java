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

    public static Node insertAt(final Node head, final int data, final int position) {
        final Node newNode = new Node(data);
        if (null == head) {
            return newNode;
        }
        int currentPosition = 0;
        Node currentNode = head;
        while (currentPosition <= position) {
            if (position == 0 && currentPosition == 0) {
                newNode.next = head;
                return newNode;
            }
            if (currentPosition == position -1) {
                Node nextNode = currentNode.next;
                newNode.next = nextNode;
                currentNode.next = newNode;
                return head;
            }
            currentNode = currentNode.next;
            currentPosition++;
        }
        return head;
        }
    }
