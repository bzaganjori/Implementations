package source;

import interfaces.ArrayList;

public class LArrayList<E> implements ArrayList<E> {

    public Node<E> head;
    public int size;

    /**
     * Constructor method.
     */
    public LArrayList() {
        this.head = null;
        this.size = 0;
    }
    
    /**
     * toString method for debugging.
     * @return string of all elements
     */
    @Override
    public String toString() {
        String str = "";
        Node<E> temp = this.head;
        while (temp != null) {
            if (temp.item == null) str += "null ";
            else str += temp.item + " ";
            temp = temp.next;
        }
        return str;
    }

    /**
     * O(1) runtime.
     * @return - class variable value
     */
    @Override
    public int size() {
        return this.size;
    }

    /** 
     * O(1) runtime.
     * @return - check if size is 0.
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /** 
     * O(n) runtime. It could insert at the front or at the end, where the worst
     * case would be traversal over n elements.
     * @param i - specified index for insertion
     * @param e - element to be inserted.
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > this.size)
            throw new IndexOutOfBoundsException();
        if (this.head == null) this.head = new Node<E>(e);
        else {
            Node<E> current = this.head;
            while (current.next != null) 
                current = current.next;
            current.next = new Node<E>(e);
        }
        this.size++;
    }

    /** 
     * O(n) runtime. Traverse through the list till we arrive at the needed
     * element. Array implementation would win in this case as we do not have
     * to traverse over the whole list.
     * @param i - index of element
     * @return - element without removal
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > this.size)
            throw new IndexOutOfBoundsException();
        Node<E> temp = this.head;
        for (int j = 0; j < i; j++)
            temp = temp.next;
        return temp.item;
    }

    /** 
     * O(n) runtime. Traverse through the list till we arrive at specified
     * index.
     * @param i - specified index
     * @return - return removed element
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > this.size)
            throw new IndexOutOfBoundsException();
        Node<E> temp = this.head;
        for (int j = 0; j < i - 1; j++)
            temp = temp.next;
        E element = temp.item;
        temp.next = temp.next.next;
        this.size--;
        return element;
    }

    /** 
     * O(n) runtime. Traverse through the list till we arrive at specified
     * index. Array implementation is better since we can specify set instead of
     * traversing across the whole list.
     * @param i - specified index
     * @param e - replacement element
     * @return - replaced element
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > this.size)
            throw new IndexOutOfBoundsException();
        Node<E> temp = this.head;
        for (int j = 0; j < i; j++)
            temp = temp.next;
        E element = temp.item;
        temp.item = e;
        return element;
    }

}
