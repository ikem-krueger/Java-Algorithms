/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class QueueUsingStacksTest {
    QueueUsingStacks fixture;

    @Before
    public void setUp() {
        fixture = new QueueUsingStacks();
        fixture.push(1);
        fixture.push(2);
    }

    @Test
    public void shouldAddToQueue() {
        assertEquals(1, fixture.peek());
    }

    @Test
    public void shouldRemoveFromQueue() {
        fixture.pop();
        assertEquals(2, fixture.peek());
    }

    @Test
    public void shouldCheckEmptyQueue() {
        fixture.pop();
        assertFalse(fixture.empty());
        fixture.pop();
        assertTrue(fixture.empty());
    }

}
