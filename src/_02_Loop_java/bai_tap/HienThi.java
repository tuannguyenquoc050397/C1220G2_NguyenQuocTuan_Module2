package _02_Loop_java.bai_tap;

import java.util.Scanner;

public class HienThi {
    public static void main(String[] args) {
        byte choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        choice = scanner.nextByte();
        switch (choice) {
            case 0:
                break;
            case 1:
                for (byte i = 0; i < 3; i++) {
                    for (byte j = 0; j < 10; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("1. top-left");
                System.out.println("2. top-right");
                System.out.println("3. botton-left");
                System.out.println("4. botton-right");
                int num = scanner.nextByte();
                switch (num) {
                    case 1:
                        for(byte i=0; i<5; i++){
                            for (byte j=5;j>i;j--) {
                                System.out.print("*  ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 3:
                        for(byte i=0; i<5; i++){
                            for (byte j=0;j<=i;j++) {
                                System.out.print("*  ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 4:
                        for(byte i=0; i<5; i++){
                            for (byte j=0;j<5;j++) {
                                if(j<(4-i)){
                                System.out.print("  ");
                            }else{
                                    System.out.print(" *");
                                }
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        for(byte i=0; i<5; i++){
                            for (byte j=0;j<5;j++) {
                                if(j<i){
                                    System.out.print("  ");
                                }else{
                                    System.out.print(" *");
                                }
                            }
                            System.out.println("");
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("nhap chieu cao tam giac");
                 byte num1=scanner.nextByte();
                 int temp=num1+(num1-1);
                 for(byte i=1;i<=num1;i++){
                     for (byte j=1; j<=temp;j++){
                         if(j<=num1-i||j>(temp-num1+i)){
                             System.out.print("  ");
                         }else {
                             System.out.print(" *");
                         }
                     }
                     System.out.println("");
                 }
        }
    }
}
