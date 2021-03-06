package program22_01;

public class Queue {

    public Queue() {
        size = 100;
        list = new Node[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public Queue(int s) {
        size = s;
        list = new Node[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public void enqueue(Node c) {

        if (!isFull()) {
            back = (back + 1) % size;
            list[back] = c;
            count++;
        }

    }

    public void dequeue() {

        if (count != 0) {
            front = (front + 1) % size;
            count--;
        }

    }

    private boolean isFull() {

        return (count == size);
    }

    public Node getFront() {
        if (!isEmpty()) {
            return list[front];
        } else {
            return null;
        }

    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void print() {
        
        for(int i =0 ; i < count; i++){
            System.out.println(list[(front+i)%size]);
        }

    }

    public void clear() {
        front = 0;
        back = size - 1;
        count = 0;

    }

    private Node[] list;
    private int size;
    private int count;
    private int front, back;
}
