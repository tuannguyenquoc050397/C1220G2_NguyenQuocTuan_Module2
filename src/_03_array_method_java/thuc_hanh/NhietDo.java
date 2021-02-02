package _03_array_method_java.thuc_hanh;

import java.util.Scanner;

public class NhietDo {
    public static double cToF(double c){
        double f=2*c+32;
        return f;
    }
    public static double fToC(double f){
        double c=0.5*(f-32);
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        byte choice=scanner.nextByte();
        switch (choice){
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Enter F");
                double f=scanner.nextDouble();
                System.out.println("C: "+fToC(f));
                break;
            case 2:
                System.out.println("Enter C");
                float C=scanner.nextFloat();
                System.out.println("F: "+cToF(C));
                break;
            default:
                System.out.println("Ctrl + Shift+ F10");
        }
    }
}
