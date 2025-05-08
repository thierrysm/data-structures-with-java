package queues.priority;

import queues.MyQueue;

public class MyPriorityQueue<T> extends MyQueue<T> {

    public MyPriorityQueue(int capacity) {
        super(capacity);
    }

    public MyPriorityQueue() {
        super();
    }

    public void add(T element) {
        Comparable<T> c = (Comparable<T>) element;
        int i;
        for (i = 0; i<this.size; i++) {
            if (c.compareTo(this.elements[i]) < 0) {
                break;
            }
        }
        this.add(i, element);
    }
}
