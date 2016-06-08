package net.sylvestertech.java.easy.dataStructures;

import org.jetbrains.annotations.Nullable;

class LinkedListInsert {

    public static Node inTheTail(Node head, int data) {
        return head == null ? new Node(data) : insertNodeInTheTail(head, data);
    }

    public static Node valueAtGivenPosition(Node head, int position, int data) {
        final Node newNode = new Node(data);
        int currentPosition = 0;
        Node lastNode = null;
        Node currentNode = head;
        while (currentPosition <= position && currentNode != null) {
            if (position == 0 && currentPosition == 0) {
                newNode.next = head;
                return newNode;
            } else if (currentPosition == position - 1) {
                Node nextNode = currentNode.next;
                newNode.next = nextNode;
                currentNode.next = newNode;
                return head;
            }
            lastNode = currentNode;
            currentNode = currentNode.next;
            currentPosition++;
        }
        if (position > currentPosition && lastNode != null) {
            lastNode.next = newNode;
        }
        return head;
    }

    @Nullable
    private static Node insertNodeInTheTail(Node head, int data) {
        final Node currentNode = getLastNode(head);
        currentNode.next = new Node(data);
        return head;
    }

    @Nullable
    private static Node getLastNode(Node head) {
        Node node = head;
        while (node != null && node.next!=null) {
            node = node.next;
        }
        return node;
    }
}
