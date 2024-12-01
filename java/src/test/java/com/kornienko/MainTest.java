package com.kornienko;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void transform() {
        Map<Integer, Long> actual = Main.transform(new Integer[] {1, 3, 4, 5, 1, 5, 4});

        Map<Integer, Long> expected = new HashMap<>();
        expected.put(1, 2L);
        expected.put(3, 1L);
        expected.put(4, 2L);
        expected.put(5, 2L);

        assertEquals(expected, actual);
    }
}