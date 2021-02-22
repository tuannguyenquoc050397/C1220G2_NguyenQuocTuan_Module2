package _06_inheritance.thuchanh;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape= new Shape();
        System.out.println(shape);
        shape = new Shape("red",true);
        System.out.println(shape);
        System.out.println(shape.news());

    }
}
