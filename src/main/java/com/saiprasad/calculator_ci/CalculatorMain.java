package com.saiprasad.calculator_ci;


public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Add = " + calc.add(10,5));
        System.out.println("Sub = " + calc.sub(10,5));
    }
}