package _06_inheritance.baitap.lop_circle_lop_cylinder;

public class Test {
    public static void main(String[] args) {
     Circle cylinder=new Cylinder();
        System.out.println(cylinder.display());
        cylinder=new Cylinder(3, "blue",5);
        System.out.println(cylinder.display());
    }
}
