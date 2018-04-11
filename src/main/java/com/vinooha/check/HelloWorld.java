package com.vinooha.check;

import com.example.client.api.Calculator;
import com.example.client.api.CalculatorSoap;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        CalculatorSoap calcService = new Calculator().getCalculatorSoap();
        System.out.println(calcService.add(1,2));
    }
}
