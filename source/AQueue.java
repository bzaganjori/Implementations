package source;

import interfaces.Queue;

public class AQueue<E> implements Queue<E> {

    public E[] array;
    public int front;
    public int rear;
    public int size;

    /**
     * Constructor method
     */
    public AQueue() {
        this.array = (E[]) new Object[2];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    /** 
     * Constructor method with specified size
     * @param size - specified size
     */
    public AQueue(int size) {
        this.array = (E[]) new Object[size];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    /**
     * Resize method when queue is at capacity.
     */
    private void resize() {
        E[] newArray = (E[]) new Object[this.array.length * 2];
        for (int i = 0; i < this.size; i++)
            newArray[i] = this.array[(this.front + i) % this.array.length];
        this.array = newArray;
        this.front = 0;
        this.rear = this.size;
    }

    /**
     * toString method for debugging purposes.
     * @return 
     */
    @Override
    public String toString() {
        String str = "";
        for (E array1 : this.array) {
            if (array1 == null) str += array1 + " ";
            else str += array1 + " ";
        }
        return str;
    }

    /** O(n) runtime during worst case (when queue needs to be copied). At most
     * other times, it has a runtime of O(1), insertion at the tail.
     * @param e - element to be inserted at end of queue.
     */
    @Override
    public void enqueue(E e) {
        if (this.size == this.array.length)
            resize();
        this.array[this.rear] = e;
        this.rear = (this.rear + 1) % this.array.length;
        this.size++;
    }

    /** O(1) runtime. Remove first element in the queue. Array and LL impl. 
     * equally as good.
     * @return - element removed
     * @throws EmptyQueueException 
     */
    @Override
    public E dequeue() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException("empty queue.");
        E item = array[this.front];
        array[this.front] = null;
        this.front = (this.front + 1) % this.array.length;
        this.size--;
        return item;
    }

    /**
     * O(1) runtime. Array and LL impl. equally as good.
     * @return - first element without removal
     * @throws EmptyQueueException 
     */
    @Override
    public E front() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException("empty queue.");
        return this.array[front];
    }

    /** 
     * @return class variable value
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * @return if queue is empty
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

}
