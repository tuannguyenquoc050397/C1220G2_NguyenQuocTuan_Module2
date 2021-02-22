package _06_inheritance.baitap.LopCircleVaLopCydinder;

public class Test {
    public static void main(String[] args) {
     Circle cylinder=new Cylinder();
        System.out.println(cylinder.display());
        cylinder=new Cylinder(3, "blue",5);
        System.out.println(cylinder.display());
    }
}
