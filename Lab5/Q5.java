package Lab5;
import lab5.CircularlyLinkedList;
public class Q5 {
    private static class Node<E> { 
    private Node<E> next;
    private Node<E> head;
    private E element; 

    public Node(E m, Node<E> n, Node<E>h ) { 
      element = m; 
      next = n; 
      head = h;
    }
    }
    public static void list(CircularlyLinkedList<E> L){
    if(L.size()== (2%0)){
        CircularlyLinkedList L1 = new CircularlyLinkedList();
        CircularlyLinkedList L2 = new CircularlyLinkedList();

    }
    }



while (current != null) {
    // Add the current node to list 1 
    L1.add(current);

    // Move the pointer to the next node in the original list 
    current = current.next;

    // If there is another node, add it to list 2 
    if (current != null) {
        L2.add(current);

        // Move the pointer to the next node in the original list 
        current = current.next;    
    }  
}    
}
