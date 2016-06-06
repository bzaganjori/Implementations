package interfaces;

/** Simplified version of the java.util.Stack. */
public interface Stack<E> {
	
	/** Push an element e, to the top of the stack. */
	public void push(E e);
	
	/** Pop the element from the top of the stack and return. */
	public E pop();
	
	/** Return element at the top of the stack without removing. */
	public E peek();
	
	/** Return true if stack is empty, false otherwise. */
	public boolean isEmpty();
	
        /** Return the size of the occupied stack. */
	public int size();
	
}
