package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJCalculatorTests {

    @Test
    public void shouldAddTwoNumbers() {
        float[] testArray = {3, 4, 5, 67, 4.4f, 6};
        Calculator calculator = new Calculator();
        float result = calculator.addArray(testArray);

        assertThat(result).isEqualTo(89.4f);
    }
        @Test
        public void shouldSubtractTwoNumbers () {
            float[] testArray = {3, 4, 5, 67, 4.4f, 6};
            Calculator calculator = new Calculator();
            float result = calculator.subtractArray(testArray);

            assertThat(result).isEqualTo(-83.4f);
        }
    @Test
    public void shouldDivideTwoNumbers () {
        float[] testArray = {3, 4, 5, 67, 4.4f, 6};
        Calculator calculator = new Calculator();
        float result = calculator.divideArray(testArray);

        assertThat(result).isEqualTo(8.480326E-5f);
    }
    @Test
    public void shouldMultiplyTwoNumbers () {
        float[] testArray = {3, 4, 5, 67, 4.4f, 6};
        Calculator calculator = new Calculator();
        float result = calculator.multiplyArray(testArray);

        assertThat(result).isEqualTo(106128.0f);
    }
    }
