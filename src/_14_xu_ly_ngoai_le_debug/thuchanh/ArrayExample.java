package _14_xu_ly_ngoai_le_debug.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static int[] createRandom() {
        int arr[] = new int[10];
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chi so phan tu: ");
        int number = scanner.nextInt();
        try {
            System.out.println("gia tri phan tu la: " + arr[number]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("chi so vuot qua gioi han cua mang");
        }
    }
}
