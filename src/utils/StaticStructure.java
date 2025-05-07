package utils;

public class StaticStructure<T> {
    protected T[] elements;
    protected int size = 0;

    @SuppressWarnings("unchecked")
    public StaticStructure(int capacity) {
        this.elements = (T[])new Object[capacity];
    }

    public StaticStructure(){
        this.size = 10;
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

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    protected void increaseCapacity() {
        if (this.size == elements.length) {
            T[] newArray =(T[]) new Object[(elements.length * 3)/2 + 1];
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
