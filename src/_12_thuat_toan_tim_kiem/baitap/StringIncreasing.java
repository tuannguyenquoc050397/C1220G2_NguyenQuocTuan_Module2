package _12_thuat_toan_tim_kiem.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class StringIncreasing {
    public static void main(String[] args) {
        LinkedList<Character> max = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character element : max) {
            System.out.print(element);
        }
    }
}

