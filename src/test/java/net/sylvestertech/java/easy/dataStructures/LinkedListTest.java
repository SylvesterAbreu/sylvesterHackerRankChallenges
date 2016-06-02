package net.sylvestertech.java.easy.dataStructures;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void retrieveValuesFromLinkedList() throws Exception {
        assertEquals(expectedList(), LinkedListStructure.getListOfValues(getList()));
    }

    @Test
    public void returnNewHeadWhenListIsNull() throws Exception {
        final Node expectedNode = new Node(2);
        assertEquals(expectedNode, LinkedListStructure.insert(null, 2));
    }

    @Test
    public void insertNewValueInTheHeadOfList() throws Exception {
        final Node head = LinkedListStructure.insertHead(new Node(4), 5);
        assertEquals(5, head.data);
    }

    @Test
    public void returnListWithSingleNodeWhenAskedToAddValueToNullList() throws Exception {
        assertEquals(LinkedListStructure.insertAt(null, 9, 8), new Node(9));
    }

    @Test
    public void returnListWithPassedValueGivenPositionZero() throws Exception {
        final Node second = new Node(5);
        final Node first = new Node(4, second);
        final Node expectedList = getList();
        final Node actualList = LinkedListStructure.insertAt(first, 3, 0);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void returnListWithPassedValueGivenPositionThree() throws Exception {
        final Node expectedList = getList().next.next = new Node(6);
        assertEquals(expectedList, LinkedListStructure.insertAt(getList(), 6, 3));
    }

    @NotNull
    private ArrayList<Integer> expectedList() {
        final ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        return list;
    }

    private Node getList() {
        final Node first = new Node(5);
        final Node second = new Node(4, first);
        return new Node(3, second);
    }
}
