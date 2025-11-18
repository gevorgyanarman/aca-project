package com.aca.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTestTest {

    @Test
    void testMinAndMax_whenFirstIsSmaller_returnsCorrectOrder() {
        // Given
        int i = 10;
        int j = 20;

        // When
        String result = StringTest.minAndMax(i, j);

        // Then
        assertEquals("10|20", result);
    }

    @Test
    void testMinAndMax_whenSecondIsSmaller_returnsCorrectOrder() {
        // Given
        int i = 50;
        int j = 30;

        // When
        String result = StringTest.minAndMax(i, j);

        // Then
        assertEquals("30|50", result);
    }

    @Test
    void testMinAndMax_whenBothAreEqual_returnsCorrectFormat() {
        // Given
        int i = 15;
        int j = 15;

        // When
        String result = StringTest.minAndMax(i, j);

        // Then
        assertEquals("15|15", result);
    }

    @Test
    void testMinAndMax_withNegativeNumbers() {
        // Given
        int i = -5;
        int j = -10;

        // When
        String result = StringTest.minAndMax(i, j);

        // Then
        assertEquals("-10|-5", result);
    }

    @Test
    void testMinAndMax_withMixedPositiveNegative() {
        // Given
        int i = 10;
        int j = -5;

        // When
        String result = StringTest.minAndMax(i, j);

        // Then
        assertEquals("-5|10", result);
    }

    @Test
    void testMinAndMax_withZero() {
        // Given
        int i = 0;
        int j = 5;

        // When
        String result = StringTest.minAndMax(i, j);

        // Then
        assertEquals("0|5", result);
    }
}
