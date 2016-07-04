package source;

public class BTreeNode<E extends Comparable<E>> {
    
    private E element;
    private BTreeNode<E> left;
    private BTreeNode<E> right;
    
    /**
     * Constructor method.
     * @param element
     * @param left
     * @param right 
     */
    public BTreeNode(E element, BTreeNode<E> left, BTreeNode<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
    
    /**
     * Insert new element into tree depending on value.
     * @param e 
     */
    public void insert(E e) {
        if (this.element.compareTo(e) < 0) {
            if (this.right != null) this.right.insert(e);
            else this.right = new BTreeNode(e, null, null);
        } else {
            if (this.left != null) this.left.insert(e);
            else this.left = new BTreeNode(e, null, null);
        }
    }
    
    public E getElement() {
        return this.element;
    }
    
    public BTreeNode<E> getLeft() {
        return this.left;
    }
    
    public BTreeNode<E> getRight() {
        return this.right;
    }
    
    public void setElement(E e) {
        this.element = e;
    }

    public void setLeft(BTreeNode<E> left) {
        this.left = left;
    }
    
    public void setRight(BTreeNode<E> right) {
        this.right = right;
    }
    
}
