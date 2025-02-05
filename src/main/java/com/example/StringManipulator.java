package com.example;

public class StringManipulator {
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
