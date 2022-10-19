package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubtractCalculatorTest {

    @Test
    public void shouldReturnSubtractWhenSubtractArrayIsCalled() {
        float[] array = {3, 4, 5, 67, 4.4f, 6};
        Calculator calculator = new Calculator();
        float result = calculator.subtractArray(array);

        Assertions.assertEquals(-83.4000015258789, result);
    }
}