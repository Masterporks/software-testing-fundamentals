package org.example.calculator;

public class Calculator {
    public float multiplyArray(float[] inputArray) {

        float result = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            result *= inputArray[i];
        }
        return result;

    }

    public float addNumbers ( int a, int b){
        return a + b;
    }
        public float addArray(float[] inputArray) {
            float result = 0;
            for (float input : inputArray) {  // {1, 2, 3}
                result += input; //result = result +input
            }
            return result;
        }

    public float divideArray(float[] inputArray) {


        float result = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            result /= inputArray[i];
        }
        return result;
    }

    public float subtractArray(float[] inputArray) {
        float result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) { //i=0 ei saa olla, kuna 0 kasutame juba eelmisel real, sellest nagu alustame
            result = result - inputArray[i];

        }
        return result;
    }

}


