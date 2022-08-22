package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Homework4Test {
    @BeforeAll
    static void beforeAll() {
        System.out.println("The method is executed 1 time before all tests");
    }

    @Test
    @DisplayName("Checking Heron's Formula With Positive Sides")
    void formulaHeronThenSidesArePositive() throws Exception {
        double result = Homework4.calculateArea(5, 5, 6);
        Assertions.assertEquals(12, 12);
    }
    @Test
    @DisplayName("Checking Heron's Formula With Negative Sides")
    void formulaHeronThenSidesAreNegative() {
        Assertions.assertThrows(Exception.class, () -> Homework4.calculateArea(-2, 2, 2));
    }


}




