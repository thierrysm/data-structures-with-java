package linkedList;

public class MyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        if (size == 0) {
            this.first = node;
        } else {
            this.last.setNext(node);
            size++;
        }
        size++;
        this.last = node;
    }

    public void add(int position, T data) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("invalid position: " + position);
        }

        if (position == 0) {
            addFirst(data);
        } else if (position == size) {
            addLast(data);
        } else {
            Node<T> prevNode = this.first;
            for (int i = 0; i < position - 1; i++) {
                prevNode = prevNode.getNext();
            }
            Node<T> newNode = new Node<>(data, prevNode.getNext());
            prevNode.setNext(newNode);
            size++;
        }
    }

    public void addFirst(T data) {
        this.first = new Node<>(data, first);
    }

    public Node<T> get(int position) {
        if (position < 0 || position >= this.size) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        Node<T> current = this.first;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }

        return current;
    }

    public int get(T data) {
        Node<T> current = this.first;
        for (int i = 0; i < size; i++) {
            if (current.getData() != null && current.getData().equals(data)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    public T removeFirst() {
        if (this.size == 0) {throw new IllegalStateException("list is empty");}

        T removed = this.first.getData();
        this.first = first.getNext();
        size--;

        if (size == 0){last = null;}
        return removed;
    }

    public T removeLast() {
        if (this.size == 0) {
            throw new IllegalStateException("List is empty");
        }

        T removed = this.last.getData();

        if (size == 1) {
            this.first = null;
            this.last = null;
        } else {
            Node<T> current = this.first;
            while (current.getNext() != this.last) {
                current = current.getNext();
            }
            current.setNext(null);
            this.last = current;
        }

        size--;
        return removed;
    }

    public T remove(int position) {
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        if (position == 0) {
            return removeFirst();
        }

        if (position == size - 1) {
            return removeLast();
        }

        Node<T> prevNode = this.first;
        for (int i = 0; i < position - 1; i++) {
            prevNode = prevNode.getNext();
        }

        Node<T> removed = prevNode.getNext();
        T removedValue = removed.getData();
        prevNode.setNext(removed.getNext());
        removed = null;
        size--;

        return removedValue;
    }

    public void clear() {
        Node<T> current = this.first;
        while (current != null) {
            Node<T> next = current.getNext();
            current.setData(null);
            current.setNext(null);
            current = next;
        }
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyLinkedList{[");

        Node<T> current = first;
        while (current != null) {
            sb.append(current.getData());
            current = current.getNext();
            if (current != null) {
                sb.append(" -> ");
            }
        }

        sb.append("]}");
        return sb.toString();
    }
}
