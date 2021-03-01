package _10_dsa_stack_queue.thuchanh;

public class MyStackOptional {
    private int capacity;
    private int[] stackArr;
    private int size = 0;

    public MyStackOptional(int capacity) {
        this.capacity = capacity;
        stackArr = new int[this.capacity];
    }

    public boolean isFull() {
        if (this.size == this.capacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("OverFlower: Do not push element");
        } else {
            size++;
            stackArr[size - 1] = element;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("OverUnder: Do not pop element");
            return 0;
        } else {
            int temp = stackArr[size - 1];
            stackArr[size - 1] = 0;
            size--;
            return temp;
        }
    }

    public void disPlay() {
        if (isEmpty()) {
            System.out.println("stack is null");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(stackArr[i] + "  ");
            }
        }
    }

    public static void main(String[] args) {
        MyStackOptional list = new MyStackOptional(4);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.pop();
        System.out.println(list.pop());
        list.disPlay();
    }
}
