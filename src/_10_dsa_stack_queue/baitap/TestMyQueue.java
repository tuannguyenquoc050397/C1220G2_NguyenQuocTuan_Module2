package _10_dsa_stack_queue.baitap;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue listQueue = new MyQueue();
        listQueue.enQueue(1);
        listQueue.enQueue(2);
        listQueue.enQueue(3);
        listQueue.enQueue(4);
        listQueue.enQueue(5);
        listQueue.disPlay();
        listQueue.deQueue();
        listQueue.deQueue();
        System.out.println("------");
        listQueue.disPlay();
    }

}
