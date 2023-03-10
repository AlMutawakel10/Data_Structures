package Lab5;
//import Lab_Four.SinglyLinkedList.*;
public class Q2 {
     private static class Node<E> { 
    private E element; 
    private Node<E> next; 

    public Node(E m, Node<E> n) { 
      element = m; 
      next = n; 
    } 
    public int size() {
    int count = 0;
    Node current = head;

    if (head == null) {
        return 0;
    } else {
        do {
            count++; 
            current = current.getNext(); 
        } while (current != head); 

        return count; 
    } 
}
}
