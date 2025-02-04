/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.HashMap;
import java.util.Map;

public class ClosestToZero {
    public int closestToZero(int[] input) {
        Map<Integer, Integer> tracker = new HashMap<>();
        int min = Integer.MAX_VALUE;
        if (input == null || input.length < 1) {
            return min;
        }
        for (int anInput : input) {
            int inputAbsValue = Math.abs(anInput);
            if (inputAbsValue <= min) {
                min = inputAbsValue; // min is always positive
                if (tracker.containsKey(min) && inputAbsValue > tracker.get(min)) {
                    tracker.put(min, anInput);
                } else if (!tracker.containsKey(min)) {
                    tracker.put(min, anInput);
                }
            }
        }
        return tracker.get(min);
    }

    public int closestToZeroNoExtraSpace(int[] input) {
        int min = Integer.MAX_VALUE;
        if (input == null || input.length < 1) {
            return min;
        }
        int m = Math.abs(input[0]);
        int mVal = input[0];
        for (int i = 1; i < input.length; i++) {
            int a = Math.abs(input[i]);
            if (a <= m) {
                m = a;
                mVal = input[i];
            }
        }
        return mVal;
    }
}
