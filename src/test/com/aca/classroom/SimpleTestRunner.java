package com.aca.classroom;

public class SimpleTestRunner {

    private static int totalTests = 0;
    private static int passedTests = 0;
    private static int failedTests = 0;

    public static void main(String[] args) {
        System.out.println("=== Running StringTest Tests ===\n");

        // Tests for com.aca.classroom.StringTest
        testStringTestMinAndMax();

        // Tests for com.aca.classroom.week1.StringTest
        testWeek1StringTest();

        // Print summary
        System.out.println("\n=== Test Summary ===");
        System.out.println("Total tests: " + totalTests);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + failedTests);

        if (failedTests == 0) {
            System.out.println("\n✓ ALL TESTS PASSED!");
            System.exit(0);
        } else {
            System.out.println("\n✗ SOME TESTS FAILED!");
            System.exit(1);
        }
    }

    private static void testStringTestMinAndMax() {
        System.out.println("Testing com.aca.classroom.StringTest.minAndMax()");

        // Test 1: First is smaller
        test("minAndMax(10, 20)", "10|20",
            com.aca.classroom.StringTest.minAndMax(10, 20));

        // Test 2: Second is smaller
        test("minAndMax(50, 30)", "30|50",
            com.aca.classroom.StringTest.minAndMax(50, 30));

        // Test 3: Both are equal
        test("minAndMax(15, 15)", "15|15",
            com.aca.classroom.StringTest.minAndMax(15, 15));

        // Test 4: Negative numbers
        test("minAndMax(-5, -10)", "-10|-5",
            com.aca.classroom.StringTest.minAndMax(-5, -10));

        // Test 5: Mixed positive and negative
        test("minAndMax(10, -5)", "-5|10",
            com.aca.classroom.StringTest.minAndMax(10, -5));

        // Test 6: With zero
        test("minAndMax(0, 5)", "0|5",
            com.aca.classroom.StringTest.minAndMax(0, 5));

        System.out.println();
    }

    private static void testWeek1StringTest() {
        System.out.println("Testing com.aca.classroom.week1.StringTest.indexOfString()");

        // Test 1: First char is 'a'
        testInt("indexOfString(\"apple\")", 0,
            com.aca.classroom.week1.StringTest.indexOfString("apple"));

        // Test 2: First char is 'b'
        testInt("indexOfString(\"banana\")", 1,
            com.aca.classroom.week1.StringTest.indexOfString("banana"));

        // Test 3: First char is 'c'
        testInt("indexOfString(\"cat\")", 2,
            com.aca.classroom.week1.StringTest.indexOfString("cat"));

        // Test 4: First char is 'd'
        testInt("indexOfString(\"dog\")", 3,
            com.aca.classroom.week1.StringTest.indexOfString("dog"));

        // Test 5: First char is 'e'
        testInt("indexOfString(\"elephant\")", 4,
            com.aca.classroom.week1.StringTest.indexOfString("elephant"));

        // Test 6: First char not in array
        testInt("indexOfString(\"zebra\")", -1,
            com.aca.classroom.week1.StringTest.indexOfString("zebra"));

        // Test 7: Uppercase char
        testInt("indexOfString(\"Apple\")", -1,
            com.aca.classroom.week1.StringTest.indexOfString("Apple"));

        // Test 8: Single char 'a'
        testInt("indexOfString(\"a\")", 0,
            com.aca.classroom.week1.StringTest.indexOfString("a"));

        System.out.println();
    }

    private static void test(String testName, String expected, String actual) {
        totalTests++;
        if (expected.equals(actual)) {
            passedTests++;
            System.out.println("  ✓ " + testName + " = \"" + actual + "\"");
        } else {
            failedTests++;
            System.out.println("  ✗ " + testName);
            System.out.println("    Expected: \"" + expected + "\"");
            System.out.println("    Actual:   \"" + actual + "\"");
        }
    }

    private static void testInt(String testName, int expected, int actual) {
        totalTests++;
        if (expected == actual) {
            passedTests++;
            System.out.println("  ✓ " + testName + " = " + actual);
        } else {
            failedTests++;
            System.out.println("  ✗ " + testName);
            System.out.println("    Expected: " + expected);
            System.out.println("    Actual:   " + actual);
        }
    }
}
