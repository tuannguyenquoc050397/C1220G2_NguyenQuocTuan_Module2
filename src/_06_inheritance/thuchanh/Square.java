package _06_inheritance.thuchanh;

public class Square extends Rectangle {
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

}
