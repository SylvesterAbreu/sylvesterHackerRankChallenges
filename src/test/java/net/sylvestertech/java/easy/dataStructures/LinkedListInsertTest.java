package net.sylvestertech.java.easy.dataStructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListInsertTest {

    @Test
    public void insertThreeInTheTail() throws Exception {
        final Node head = LinkedListInsert.addToTheTail(null, 2);
        final Node tail = LinkedListInsert.addToTheTail(head, 3);
        assertEquals(3, tail.next.data);
    }

    @Test
    public void insertValueInTheTailWhenThereAreMoreThanTwoValuesInTheLinkedList() throws Exception {
        final Node second = new Node(3);
        final Node first = new Node(2, second);
        final Node tail = LinkedListInsert.addToTheTail(first, 4);
        assertEquals(4, tail.next.next.data);
    }
}
