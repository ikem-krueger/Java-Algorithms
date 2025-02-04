/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.Arrays;

// Given an array of size n, find the majority element. The majority element is the element that appears more than
// n/2 times.
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElementLinear(int[] nums) {
        int result = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                result = num;
                count = 1;
            } else if (result == num) {
                count++;
            } else {
                count--;
            }
        }

        return result;
    }
}
