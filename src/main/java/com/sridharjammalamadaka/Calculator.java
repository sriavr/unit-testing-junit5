package com.sridharjammalamadaka;

public class Calculator {
    public double divide(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Divider cannot be equal to zero!");
        }
        return a/b;
    }

    public int add(int a, int b) {
        return a + b;
    }
}