/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class PowerOf3 {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        while(n!=1){
            if(n%3!=0) return false;
            n = n/3;
        }
        return true;
    }
}
