import java.util.NoSuchElementException;

public class CircularQueue<E> implements Queue<E> {
    private static final int DEFAULT_CAPACITY = 100;
    private int front, rear, size;
    private Object[] elems;

    public CircularQueue(int capacity) {
        elems = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    private class CircularQueueIterator implements Iterator<E> {
        private int current = front;
        private int count = 0;

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E value = getElement(current);
            current = (current + 1) % elems.length;
            count++;
            return value;
        }

        public boolean hasNext() {
            return count < size;
        }
    }// End of CircularQueueIterator

    public Iterator<E> iterator() {
        return new CircularQueueIterator();
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(E value) {
        if (size == elems.length) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % elems.length;
        setElement(rear, value);
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        E save = getElement(front);
        setElement(front, null);
        size--;
        front = (front + 1) % elems.length;
        return save;
    }

    @SuppressWarnings("unchecked")
    private E getElement(int index) {
        return (E) elems[index];
    }

    private void setElement(int index, E value) {
        elems[index] = value;
    }

    public String toString() {
        StringBuffer str = new StringBuffer("[");
        if (size > 0) {
            int offset = 0;
            str.append(getElement(front));
            offset = offset + 1;

            while (offset < size) {
                str.append(", ");
                str.append(getElement((front + offset) % elems.length));
                offset = offset + 1;
            }
        }
        str.append("]");
        return str.toString();
    }
}// End of CircularQueue