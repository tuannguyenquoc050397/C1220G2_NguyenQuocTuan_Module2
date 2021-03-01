package _10_dsa_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        Stack stack=new Stack();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap bieu thuc");
        String bieuThuc=scanner.nextLine();
        for (int i=0; i<bieuThuc.length(); i++){
            boolean kiemTraDauNgoacTrai=bieuThuc.charAt(i)=='(';
            boolean kiemTraDauNgoacPhai=bieuThuc.charAt(i)==')';
            if (kiemTraDauNgoacTrai){
                stack.add('(');
            }else if(kiemTraDauNgoacPhai){
                if(stack.isEmpty()){
                    stack.add("false");
                    break;
                }else {
                    stack.pop();
                }
            }
        }
        boolean kiemTraBieuThuc=stack.isEmpty();
        System.out.println("bieu thuc: "+kiemTraBieuThuc);
        System.out.println(stack.size());
    }
}
