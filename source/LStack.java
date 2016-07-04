package source;

import interfaces.Stack;

public class LStack<E> implements Stack<E> {
    
    private Node<E> head;
    private int size;
    
    public LStack() {
        this.head = new Node<E>();
        this.size = 0;
    }
    
    @Override
    public void push(E e) {
        this.head.next = new Node<E>(e);
        this.size++;
    }

    @Override
    public E pop() {
        E result = this.head.item;
        this.head = this.head.next;
        this.size--;
        return result;
    }

    @Override
    public E peek() {
        return this.head.item;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }
    
    public String toString() {
        Node<E> temp = this.head;
        String str = "";
        while(temp.next != null) 
            str += temp.item + " ";
        return str;
    }

}
