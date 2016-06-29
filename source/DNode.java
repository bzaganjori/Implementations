package source;

public class DNode<E> {

    private E item;
    private DNode<E> next;
    private DNode<E> prev;

    public DNode() {
        this.item = null;
        this.next = null;
        this.prev = null;
    }

    public DNode(E item) {
        this.item = item;
        this.next = null;
        this.prev = null;
    }

    public DNode(E item, DNode<E> next, DNode<E> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

}
