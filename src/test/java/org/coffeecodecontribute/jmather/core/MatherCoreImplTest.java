package org.coffeecodecontribute.jmather.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatherCoreImplTest {
    MatherCore matherCore;

    @BeforeEach
    void setUp() {
        this.matherCore = new MatherCoreImpl();
    }

    @Test
    void add() {
        double res = this.matherCore.add(1, 2);

        assertEquals(3, res);
    }

    @Test
    void subtract() {
        double res = this.matherCore.subtract(1, 2);

        assertEquals(-1, res);
    }
}