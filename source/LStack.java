package source;

import interfaces.Stack;

public class LStack<E> implements Stack<E> {
    
    private Node<E> head;
    private int size;
    
    public LStack() {
        this.head = null;
        this.size = 0;
    }
    
    @Override
    public void push(E e) {
        if (this.head == null)
            this.head = new Node<E>(e);
        else {
            Node<E> newItem = new Node<E>(e);
            newItem.next = this.head;
            this.head = newItem;
        }
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
        while(temp != null) {
            str += temp.item + " ";
            temp = temp.next;
        }
        return str;
    }

}
