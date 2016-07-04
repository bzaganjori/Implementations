package interfaces;

/** Simple tree interface. */
public interface Tree<E> {

    /** Add element to the tree. */
    public void add(E e);

    /** Return true if specified element is within the tree. */
    boolean contains(E e);

    /** Remove matching element. */
    void remove(E e);

}
