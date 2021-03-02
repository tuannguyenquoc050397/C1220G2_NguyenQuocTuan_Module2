package _10_dsa_stack_queue.baitap;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeOptional {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.toLowerCase();
        boolean checkSize = false;
        boolean checkPalindrome = true;
        int i = 0;
        while (!checkSize) {

            stack.add(string.charAt(i));
            checkSize = (stack.size() == string.length());
            i++;
        }
        for (int j = 0; j < stack.size(); j++) {
            if (stack.get(j) != stack.get(stack.size() - 1 - j)) {
                checkPalindrome = false;
                break;
            }
        }
        System.out.println(checkPalindrome);
    }
}
