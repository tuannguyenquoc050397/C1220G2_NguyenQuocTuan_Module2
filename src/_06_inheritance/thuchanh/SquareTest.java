package _06_inheritance.thuchanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("red",true,2,3);
        System.out.println(square);

    }
}
