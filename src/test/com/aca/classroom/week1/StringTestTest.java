package com.aca.classroom.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTestTest {

    @Test
    void testIndexOfString_whenFirstCharIsA_returnsZero() {
        // Given
        String input = "apple";

        // When
        int result = StringTest.indexOfString(input);

        // Then
        assertEquals(0, result);
    }

    @Test
    void testIndexOfString_whenFirstCharIsB_returnsOne() {
        // Given
        String input = "banana";

        // When
        int result = StringTest.indexOfString(input);

        // Then
        assertEquals(1, result);
    }

    @Test
    void testIndexOfString_whenFirstCharIsC_returnsTwo() {
        // Given
        String input = "cat";

        // When
        int result = StringTest.indexOfString(input);

        // Then
        assertEquals(2, result);
    }

    @Test
    void testIndexOfString_whenFirstCharIsD_returnsThree() {
        // Given
        String input = "dog";

        // When
        int result = StringTest.indexOfString(input);

        // Then
        assertEquals(3, result);
    }

    @Test
    void testIndexOfString_whenFirstCharIsE_returnsFour() {
        // Given
        String input = "elephant";

        // When
        int result = StringTest.indexOfString(input);

        // Then
        assertEquals(4, result);
    }

    @Test
    void testIndexOfString_whenFirstCharNotInArray_returnsMinusOne() {
        // Given
        String input = "zebra";

        // When
        int result = StringTest.indexOfString(input);

        // Then
        assertEquals(-1, result);
    }

    @Test
    void testIndexOfString_withUpperCaseChar_returnsMinusOne() {
        // Given
        String input = "Apple";

        // When
        int result = StringTest.indexOfString(input);

        // Then
        assertEquals(-1, result);
    }

    @Test
    void testIndexOfString_withSingleChar_a() {
        // Given
        String input = "a";

        // When
        int result = StringTest.indexOfString(input);

        // Then
        assertEquals(0, result);
    }
}
