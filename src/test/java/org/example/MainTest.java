package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void inc() {
        assertEquals(2,Main.inc(1));
    }
}