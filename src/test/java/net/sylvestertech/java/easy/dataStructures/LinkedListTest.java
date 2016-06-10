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
        assertEquals(expectedNode, LinkedListStructure.insertInTheTail(null, 2));
    }

    @Test
    public void insertNewValueInTheHeadOfList() throws Exception {
        final Node head = LinkedListStructure.insertHead(new Node(4), 5);
        assertEquals(5, head.data);
    }

    @Test
    public void insertNodeInTheFirstPosition() throws Exception {
        final Node nodeAtPositionZero = new Node(0);
        assertEquals(nodeAtPositionZero, LinkedListStructure.insertAtGivenPosition(null, 0, 0));
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
