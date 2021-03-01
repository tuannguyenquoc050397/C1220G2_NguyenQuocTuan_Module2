package _10_dsa_stack_queue.baitap;

import _10_dsa_stack_queue.thuchanh.MyLinkedListQueue;

public class MyQueue {
    private Node front;
    private Node rear;
    private int size = 0;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public class Node {
        public int data;
        public Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }

    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            size++;
        } else {
            this.rear.link = newNode;
            this.rear = newNode;
            this.rear.link = this.front;
            size++;
        }
    }

    public Node deQueue() {
        if (this.front == null) {
            return null;
        } else if (this.front == this.rear) {
            Node node = this.front;
            this.front = this.rear = null;
            size--;
            return node;
        } else {
            Node node = this.front;
            this.front = this.front.link;
            this.rear.link = this.front;
            size--;
            return node;
        }
    }

    public int getSize() {
        return size;
    }

    public void disPlay() {
        Node temp = this.front;
        if (this.front != null) {
            for (int i = 0; i < size; i++) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        } else {
            System.out.println("null");
        }
    }
}
