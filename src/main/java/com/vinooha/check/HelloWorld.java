package com.vinooha.check;

import com.example.client.api.Calculator;
import com.example.client.api.CalculatorSoap;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        CalculatorSoap calcService = new Calculator().getCalculatorSoap();
        
//        URL newEndpoint = new URL("http://www.dneonline.com/calculator.asmx");
//        QName qname = new QName("http://tempuri.org/","Calculator");
//        CalculatorSoap calcService = new Calculator(newEndpoint, qname).getCalculatorSoap();

        
        System.out.println(calcService.add(1,2));
        
        
    }
}
