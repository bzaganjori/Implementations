package source;

import interfaces.Tree;

public class BinaryTree<E extends Comparable<E>> implements Tree<E> {
    
    private BTreeNode<E> root;
    private int size;

    /**
     * Constructor method.
     */
    public BinaryTree() {
        this.root = null;
        this.size = 0;
    }
    
    /**
     * Constructor method with specified element.
     * @param e 
     */
    public BinaryTree(E e) {
        this.root = new BTreeNode(e, null, null);
        this.size = 1;
    }
    
    /**
     * Add new element to tree.
     * @param e 
     */
    @Override
    public void add(E e) {
        root.insert(e);
        this.size++;
    }

    /**
     * Return true if value is contained within tree, false otherwise.
     * @param e
     * @return 
     */
    @Override
    public boolean contains(E e) {
        return false;
    }

    /**
     * Remove specified element in tree if it exists.
     * @param e 
     */
    @Override
    public void remove(E e) {

    }
    
    /**
     * Return number of elements in the tree.
     * @return 
     */
    public int size() {
        return this.size;
    }
    
    /**
     * Return true if tree is empty, false otherwise.
     * @return 
     */
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    /** 
     * Return in-order traversal of elements.
     * @return 
     */
    public String inOrderTraversal() {
        return null;
    }
    
    /** 
     * Return post-order traversal of elements.
     * @return 
     */
    public String postOrderTraversal() {
        return null;
    }
    
    /**
     * Return breadth-first traversal of elements.
     * @return 
     */
    public String BreadthFirstTraversal() {
        return null;
    }
    
}
