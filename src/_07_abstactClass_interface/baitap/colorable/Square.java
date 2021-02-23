package _07_abstactClass_interface.baitap.colorable;

import _06_inheritance.thuchanh.Rectangle;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }

    public Square(String color, Boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
