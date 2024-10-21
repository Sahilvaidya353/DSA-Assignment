package Assignment2;

public class CircularQueue {
    private int capacity;
    private int[] queue;
    private int front;
    private int rear;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    public void initialize() {
        front = -1;
        rear = -1;
        queue = new int[capacity];
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void insert(int num) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot insert " + num);
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = num;
    }

    public Integer delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot delete.");
            return null;
        }

        int removed = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}
