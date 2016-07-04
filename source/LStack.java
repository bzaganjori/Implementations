package source;

import interfaces.Stack;

public class LStack<E> implements Stack<E> {
    
    private Node<E> head;
    private int size;
    
    /**
     * Constructor method.
     */
    public LStack() {
        this.head = null;
        this.size = 0;
    }
    
    /**
     * Add new element to the top of the stack.
     * @param e 
     */
    @Override
    public void push(E e) {
        if (this.head == null)
            this.head = new Node(e);
        else {
            Node<E> newItem = new Node(e);
            newItem.next = this.head;
            this.head = newItem;
        }
        this.size++;
    }

    /**
     * Remove top element of the stack.
     * @return 
     */
    @Override
    public E pop() {
        E result = this.head.item;
        this.head = this.head.next;
        this.size--;
        return result;
    }

    /**
     * Return but do not remove top element of the stack.
     * @return 
     */
    @Override
    public E peek() {
        return this.head.item;
    }

    /**
     * Return true if stack is empty, false otherwise.
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /** 
     * Return size of the stack.
     * @return 
     */
    @Override
    public int size() {
        return this.size;
    }
    
    /**
     * toString method for debugging and output.
     * @return 
     */
    @Override
    public String toString() {
        Node<E> temp = this.head;
        String str = "";
        while(temp != null) {
            str += temp.item + " ";
            temp = temp.next;
        }
        return str;
    }

}
