package com.example.graphics;

public class Circle extends Shape{
    double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return (Math.PI*radius*radius);
    }

    @Override
    public double computeCircumference() {
        return (Math.PI*radius*2);
    }
}
