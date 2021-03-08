package _14_xu_ly_ngoai_le_debug.baitap;

import java.util.Scanner;

public class TestTriangle {
    static void validate(double side1, double side2, double side3) throws IllegalTriangleException{
        if((side1+side2)<=side3||(side1+side3)<=side2||(side2+side3)<=side1){
            throw new IllegalTriangleException("3 canh ko hop le");
        }else {
            System.out.println("nhap 3 canh tam giac thanh cong");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            try {
                System.out.println("nhap side 1: ");
                String side1=scanner.nextLine();
                System.out.println("nhap side 2: ");
                String side2=scanner.nextLine();
                System.out.println("nhap side 3: ");
                String side3=scanner.nextLine();
                validate(Integer.parseInt(side1),Integer.parseInt(side2),Integer.parseInt(side3));
                break;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println("tong 2 canh phai lon hon canh con lai:"+illegalTriangleException);
            }catch (Exception exception){
                System.out.println("loi nhap");
            }
            System.out.println("nhap lai");
        }

    }
}
