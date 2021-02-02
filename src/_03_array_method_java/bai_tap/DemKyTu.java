package _03_array_method_java.bai_tap;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "nguyenquoctuansieucapvippro";
        System.out.println("nhap ky tu: ");
        char input = scanner.nextLine().charAt(0);

        byte count = 0;
        for (byte i = 0; i < str.length(); i++) {
            if (input == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("so lan xuat hien cua a: " + count);

    }
}
