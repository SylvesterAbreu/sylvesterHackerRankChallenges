package net.sylvestertech.java.easy.dataStructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListDeleteTest {


    /*

        You’re given the pointer to the head node of a linked list and the position of a node to nodeAtPosition. Delete the node at the given position and return the head node. A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The list may become empty after you nodeAtPosition the node.

        Input Format
        You have to complete the Node* Delete(Node* head, int position) method which takes two arguments - the head of the linked list and the position of the node to nodeAtPosition. You should NOT read any input from stdin/console. position will always be at least 0 and less than the number of the elements in the list.

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

    @Test
    public void returnEmptyListWhenHeadIsNull() throws Exception {
        assertEquals(null, LinkedListDelete.nodeAtPosition(null, 8));
    }

    @Test
    public void returnHeadWhenSecondPositionIsDeleted() throws Exception {
        final Node secondNode = new Node(1);
        final Node firstNode = new Node(0);
        firstNode.next = secondNode;
        assertEquals(new Node(0), LinkedListDelete.nodeAtPosition(firstNode, 1));
    }
}
