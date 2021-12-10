package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle c=null;

    @BeforeEach
    public void before () {
        c = this.c = new Circle(4.0,4.0,4.0) {
        };
    }
    @Test
    void testComputeArea() {
        assertEquals(c.computeArea(),50.26,0.01);
    }

    @Test
    void testComputeCircumference() {
        assertEquals(c.computeCircumference(),25.13,0.01);
    }
}