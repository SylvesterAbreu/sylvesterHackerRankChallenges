package net.sylvestertech.java.easy.dataStructures;

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
