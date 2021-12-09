package com.example.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator c = null;

    @BeforeEach
    public void before () {
        this.c = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals (c.add(4.0,4.0), 8.0, 0.01);
    }
    @Test
    public void testSubtract(){assertEquals(c.subtract(4.0,4.0),0.0,0.01); }
    @Test
    void testMultiply() {assertEquals(c.multiply(4.0,4.0),16.0,0.01);}
    @Test
    void testDivide() {assertEquals(c.divide(4.0,4.0),1,0.01);}
}

