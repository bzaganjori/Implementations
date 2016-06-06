package interfaces;

import source.EmptyQueueException;

/** Simplified version of the java.util.Queue. */
public interface Queue<E> {
	
	/** Add an element e to the queue. */
	public void enqueue(E e);

	/** Remove the oldest element in the queue. */
	public E dequeue() throws EmptyQueueException;
	
	/** Return the element at the front of the queue but do not remove. */
	public E front() throws EmptyQueueException;
	
	/** Return the size of the queue. */
	public int size();
	
	/** Return true if queue is empty, false otherwise. */
	public boolean isEmpty();
}
