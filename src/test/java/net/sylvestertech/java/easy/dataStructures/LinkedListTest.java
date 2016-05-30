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
    public void insertThreeInTheTail() throws Exception {
        final LinkedListStructure linkedListStructure = new LinkedListStructure();
        final Node head = linkedListStructure.insert(null, 2);
        final Node tail = linkedListStructure.insert(head, 3);
        assertEquals(3, tail.next.data);
    }

    @Test
    public void insertValueWhenThereAreMoreThanTwoValuesInTheLinkedList() throws Exception {
        final Node second = new Node(3);
        final Node first = new Node(2, second);
        final LinkedListStructure linkedListStructure = new LinkedListStructure();
        final Node tail = linkedListStructure.insert(first, 4);
        assertEquals(4, tail.next.next.data);
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
        final Node first = new Node(5, null);
        final Node second = new Node(4, first);
        return new Node(3, second);
    }
}
