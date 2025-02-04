/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.Assert.assertEquals;

import org.calvin.__Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class Merge2SortedListTest {
    Merge2SortedList fixture;

    @Before
    public void setUp() {
        fixture = new Merge2SortedList();
    }

    @Test
    public void shouldFirstListComeFirst() {
        int[] vals = {1,2,3,4};
        ListNode<Integer> list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {14, 15, 16};
        ListNode<Integer> list2 = AssortedMethods.createLinkedListFromArray(vals2);

        ListNode<Integer> actual = fixture.mergeTwoLists(list1, list2);
        int[] expectedVals = {1,2,3,4,14,15,16};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondListComeFirst() {
        int[] vals = {14,15,16};
        ListNode<Integer> list1 = AssortedMethods.createLinkedListFromArray(vals);
        int[] vals2 = {1,2,3,4};
        ListNode<Integer> list2 = AssortedMethods.createLinkedListFromArray(vals2);

        ListNode<Integer> actual = fixture.mergeTwoLists(list1, list2);
        int[] expectedVals = {1,2,3,4,14,15,16};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMergeOneList() {
        int[] vals1 = {14, 15, 16};
        ListNode<Integer> list1 = AssortedMethods.createLinkedListFromArray(vals1);

        int[] expectedVals = {14,15,16};
        ListNode<Integer> expected = AssortedMethods.createLinkedListFromArray(expectedVals);
        ListNode<Integer> actual = fixture.mergeTwoLists(null, list1);

        assertEquals(expected, actual);

        actual = fixture.mergeTwoLists(list1, null);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMergeNullLists() {
        ListNode<Integer> actual = fixture.mergeTwoLists(null,null);
        assertEquals(null, actual);
    }

}
