package _01_introduction_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver");
        System.out.println("Given a equation as 'a*x+b=c', please enter constans");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter b: ");
        double b=scanner.nextDouble();
        System.out.println("Enter c: ");
        double c=scanner.nextDouble();
        if (a!=0){
            double result=(c-b)/a;
            System.out.println("ket qua: "+ result);
        }else {
            if (c-b==0){
                System.out.println("The solution is all X");
            }else {
                System.out.println("No solution");
            }

        }
    }
}
