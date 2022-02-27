package com.github.vvzhuchkov.calculation;

import com.github.vvzhuchkov.task02.Calculator;

public class Calculation {

    public static void main(String[] args) {
        String expression = "(2+((8+010)/2)/(1+1*2))+2";
        Calculator calculator = new Calculator();
        int result = calculator.calculator(expression);
        System.out.println("The result of expression is: " + result);
    }
}
