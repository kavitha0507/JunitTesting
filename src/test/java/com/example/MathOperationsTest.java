package com.example;

import org.junit.jupiter.api.Test;

public class MathOperationsTest {
    @Test
    public void testMultiply() {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.multiply(2, 3);
        assert result == 6;
    }

    @Test
    void multiply() {
    }

    @Test
    void testMultiply1() {
    }
}
