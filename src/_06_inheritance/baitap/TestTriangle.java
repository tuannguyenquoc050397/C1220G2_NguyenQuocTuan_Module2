package _06_inheritance.baitap;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(3,4,5);
        System.out.println(triangle);
        triangle =new Triangle("red",true,6,8,10);
        System.out.println(triangle);
    }
}
