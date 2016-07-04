package source;

import interfaces.Stack;

public class AStack<E> implements Stack<E> {

    private E[] array;
    private int size;

    /**
     * Constructor method.
     */
    public AStack() {
        this.array = (E[]) new Object[1];
        this.size = 0;
    }

    /**
     * Constructor method with specified array size.
     * @param size 
     */
    public AStack(int size) {
        this.array = (E[]) new Object[size];
        this.size = 0;
    }
    
    /**
     * Resize the array if more space is needed.
     * @param size 
     */
    private void resize(int size) {
        E[] newArray = (E[]) new Object[size];
        for (int i = 0; i < this.array.length; i++) 
            newArray[i] = this.array[i];
        this.array = newArray;
    }
    
    /**
     * toString method for debugging and output.
     * @return 
     */
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == null) str += "null ";
            else str += this.array[i] + " ";
        }
        return str;
    }

    /**
     * Add new element to the top of the stack.
     * @param e 
     */
    @Override
    public void push(E e) {
        if (this.array.length == this.array.length) 
            resize(this.array.length * 2);
        this.array[size++] = e;
    }

    /**
     * Pop element from the top of the list.
     * @return 
     */
    @Override
    public E pop() {
        E item = this.array[this.size];
        this.array[this.size] = null;
        this.size--;
        return item;
    }

    /**
     * Return, but do not remove top element of stack.
     * @return 
     */
    @Override
    public E peek() {
        return this.array[this.size - 1];
    }

    /**
     * Return true if list is empty, false otherwise.
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Return number of elements in the list.
     * @return 
     */
    @Override
    public int size() {
        return this.size;
    }

}
