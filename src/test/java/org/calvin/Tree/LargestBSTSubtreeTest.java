/*
 * Copyright Calvin Lee Since 2018.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.__Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class LargestBSTSubtreeTest {
    private LargestBSTSubtree fixture;

    @Before
    public void setUp() {
        fixture = new LargestBSTSubtree();
    }

    @Test public void largestBSTSubtree() throws Exception {
        int[] input = {111,2,123,777,123,8,123,10};
        TreeNode root = AssortedMethods.sortedArrayToBalancedBST(input, 0, input.length-1);
        root.print();
        int actual = fixture.largestBSTSubtree(root);
        System.out.println(actual);
    }

}
