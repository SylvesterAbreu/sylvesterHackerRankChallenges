package net.sylvestertech.java.easy.dataStructures;

import org.jetbrains.annotations.Nullable;

class LinkedListInsert {

    public static Node addToTheTail(Node head, int data) {
        return head == null ? new Node(data) : insertNodeInTheTail(head, data);
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
