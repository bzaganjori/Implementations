package source;

import interfaces.ArrayList;

public class AArrayList<E> implements ArrayList<E> {

    private E[] array;
    private int size;

    /** 
     * Constructor method.
     */
    public AArrayList() {
        this.array = (E[]) new Object[1];
        this.size = 0;
    }
    
    /** 
     * Constructor method with specified size.
     * @param size - specified size of list
     * @throws IndexOutOfBoundsException 
     */
    public AArrayList(int size) throws IndexOutOfBoundsException {
        if (size <= 0) throw new IndexOutOfBoundsException("negative.");
        this.array = (E[]) new Object[size];
        this.size = 0;
    }

    /**
     * O(n) runtime. toString method for debugging purposes.
     * @return String of all elements.
     */
    @Override
    public String toString() {
        String str = "";
        for (E array1 : this.array) {
            if (array1 == null) str += "null ";
            else str += array1 + " ";
        }
        return str;
    }

    /** 
     * O(1) runtime. Return class variable value.
     * @return - Number of occupied spaces in the array.
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * O(1) runtime. Check if size is 0. 
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /** O(n) runtime. In the worst case, we will have to traverse 2n times if
     *  the array has to be expanded. 
     * @param i - specified index
     * @param e - new element to be inserted
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > this.array.length) 
            throw new IndexOutOfBoundsException();
        if (this.size == this.array.length) {
            E[] newArray = (E[]) new Object[this.array.length * 2];
            for (int j = 0; j < this.array.length; j++)
                newArray[j] = this.array[j];
            this.array = newArray;
        }
        for (int j = this.array.length - 1; j > i; j--) 
            this.array[j] = this.array[j - 1];
        this.array[i] = e;
        this.size++;
    }

    /** 
     * O(1) runtime. We have a specified index and we can grab the element at 
     * that index in one action. Provides an advantage over linked list impl.
     * as we can specified the index, thanks to array properties.
     * @param i - specified index
     * @return - element that index i
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > this.array.length)
            throw new IndexOutOfBoundsException();
        return this.array[i];
    }

    /** 
     * O(n) runtime. We have to remove the element and then shift over all
     * remaining elements to the left one space. In the worst case, we could 
     * remove at the start and have to move n-1 elements over.
     * @param i - specified index
     * @return - removed element
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > this.array.length)
            throw new IndexOutOfBoundsException();
        E temp = this.array[i];
        for (int j = i; j < this.array.length - 1; j++)
            array[j] = array[j + 1];
        this.size--;
        return temp;
    }

    /** 
     * O(1) runtime. We already have a specified index and we can change the 
     * element at that specified index with one action. The array impl. wins 
     * as we can specified the set point thanks to properties of arrays.
     * @param i - index in array
     * @param e - new element
     * @return - old element that was replaced at index i
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > this.array.length)
            throw new IndexOutOfBoundsException();
        E temp = this.array[i];
        this.array[i] = e;
        return temp;
    }

}
