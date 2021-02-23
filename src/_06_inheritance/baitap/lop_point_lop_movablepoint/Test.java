package _06_inheritance.baitap.lop_point_lop_movablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint object1=new MovablePoint(0,0,5,2);
        System.out.println(object1);
        object1.move();
        System.out.println(object1);
         MovablePoint o1=object1.move();
        System.out.println(o1);
    }
}
