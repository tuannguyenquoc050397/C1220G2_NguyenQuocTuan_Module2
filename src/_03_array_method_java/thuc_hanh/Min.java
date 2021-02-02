package _03_array_method_java.thuc_hanh;

import java.util.Scanner;

public class Min {
    public static int minValue(int[] array){
        int min;
        min=array[0];
        for(int i=1; i<array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int array[];
        do {
            System.out.println("Enter size");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("size should not exceed 20");
                continue;
            }
        }while (size>20);
        array=new int[size];
        for (byte i=0;i<size;i++){
            System.out.println("Enter element: "+ (i+1));
            array[i]=scanner.nextInt();
        }
        System.out.print(array);
        System.out.println(minValue(array));
    }
}
