package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivideCalculatorTest {

    @Test
    public void shouldReturnDivideWhenDivideArrayIsCalled() {
        float[] array = {343, 4, 5, 67, 6};
        Calculator calculator = new Calculator();
        float result = calculator.divideArray(array);

        Assertions.assertEquals(0.04266169294714928, result);
    }
}