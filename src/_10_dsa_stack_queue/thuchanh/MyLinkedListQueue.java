package _10_dsa_stack_queue.thuchanh;


public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    private int size = 0;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            size++;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
        size++;
    }

    public Node dequeue() {
        if (this.head == null) {
            size = 0;
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }

    public void disPlay() {
        Node temp = this.head;
       if(this.head!=null){
        for (int i = 0; i < size; i++) {
            System.out.println(temp.key);
            temp = temp.next;
        }
       }else{
           System.out.println("null");
       }
    }
}

