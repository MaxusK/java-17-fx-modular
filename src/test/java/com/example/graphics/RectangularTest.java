package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularTest {
    private Rectangular r = null;
    @BeforeEach
    public void before(){
        this.r = new Rectangular(4.0,4.0,4.0,4.0);{
        }
    }

    @Test
    public void testComputeArea() {
        assertEquals(r.computeArea(), 16, 0.01);
    }

    @Test
    public void testComputeCircumference() {
        assertEquals(r.computeCircumference(),16,0.01);
    }
}