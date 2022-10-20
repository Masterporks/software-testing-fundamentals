package org.example.calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {
private Calculator calculator;
private static float [] testArray;

// This method will be called before all the methods tests below
@BeforeAll
public static void setupGlobal(){
    System.out.println("Starting calculator tests");
    testArray = new float[] {3, 4, 5, 67, 4.4f, 6};
}

//This method is called before start run of each test
@BeforeEach
public void setupEach(){
    calculator = new Calculator();
}
    //This method is called after start run of each test
@AfterEach
public void finalSetupEach(){
    System.out.println("This test is finished running!");

}
// This method will be called after all the methods
@AfterAll
public static void finalSetupGlobal(){
    System.out.println("Calculator tests are finished successfully");
}

    @Test
    public void shouldReturnMultiplyWhenMultiplyArrayIsCalled() {


        float result = calculator.multiplyArray(testArray);

        Assertions.assertEquals(106128f, result);
    }

    @Test

    public void shouldReturnAddWhenAddArrayIsCalled(){

        Calculator calculator = new Calculator();

        float result = calculator.addArray(testArray);


Assertions.assertAll(()-> Assertions.assertTrue(result > 0) ,
        () -> Assertions.assertEquals(89.4f, result));

    }

}