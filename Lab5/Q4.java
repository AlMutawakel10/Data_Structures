package Lab5;
public class Q4 {
        private static class Node<E> { 
    private E element; 
    private Node<E> next; 

    public Node(E m, Node<E> n) { 
      element = m; 
      next = n; 
    }
 

boolean sameSequence(Node L, Node M) { 
    Node lPtr = L; 
    Node mPtr = M; 

    while (lPtr != null && mPtr != null) { 
        if (lPtr.element != mPtr.element) { 
            return false; 
        }

        lPtr = lPtr.next; 
        mPtr = mPtr.next;  

        // If we reach the end of one list before the other, they are not the same sequence  
        if ((lPtr == null && mPtr != null) || (lPtr != null && mPtr == null)) {  
            return false;  
        }  

    }  

    // If we reach here, both lists have the same sequence of elements  
    return true;   
}
    }
}
