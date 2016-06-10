package net.sylvestertech.java.easy.dataStructures;

public class LinkedListDelete {

    public static Node nodeAtPosition(Node head, int position) {
        return head == null ? null: deleteFirstNode(head);
    }

    private static Node deleteFirstNode(Node head) {
        head.next = null;
        return head;
    }
}
