package _01_introduction_java.thuc_hanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float heigth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width=scanner.nextFloat();
        System.out.println("Enter Heigth: ");
        heigth=scanner.nextFloat();
        float area=width*heigth;
        System.out.println("Area: "+area);
    }
}
