package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayUtilsTest {
    @Test
    public void testSortArray() {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] unsortedArray = {5, 3, 8, 1};
        int[] sortedArray = {1, 3, 5, 8};
        assertArrayEquals(sortedArray,
                arrayUtils.sortArray(unsortedArray), "The array should be sorted in ascending order");
    }

    @Test
    void sortArray() {
    }
}
