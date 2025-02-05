package com.example;

import org.junit.jupiter.api.Test;

public class StringManipulatorTest {
    @Test
    public void testReverse() {
        StringManipulator stringManipulator = new StringManipulator();
        String result = stringManipulator.reverse("Hello");
        assert result.equals("olleH");
    }

    @Test
    void reverse() {
    }
}
