package net.sylvestertech.java.easy.dataStructures;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void copyElementsFromLinkedListToAnArrayList() {
        final LinkedListStructure linkedListStructure = new LinkedListStructure();
        linkedListStructure.print(getList());
        assertEquals(expectedList(), linkedListStructure.getList());
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
