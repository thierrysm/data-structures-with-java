package arrays;

import java.util.NoSuchElementException;

public class MyArray<T> {
    private T[] elements;
    private int size = 0;

    public MyArray(int capacity) {
        this.elements = (T[])new Object[capacity];
    }

    public void add(T element) {
        increaseCapacity();
        if (this.size < elements.length) {
            elements[size] = element;
            size++;
        }
    }

    public void add(int position, T element) {
        if (position < 0 || position > size) throw new RuntimeException("Invalid position");
        increaseCapacity();
        for (int i = size; i > position; i--) {
            elements[i] = elements[i - 1];
        }
        elements[position] = element;
        size++;
    }

    public void remove(int position) {
        if (position >= 0 && position < size) {
            for (int i = position; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
        } else {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
    }

    public T get(int position) {
        if (position < size && position >= 0) {
            return this.elements[position];
        }
        else {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
    }

    public T get(T value) {
        for (T element : elements) {
            if (element != null && element.equals(value)) {
                return element;
            }
        }
        throw new RuntimeException("value not found");
    }

    public int getSize() {
        return this.size;
    }

    private void increaseCapacity() {
        if (this.size == elements.length) {
            T[] newArray =(T[]) new Object[(elements.length * 3)/2 + 1];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) return true;
        }
        return false;
    }

    public T getLast() {
        if (size == 0) throw new NoSuchElementException("array is empty");
        return elements[size - 1];
    }

    public void clear() {
        for (int i=0; i<elements.length; i++) {
            this.elements[i] = null;
        }
        this.size = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i=0; i<this.size-1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.size>0) s.append(this.elements[this.size-1]);

        s.append("]");

        return s.toString();
    }
}
