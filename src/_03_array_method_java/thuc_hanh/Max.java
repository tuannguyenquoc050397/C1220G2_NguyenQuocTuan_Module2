package _03_array_method_java.thuc_hanh;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter size ");
            size=scanner.nextInt();
            if(size>20){
                System.out.println("Size should not exceed 20");
            }
        }while (size>20);
        arr=new int[size];

        for (byte i=0; i<size; i++){
            System.out.println("Enter element "+(i+1)+": ");
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        for (byte i=0; i<size; i++){
            System.out.println(arr[i]+"\t");
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max: "+max);

    }
}
