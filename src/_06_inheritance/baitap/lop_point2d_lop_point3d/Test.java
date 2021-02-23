package _06_inheritance.baitap.lop_point2d_lop_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D point3D=new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(3,5,6);
        System.out.println(point3D);
        ((Point3D)point3D).setXYZ(1,2,3);
        System.out.println(point3D);
    }
}
