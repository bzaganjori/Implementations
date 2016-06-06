package source;

import interfaces.Stack;

public class AStack<E> implements Stack<E> {

    E[] array;
    int size;

    public AStack() {
        this.array = (E[]) new Object[1];
        this.size = 0;
    }

    public AStack(int size) {
        this.array = (E[]) new Object[size];
        this.size = 0;
    }
    
    private void resize(int size) {
        E[] newArray = (E[]) new Object[size];
        for (int i = 0; i < this.array.length; i++) 
            newArray[i] = this.array[i];
        this.array = newArray;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == null) str += "null ";
            else str += this.array[i] + " ";
        }
        return str;
    }

    @Override
    public void push(E e) {
        if (this.array.length == this.array.length) 
            resize(this.array.length * 2);
        this.array[size++] = e;
    }

    @Override
    public E pop() {
        E item = this.array[this.size];
        this.array[this.size] = null;
        this.size--;
        return item;
    }

    @Override
    public E peek() {
        return this.array[this.size - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

}
