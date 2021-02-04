package _04_class_object.baitap;

import java.util.Scanner;

public class Ex_QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter b: ");
        double b=scanner.nextDouble();
        System.out.println("Enter c: ");
        double c=scanner.nextDouble();
        System.out.println("a*X^2+b*X+c=0");
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Root1= "+quadraticEquation.getRoot1());
            System.out.println("Root2= "+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("Root= "+quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
