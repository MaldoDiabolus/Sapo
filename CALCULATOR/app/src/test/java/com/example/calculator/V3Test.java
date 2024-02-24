package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class V3Test {

    @Test
    public void calcularFibonacci() {

        long resultado= V3.calcularFibonacci(5);
            assertEquals(5,resultado);

    }
}