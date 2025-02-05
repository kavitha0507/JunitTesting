package com.example;

public class Ex02CalculatorUpdate {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
    // Method to divide two numbers
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    // Method to calculate factorial of a number
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");

        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


