package _05_accessModifier_staticMethod_staticPropeties.thuchanh;

public class Student {
    private int rollno;
    private String name;
    private static String college="BachKhoa";

    public static void setCollege(String college) {
        Student.college = college;
    }

    Student(int r, String n){
        rollno=r;
        name=n;
    }
    static void change(){
        college="CODEGYM";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
