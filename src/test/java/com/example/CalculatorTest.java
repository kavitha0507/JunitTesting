package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CalculatorTest {
    private Ex01Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Ex01Calculator();
    }
        @Test
        public void testAddition () {
            Ex01Calculator calculator = new Ex01Calculator();
            int result = calculator.add(2, 3);
            assertEquals(5, result);


        }
    }



