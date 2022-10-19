package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyCalculatorTest {

    @Test
    public void shouldReturnMultiplyWhenMultiplyArrayIsCalled() {
        float[] array = {3, 4, 5, 67, 4.4f, 6};
        Calculator calculator = new Calculator();
        float result = calculator.multiplyArray(array);

        Assertions.assertEquals(106128f, result);
    }
}