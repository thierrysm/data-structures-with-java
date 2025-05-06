package arrays;

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
        increaseCapacity();
        if (position < elements.length && position >= 0) {
            elements[position] = element;
        } else { throw new RuntimeException("invalid position"); }
    }

    public void remove(int position) {
        if (position >= 0 && position < size) {
            for (int i = position; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
        } else {
            throw new RuntimeException("Invalid position");
        }
    }

    public T get(int position) {
        if (position < size && position >= 0) {
            return this.elements[position];
        } else { throw new RuntimeException("invalid position"); }
    }

    public T getByValue(T value) {
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
            T[] newArray =(T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
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
