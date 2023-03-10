package Lab6;
public class Q5<E> extends DoublyLinkedList<E>{

    public  Q5(){

        header = new Node<E>( null, null, null);

        trailer = new Node<>(null, header, header.getNext());
        header.getNext().setPrev(trailer);
    }
    
}
