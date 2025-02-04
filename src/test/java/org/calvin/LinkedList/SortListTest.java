/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.Assert.assertEquals;

import org.calvin.__Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class SortListTest {
    private SortList fixture;
    @Before
    public void setUp() throws Exception {
        fixture = new SortList();
    }

    @Test
    public void sortList() throws Exception {
        int[] vals = {1,7,2,4,3,8,9,6};
        ListNode list = AssortedMethods.createLinkedListFromArray(vals);
        ListNode actual = fixture.sortList(list);
        int[] expected = {1,2,3,4,6,7,8};
        for (int i : expected) {
            assertEquals(i, actual.getVal());
            actual = actual.getNext();
        }
    }

}
