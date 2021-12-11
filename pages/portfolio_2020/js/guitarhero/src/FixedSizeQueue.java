/* *****************************************************************************
 *              ALL STUDENTS COMPLETE THESE SECTIONS
 * Title:            FixedSizeQueue
 * Files:            FixedSizeQueue.java,
 * 					 
 * Semester:         Spring 2020
 * 
 * Author:           Isabella MacDonald isma8011@colorado.edu
 * 
 * Description:		 A generic queue with a fixed capacity, implemented as a
 * 					 linked-list
 * 
 * Written:       	 3/13/2020
 * 
 * Credits:          Recitation
 **************************************************************************** */

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A generic Queue with a fixed capacity implemented via a linked-list 
 * following a FIFO policy. It would actually be more efficient to implement
 * this using an array (i.e., as a ring buffer), but we will implement it as 
 * a linked-list instead since the implementation is simpler. Re-implementing this
 * as a ring buffer would be a great exercise if you want to push yourself - if so, 
 * see the course slides as a reference.
 * 
 * @author Isabella MacDonald
 *
 * @param <T> The type of object that the FixedSizeQueue will hold
 */
public class FixedSizeQueue<T> implements Iterable<T>{

	/**
	 * Internal node class for the linked-list data structure
	 * @author Isabella MacDonald
	 *
	 */
	private class Node {
	    T value; // The data the node holds
	    Node next; // A pointer to the next node in the list (or null if this is the last node)

	    /**
		 * Create a new Node
		 * @param value The value this node should store
		 */
	    public Node(T value) {
	    	this.value = value;
	    	this.next = null;
	    }
	}
	
	// Instance data
	private Node head, tail; // Keep track of the first and last node in the list
	private int size, capacity; // Keep track of how many nodes are in the list and our total capacity
	
	/**
	 * Create a new FixedSizeQueue with a specified capacity
	 * 
	 * Pseudocode:
	 *  All you have to do here is set the capacity instance variable
	 * 
	 * @param capacity How many items this queue will be able to hold
	 */
	public FixedSizeQueue(int capacity)
	{
		this.capacity = capacity;
	}
	
	/**
	 * Get the number of nodes in the queue
	 * @return the number of nodes in the queue
	 */
	public int size()
	{
		return size;
	}
	
	/**
	 * Check if the queue is empty
	 * @return true if the queue is empty (has no nodes), false otherwise
	 */
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	/**
	 * Add a new node based on a given value to the end of the queue. 
	 * Psuedocode:
	 *     1. If the queue is already full (i.e., if the size equals the capacity):
	 *          A. Throw a new IllegalStateException with a helpful message (e.g., stating
	 *             that the queue is already full)
	 *             [if you are struggling, see the syntax in dequeue below for an example
	 *             of how to throw exceptions and provide a message]
	 *     2. If the list is currently empty:
	 *     		A. Create a new Node based on the passed in value
	 *     		B. Set your head and tail pointers to this new node
	 *     3. Else:
	 *     		A. Save the old tail pointer to a temporary variable
	 *     		B. Create a new Node based on the passed in value and set the tail
	 *     		   to be this new node
	 *     		C. Set the .next value of the temporary variable (which is equal to the 
	 *     		   node that used to be the tail node) to point to the new tail node
	 *     4. Increment the size counter
	 * (and/or see the lecture slides or your textbook page 151).
	 * 
	 * @param value The given value, which will be used to create a new node that is added 
	 * 			    to the end of the queue.
	 * 
	 * @throws IllegalStateException if the queue is already full (i.e., if the size equals
	 *                               the capacity)
	 */
	public void enqueue(T value)
	{
		//throw an exception if the queue can't hold any more
		if (size == capacity) throw new IllegalStateException("Error, queue is full");
		
		//tail and head hold same node if one size
		if (size == 0)
		{
			head = new Node(value);
			tail = head;
		}
		
		//set a temp value and change the tail value
		else
		{
			Node temp = tail;
			tail = new Node(value);
			temp.next = tail;
		}
	}
	
	/**
	 * Removes the first node in the list and returns its value.
	 * Pseudocode:
	 *     1. Create a temporary variable to store the head node
	 *     2. Set the head node to be the next node in the queue
	 *     3. Decrement the size counter
	 *     4. Return the value in the temporary variable that stores the
	 *     	  old head node
	 * (and/or see the lecture slides or page 151 of your textbook)
	 * 
	 * @throws NoSuchElementException if the list is empty
	 * @return The value of the first node in the list
	 */
	public T dequeue()
	{
		//throw exception if can't remove a node
		if (size == 0) throw new NoSuchElementException("Error - "
				+ "can't dequeue as the queue is empty!");
	
		//remove the "front" of the line and decrement size
		Node temp = head;
		head = head.next;
		size--;
		
		return temp.value;
	}
	
	/**
	 * Return the value of the first node in the queue without removing that node from the 
	 * queue.
	 * 
	 * Pseudocode:
	 *   1. Check if the queue is empty and, if so, throw a NoSuchElementException just as
	 *      in dequeue
	 *      
	 *   2. Return the value stored in the head node
	 * 
	 * @throws NoSuchElementException if the queue is empty
	 * @return The value of the first node in the queue
	 */
	public T peek()
	{
		if (isEmpty()) throw new NoSuchElementException ("The queue is empty.");
		
		//only need to  see the value, doesn't change it
		return head.value;
	}

	/**
	 * Get an iterator to be able to iterate through all the nodes in the queue.
	 * We will talk more about this in class next week. For now it is implemented for you.
	 * You don't need to change any of the code below.
	 */
	@Override
	public Iterator<T> iterator() 
	{
		return new ListIterator(); 
	}	
	
	/**
	 * Internal class to enable iteration through all nodes in the queue. We will talk
	 * about this more next week. For now, it is implemented for you. You don't need to
	 * change any of the code below.
	 * 
	 * @author Daniel Szafir
	 */
	private class ListIterator implements Iterator<T>
	{

		// The current node we are iterating over (start at the front of the queue)
		private Node current = head;
		
		// The Iterator methods
		public boolean hasNext() {  return current != null;  }
        public void remove()     {  /* not supported */      }      
        public T next()
        {
            T value = current.value;
            current = current.next; 
            return value;
        }

	}
}
