package _10_dsa_stack_queue.baitap;

import _09_dsa_danhSach.baitap.MyList;
import _10_dsa_stack_queue.thuchanh.MyGenericStack;

public class DaoNguocMang {
    public static void main(String[] args) {
        MyList<Integer> integerList = new MyList<Integer>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        MyGenericStack<Integer> stackInteger = new MyGenericStack<Integer>();
        for (int i = 0; i < integerList.getSize(); i++) {
            stackInteger.push(integerList.get(i));
        }
        integerList.disPlay();
        System.out.println("");
        for (int i = 0; i < integerList.getSize(); i++) {
            integerList.setElements(i, stackInteger.pop());
        }
        integerList.disPlay();
        MyGenericStack<Character> stackString = new MyGenericStack<Character>();
        String word = "Hello";
        System.out.println();
        System.out.println(word);
        for (int i = 0; i < word.length(); i++) {
            stackString.push(word.charAt(i));
        }
        String wordReserve = "";
        while (!stackString.isEmpty()) {
            wordReserve += stackString.pop();
        }
        System.out.println();
        System.out.println(wordReserve);
    }
}
