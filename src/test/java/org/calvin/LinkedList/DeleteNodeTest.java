/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.__Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteNodeTest {
    private static final int[] vals = {1,2,3};

    private DeleteNode fixture;
    private ListNode listBase;

    @Before
    public void setUp() {
        fixture = new DeleteNode();
        listBase = AssortedMethods.createLinkedListFromArray(vals);
    }

    @Test
    public void shouldDeleteNode() {
        assertEquals(listBase.getNext().getVal(), 2);
        assertEquals("1->2->3", listBase.printForward());
        fixture.deleteNode(listBase.getNext());
        assertEquals("1->3", listBase.printForward());
        assertEquals(listBase.getNext().getVal(), 3);
    }

    @Test
    public void shouldNotDeleteSingleElement() {
        fixture.deleteNode(listBase.getNext());
        assertEquals("1->3", listBase.printForward());
    }
}
