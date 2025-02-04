package org.calvin.Tree.Heap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianFinderTest {
    private MedianFinder fixture;

    @Before
    public void setUp() {
        fixture = new MedianFinder();
    }
    
    @Test
    public void shouldFindMedian() {
        fixture.addNum(1);
        fixture.addNum(2);
        assertEquals(1.5,fixture.findMedian(),0);
        fixture.addNum(3);
        assertEquals(2,fixture.findMedian(),0);
        fixture.addNum(3);
        fixture.addNum(3);
        assertEquals(3,fixture.findMedian(),0);
        fixture.addNum(1);
        fixture.addNum(1);
        fixture.addNum(0);
        fixture.addNum(0);
        assertEquals(1,fixture.findMedian(),0);
        fixture.addNum(-1);
        fixture.addNum(-1);
        fixture.addNum(-1);
        fixture.addNum(-1);
        assertEquals(1,fixture.findMedian(),0);
        fixture.addNum(-10);
        assertEquals(0.5,fixture.findMedian(),0);
        fixture.addNum(-100);
        assertEquals(0,fixture.findMedian(),0);
    }
}