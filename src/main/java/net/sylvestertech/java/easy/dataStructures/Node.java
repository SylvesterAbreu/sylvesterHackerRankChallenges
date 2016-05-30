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
        if (!(obj instanceof Node) || obj == null) {
            return false;
        }

        if (next == null && ((Node) obj).next == null && data == ((Node) obj).data) {
            return true;
        } else if (next == null && ((Node) obj).next != next) {
            return false;
        } else if (next.equals(((Node) obj).next) && data == ((Node) obj).data){
            return true;
        }
        return false;
    }
}
