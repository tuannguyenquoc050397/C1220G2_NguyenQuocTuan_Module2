package _09_dsa_danhSach.baitap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
    }

    private void checkSize() {
        if (size == elements.length) {
            ensureCapa();
        }
    }

    void add(int index, E element) {
        checkIndex(index);
        checkSize();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        checkSize();
        elements[size++] = e;
    }

    public E get(int i) {
        checkIndex(i);
        return (E) elements[i];
    }

    public int getLength() {
        return elements.length;
    }

    public void disPlay() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + "  ");
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E elementRemove = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return elementRemove;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++)
            if (element.equals(elements[i]))
                return true;
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++)
            if (element.equals(elements[i])) return i;
        return -1;
    }
//    public E clone(){
//        Object elementsClone[]=new Object[getLength()];
//        for (int i=0; i<size; i++){
//            elementsClone[i]=elements[i];
//        }
//       return (E) elementsClone;
//    }
}
