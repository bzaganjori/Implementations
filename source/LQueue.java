package source;

import interfaces.Queue;

public class LQueue<E> implements Queue<E> {

    public Node<E> head;
    public Node<E> tail;
    public int size;

    /**
     * Constructor method.
     */
    public LQueue() {
        this.head = null;
        this.tail = this.head;
        this.size = 0;
    }

    /**
     * toString method for debugging.
     * @return - string format of all elements.
     */
    @Override
    public String toString() {
        String str = "";
        Node<E> temp = this.head;
        while (temp != null) {
            str += temp.item + " ";
            temp = temp.next;
        }
        return str;
    }

    /**
     * O(1) runtime. Add element to the end of the queue.
     * Both the array and linked list implementations are a good choice.
     * @param e - element to be added
     */
    @Override
    public void enqueue(E e) {
        if (this.tail == null) {
            this.tail = new Node<E>(e);
            this.head = this.tail;
            this.size++;
        } else {
            this.tail.next = new Node<E>(e);
            this.tail = this.tail.next;
            this.size++;
        }
    }

    /** 
     * O(1) runtime. Remove element from the front of the list. Array and LL 
     * impl. equally as good.
     * @return - element removed
     * @throws EmptyQueueException 
     */
    @Override
    public E dequeue() throws EmptyQueueException {
        E temp = this.head.item;
        if (this.head.next != null)
            this.head = this.head.next;
        else
            this.head = null;
        this.size--;
        return temp;
    }

    /** 
     * O(1) runtime. Array and LL impl. equally as good.
     * @return - element at front without removal
     * @throws EmptyQueueException 
     */
    @Override
    public E front() throws EmptyQueueException {
        if (isEmpty()) 
            throw new EmptyQueueException("empty queue.");
        return this.head.item;
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
