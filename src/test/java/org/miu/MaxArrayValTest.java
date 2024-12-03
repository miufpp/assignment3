package org.miu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxArrayValTest {

    @Test
    void findMaxVal() {
        assertTrue(MaxArrayVal.findMaxVal(new int[]{260,33,99,887,44,9,10})==887);
    }

    @Test
    void findMaxValNegatives() {
        assertEquals(MaxArrayVal.findMaxVal(new int[]{-260,-3,-99,-887,-44,-9,-10}),-3);
    }
}