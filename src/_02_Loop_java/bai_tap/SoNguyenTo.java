package _02_Loop_java.bai_tap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        byte n=2;
        byte count=0;
        while (count<20){
            boolean check=true;
            for (byte i=2;i<n;i++){
                if(n%i==0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
