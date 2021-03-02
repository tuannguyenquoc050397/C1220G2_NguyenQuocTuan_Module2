package test.comparator_comparable;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList extends LinkedList {
    public MyLinkedList() {
    }

    public MyLinkedList(Collection c) {
        super(c);
    }

    public void display() {
        System.out.println(this.getFirst());
    }

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,3);
        System.out.println(list.get(2));
        for (Object l : list) {
            System.out.println(l);
        }

    }
}
