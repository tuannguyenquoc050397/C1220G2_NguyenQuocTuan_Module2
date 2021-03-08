package _14_xu_ly_ngoai_le_debug.thuchanh;

import java.util.Scanner;

public class CalculationExample {
    private static void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (ArithmeticException e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap x: ");
        int x=scanner.nextInt();
        System.out.println("nhap y: ");
        int y=scanner.nextInt();
        CalculationExample.calculate(x,y);

    }
}
