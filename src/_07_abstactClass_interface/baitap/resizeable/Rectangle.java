package _07_abstactClass_interface.baitap.resizeable;

import _06_inheritance.thuchanh.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1;
    private double length = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "A Rectangle with width and length: " + getWidth() + " and " + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Rectangle resize: " + percent + " %");
    }
}
