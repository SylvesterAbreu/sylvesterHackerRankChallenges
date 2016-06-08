package net.sylvestertech.java.easy.dataStructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListInsertTest {

    @Test
    public void insertThreeInTheTail() throws Exception {
        final Node head = LinkedListInsert.inTheTail(null, 2);
        final Node tail = LinkedListInsert.inTheTail(head, 3);
        assertEquals(3, tail.next.data);
    }

    @Test
    public void insertValueInTheTailWhenThereAreMoreThanTwoValuesInTheLinkedList() throws Exception {
        final Node second = new Node(3);
        final Node first = new Node(2, second);
        final Node tail = LinkedListInsert.inTheTail(first, 4);
        assertEquals(4, tail.next.next.data);
    }

    @Test
    public void returnListWithSingleNodeWhenAskedToAddValueToNullList() throws Exception {
        assertEquals(LinkedListStructure.insertAtGivenPosition(null, 9, 8), new Node(9));
    }

    @Test
    public void returnListWithPassedValueGivenPositionZero() throws Exception {
        final Node second = new Node(5);
        final Node first = new Node(4, second);
        final Node expectedList = getList();
        final Node actualList = LinkedListStructure.insertAtGivenPosition(first, 3, 0);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void returnListWithPassedValueGivenPositionThree() throws Exception {
        final Node expectedList = getList();
        expectedList.next.next.next = new Node(6);
        assertEquals(expectedList, LinkedListStructure.insertAtGivenPosition(getList(), 6, 3));
    }

    @Test
    public void returnListWhenPositionGivenIsHigherThanItsLenght() throws Exception {
        final Node expectedList = getList();
        expectedList.next.next.next = new Node(3);
        final Node actual = LinkedListStructure.insertAtGivenPosition(getList(), 3, 10);
        assertEquals(expectedList, actual);
    }

    private Node getList() {
        final Node first = new Node(5);
        final Node second = new Node(4, first);
        return new Node(3, second);
    }
}
