package _06_inheritance.thuchanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        System.out.println(circle.news());

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("red",true,3.0);
        System.out.println(circle);
    }
}
