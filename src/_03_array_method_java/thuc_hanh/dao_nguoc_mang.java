package _03_array_method_java.thuc_hanh;

import java.util.Scanner;

public class dao_nguoc_mang {
    public static void main(String[] args) {
        byte size;
        int arr[];
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter array size: ");
            size=scanner.nextByte();
            if(size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        arr=new int[size];
        for(byte i=0; i<size; i++){
            System.out.println("Enter element "+(i+1)+":");
            arr[i]=scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + "\t");
        }
        for(int i=0; i<size/2; i++){
            int temp=arr[size-i-1];
            arr[size-i-1]=arr[i];
            arr[i]=temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
