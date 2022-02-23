package com.github.vvzhuchkov.calculation;

import com.github.vvzhuchkov.task02.ControllerExp;

public class Calculation {
    public Calculation() {
    }

    public static void main(String[] args) {
        String expression = "(2+((8+10)/2)/(1+1*2))+2";
        ControllerExp controllerExp = new ControllerExp();
        controllerExp.calculation(expression);
    }
}
