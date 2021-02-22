package _06_inheritance.thuchanh;

public class Circle extends Shape {
    private double radius=1;

    public Circle() {
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius"+ getRadius()+super.toString();
    }
    @Override
    public String news(){
        return "testCircle";
    }
}

