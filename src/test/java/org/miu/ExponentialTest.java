package org.miu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ExponentialTest {
    Exponential exp=new Exponential();
    @Test
    void power() {
        assertEquals(exp.power(2,3),8);
    }

    @Test
    void powerNegativeBase() {
        assertEquals(-125,exp.power(-5,3));
    }
    @Test
    void powerIllegalArgumentTest() {
        assertThrows(IllegalArgumentException.class,
                ()->{
                    exp.power(2,-3);
                });
    }
}