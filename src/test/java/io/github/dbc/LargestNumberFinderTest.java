package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Method;

class LargestNumberFinderTest {

    private LargestNumberFinder largestNumberFinder;

    @BeforeEach
    void setUp() {
        largestNumberFinder = new LargestNumberFinder();
    }

    @Test
    void shouldHaveCorrectMethodName() {
        try {
            Method findLargestNumber = largestNumberFinder
                    .getClass().getDeclaredMethod("findLargestNumber", int.class, int.class, int.class);
            Assertions.assertEquals("findLargestNumber", findLargestNumber.getName(),
                    "The method name should be findLargestNumber");
        } catch (NoSuchMethodException e) {
            Assertions.fail("Method findLargestNumber() not found");
        }
    }

    @Test
    void shouldHaveCorrectNumberOfParameters() {
        try {
            Method findLargestNumber = largestNumberFinder
                    .getClass().getDeclaredMethod("findLargestNumber", int.class, int.class, int.class);
            Assertions.assertEquals(3, findLargestNumber.getParameterCount(),
                    "The method should have three parameters");
        } catch (NoSuchMethodException e) {
            Assertions.fail("Method findLargestNumber() not found");
        }
    }

    @Test
    void shouldHaveCorrectParameterTypes() {
        try {
            Method findLargestNumber = largestNumberFinder
                    .getClass().getDeclaredMethod("findLargestNumber", int.class, int.class, int.class);
            Assertions.assertEquals(int.class, findLargestNumber.getParameterTypes()[0],
                    "The first parameter should be of type int");
            Assertions.assertEquals(int.class, findLargestNumber.getParameterTypes()[1],
                    "The second parameter should be of type int");
            Assertions.assertEquals(int.class, findLargestNumber.getParameterTypes()[2],
                    "The third parameter should be of type int");
        } catch (NoSuchMethodException e) {
            Assertions.fail("Method findLargestNumber() not found");
        }
    }

    @Test
    void shouldHaveCorrectReturnType() {
        try {
            Method findLargestNumber = largestNumberFinder
                    .getClass().getDeclaredMethod("findLargestNumber", int.class, int.class, int.class);
            Assertions.assertEquals(int.class, findLargestNumber.getReturnType(),
                    "The method should return an int");
        } catch (NoSuchMethodException e) {
            Assertions.fail("Method findLargestNumber() not found");
        }
    }

    // TODO: If all the other methods pass, then remove the @Disabled annotation and uncomment line number
    //  77 and 78 to run this test
    @Disabled
    @ParameterizedTest(name = "should return {0} when given {1}, {2}, {3}")
    @CsvSource(value = {
            "0, 0, 0, 0",
            "0, 0, 1, 1",
            "0, 1, 0, 1",
            "0, 1, 1, 1",
            "1, 0, 0, 1",
            "1, 0, 1, 1",
            "1, 1, 0, 1",
            "1, 1, 1, 1",
            "1, 2, 3, 3",
            "1, 3, 2, 3",
            "2, 1, 3, 3",
            "2, 3, 1, 3",
            "3, 1, 2, 3",
            "3, 2, 1, 3",
            "3, 3, 1, 3",
            "3, 3, 2, 3"
    })
    void shouldReturnCorrectValue(int expected, int num1, int num2, int num3) {
//         Assertions.assertEquals(expected, largestNumberFinder.findLargestNumber(num1, num2, num3),
//                 "The method should return " + expected);
    }
}