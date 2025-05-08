package queues;

import staticStructure.StaticStructure;

public class MyQueue<T> extends StaticStructure<T> {

    public MyQueue(int capacity) {
        super(capacity);
    }

    public MyQueue() {
        super();
    }

    public void offer(T element) {
        this.add(element);
    }

    public T poll() {
        if (isEmpty()) return null;

        T element = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }

    public T peek() {
        if (isEmpty()) return null;

        return elements[0];
    }
}
