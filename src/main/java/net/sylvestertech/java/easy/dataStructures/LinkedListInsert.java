package net.sylvestertech.java.easy.dataStructures;

import org.jetbrains.annotations.Nullable;

class LinkedListInsert {

    public static Node addToTheTail(Node head, int data) {
        return head == null ? new Node(data) : insertNodeInTheTail(head, data);
    }

    @Nullable
    private static Node insertNodeInTheTail(Node head, int data) {
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
}
