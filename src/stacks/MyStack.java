package stacks;

import utils.StaticStructure;

public class MyStack<T> extends StaticStructure<T> {

    public MyStack(int capacity) {
        super(capacity);
    }

    public MyStack() {
        super();
    }

    public void push(T element) {
        super.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        T element = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }
}
