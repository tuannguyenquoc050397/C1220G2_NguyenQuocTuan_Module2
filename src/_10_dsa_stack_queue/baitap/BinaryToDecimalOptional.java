package _10_dsa_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class BinaryToDecimalOptional {
    public static void main(String[] args) {
        Stack<Integer> stackBinary = new Stack<Integer>();
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divNumber;
        boolean check = false;
        do {
            divNumber = number % 2;
            number = number / 2;
            check = (number == 0);
            stackBinary.add(divNumber);
        } while (!check);
        System.out.println(stackBinary.size());
        String binary = "";
        while (!stackBinary.isEmpty()) {
            binary += stackBinary.pop();
        }
        System.out.println(binary);
    }

}
