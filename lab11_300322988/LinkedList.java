

public class LinkedList<E> {
  
    //doubly linked nodes (static nested class) 
    private static class Node<E> {
    
        private E value;
    
        private Node<E> previous;
        private Node<E> next;
    
        private Node( E value, Node<E> previous, Node<E> next ) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
  
    // Instance variables
    private Node<E> head;
    private int size;
  
    /** Constructor for creating a new linked list.
     */
    public LinkedList() {
    
        // the empty list using a dummy node
        head = new Node<E>( null, null, null );
        head.next = head.previous = head;
        size = 0;
    }
  
    
    //  Instance methods
  
    /** 
     * Returns the number of elements currently stored in this list.
     *
     * @return the number of elements of this list.
     */
    public int size() {
        return size;
    }// End of size
  
    /**
     * Returns true if this list is empty
     *
     * @return true if this list is empty
     */
  
    public boolean isEmpty() {
        return size == 0;
    }// End of isEmpty
  
    /** 
     * Adds an element at the end of the list.
     *
     * @throws IllegalArgumentException if elem is null.
     */
    public boolean addLast( E elem ) {
    
        if ( elem == null ) {
            throw new IllegalArgumentException( "null" );
        }
    
        Node<E> before = head.previous;
        Node<E> after = head;
    
        before.next = new Node<E>( elem, before, after );
        after.previous = before.next;
    
        size++;
    
        return true;
    }// End of addLast
  
    /** 
     * Adds an element at the start of the list.
     *
     * @throws IllegalArgumentException if elem is null.
     */
    public boolean addFirst( E elem ) {
    
        if ( elem == null ) {
            throw new IllegalArgumentException( "null" );
        }
    
        Node<E> before = head;
        Node<E> after = head.next;
    
        before.next = new Node<E>( elem, before, after );
        after.previous = before.next;
    
        size++;
    
        return true;
    }// End of addFirst
  
    /** 
     * Returns the element at the specified index; the first
     * element has the index 0.
     *
     * @return the element at the specified index.
     * @throws IndexOutOfBoundsException if index is out of range (index < 0 || index >= size()). 
     */
  
    public E get( int index ) {
    
        if ( index < 0 || index > (size-1) ) {
            throw new IndexOutOfBoundsException( Integer.toString( index ) );
        }
    
        Node<E> p = head.next;
    
        for ( int i=0; i<index; i++ ) {
            p = p.next;
        }
    
        return p.value; 
    }// End of get
    
    
    /** 
     * remove instance method 
     */
    public LinkedList<E> remove( int fromIndex, int toIndex ) {
        // Create a new instance of LinkedList to store the removed elements
        LinkedList<E> removedElements = new LinkedList<>();
        
        if (fromIndex < 0 || fromIndex >= size() || toIndex < 0 || toIndex > size() || fromIndex >= toIndex) {
            throw new IndexOutOfBoundsException("Invalid index range");
        }
        
        // Find the start node to remove
        Node<E> startNode = head.next;
        for (int i = 0; i < fromIndex; i++) {
            startNode = startNode.next;
        }

        // Find the end node to remove
        Node<E> endNode = startNode;
        for (int i = fromIndex; i < toIndex; i++) {
            endNode = endNode.next;
        }

        // Update references of the previous and next nodes
        Node<E> beforeStart = startNode.previous;
        Node<E> afterEnd = endNode.next;
        beforeStart.next = afterEnd;
        afterEnd.previous = beforeStart;

        // Clear the references of startNode and endNode from the original list
        startNode.previous = null;
        endNode.next = null;

        // Add the removed elements to the new list
        removedElements.head.next = startNode;
        startNode.previous = removedElements.head;
        removedElements.head.previous = endNode;
        endNode.next = removedElements.head;

        // Update the sizes of the original and new lists
        removedElements.size = toIndex - fromIndex;
        size -= removedElements.size;

        // Return the new list containing the removed elements
        return removedElements;
    } // End of remove

   
    //  toString instance method
    public String toString() {
        StringBuffer input = new StringBuffer( "[" );
        Node<E> p = head.next;
        while ( p != head ) {
            if ( p != head.next ) {
                input.append( "," );
            }
            input.append( p.value );
            p = p.next;
        }
        input.append( "]" );
        return input.toString();
   }// End of toString
  
} // End of  LinkedList