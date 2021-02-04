package _03_array_method_java.bai_tap;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter column size");
        byte col=scanner.nextByte();
        System.out.println("Enter row size");
        byte row=scanner.nextByte();
        int matrix[][]=new int[row][col];
        for (byte i=0; i<row;i++){
            for (byte j=0; j<col;j++){
                System.out.println("enter element of Matrix id ["+i+"]["+j+"]");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Your Matrix");
        for (byte i=0; i<row;i++){
            for (byte j=0; j<col;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Enter column");
        byte colValue=scanner.nextByte();
        int sum=0;
        for (byte i=0; i<row;i++){
            sum+=matrix[i][colValue];
        }
        System.out.println("Sum is: "+sum);
    }
}
