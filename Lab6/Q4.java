package Lab6;
public class Q4<E> {
    public void concatenating(DoublyLinkedList m,DoublyLinkedList n){
        while(!m.isEmpty()){
            n.addLast(m.removeFirst());  
        }
    } 
    
}
