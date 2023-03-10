package Lab6;
public class Q6 {
     public void clone(DoublyLinkedList m){
        DoublyLinkedList n=new DoublyLinkedList();
        m.header=m.header.getNext();
        while(m.header!=null){
            n.addLast(m.header.getNext());
            m.header=m.header.getNext();

        }
    }

}
