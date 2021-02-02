package _03_array_method_java.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int array[]={1,2,7,4,5,6,7,8,7,9};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number ");
        int num=scanner.nextInt();
        for(byte i=0; i<array.length; i++){
            if (num==array[i]){
                System.out.println(i+"_del");
                for(byte j=i; j<array.length-1; j++){
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
            }
        }
        for(byte i=0; i<array.length; i++){
            System.out.print(array[i]);
        }

    }
}
