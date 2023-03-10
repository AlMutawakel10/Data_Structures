package Lab6;
public class Q2<E> extends DoublyLinkedList {

    public int size() { 
        int i=0;
        Node<E>test=header;
        while(test.getNext()!=null){
            test=test.getNext();
            i++;}
        return i;
}
    
}
