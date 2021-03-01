package _10_dsa_stack_queue.thuchanh;

public class MyQueueOptional {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueueOptional(int queueSize) {
        this.capacity = queueSize;
        queueArr=new int[this.capacity];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
//            if (tail == capacity - 1) {
//                tail = 0;
//            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }
    public int deQueue(){
        if(isQueueEmpty()){
            System.out.println("Underflow ! Unable to remove element from Queue");
            return 0;
        }else{
            int temp=queueArr[head];
            for(int i=head; i<tail; i++){
                queueArr[i]=queueArr[i+1];
            }
            currentSize--;
            tail=currentSize-1;
            return temp;
        }
    }
    public void disPlay(){
        for (int i=head; i<=tail;i++){
            System.out.println(queueArr[i]);
        }
    }

    public static void main(String[] args) {
        MyQueueOptional queue=new MyQueueOptional(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.disPlay();
        queue.deQueue();
        queue.enqueue(4);
        System.out.println("-----");
        queue.disPlay();
    }
}

