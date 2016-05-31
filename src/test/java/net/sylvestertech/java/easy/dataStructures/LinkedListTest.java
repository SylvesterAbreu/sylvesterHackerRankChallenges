package net.sylvestertech.java.easy.dataStructures;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void copyElementsFromLinkedListToAnArrayList() throws Exception {
        final LinkedListStructure linkedListStructure = new LinkedListStructure();
        linkedListStructure.print(getList());
        assertEquals(expectedList(), linkedListStructure.getList());
    }

    @Test
    public void whenInsertingValueInNullHeadThenReturnHeadWithValuePassed() throws Exception {
        final Node expectedNode = new Node(2);
        final LinkedListStructure linkedListStructure = new LinkedListStructure();
        assertEquals(expectedNode, linkedListStructure.insert(null, 2));
    }

    @Test
    public void insertNewValueAsHead() throws Exception {
        final LinkedListStructure linkedListStructure = new LinkedListStructure();
        final Node head = linkedListStructure.insertHead(new Node(4), 5);
        assertEquals(5, head.data);
    }

    @Test
    public void onAnEmptyListTheValuePassedBecomesTheHead() throws Exception {
        final LinkedListStructure linkedListStructure = new LinkedListStructure();
        final Node head = linkedListStructure.insertHead(null, 9);
        assertEquals(9, head.data);
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
