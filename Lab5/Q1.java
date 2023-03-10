package Lab5;
import lab5.CircularlyLinkedList;
public class Q1 {
       public void addFirst( E m) {
    Node<E> all = new Node<>(m, null); 
    if (isEmpty())  
        head = all;
    else { 
        all.setNext(head);
        head = all;       
    }
    size++;   
} 
}
