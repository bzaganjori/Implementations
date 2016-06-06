package source;

public class Node<E> {

    public E item;
    public Node<E> next;

    public Node() {
        this.item = null;
        this.next = null;
    }

    public Node(E item) {
        this.item = item;
        this.next = null;
    }

    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }

}
