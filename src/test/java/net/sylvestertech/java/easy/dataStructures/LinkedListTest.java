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

    /*
You’re given the pointer to the head node of a linked list and the position of a node to delete. Delete the node at the given position and return the head node. A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The list may become empty after you delete the node.

Input Format
You have to complete the Node* Delete(Node* head, int position) method which takes two arguments - the head of the linked list and the position of the node to delete. You should NOT read any input from stdin/console. position will always be at least 0 and less than the number of the elements in the list.

Output Format
Delete the node at the given position and return the head of the updated linked list. Do NOT print anything to stdout/console.

Sample Input

1 --> 2 --> 3 --> NULL, position = 0
1 --> NULL , position = 0

Sample Output

2 --> 3 --> NULL
NULL
Explanation
1. 0th position is removed, 1 is deleted from the list.
2. Again 0th position is deleted and we are left with empty list.

    */


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
