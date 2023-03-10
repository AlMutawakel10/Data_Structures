package Lab6;
public class Q3<E> {
    public boolean equals(DoublyLinkedList<E> al1,DoublyLinkedList<E> al2) {
    if (al1== al2) {
        return true;
    }
    if (al1== null || al1.getClass() != al2.getClass()) {
        return false;
    }
    DoublyLinkedList list = (DoublyLinkedList) al1;
    if (list.size() != al2.size()) {
        return false;
    }

    while (al1.header != null && al2.header != null) {
        if (al1.header.getElement() != al2.header.getElement()) {
            return false;
        }
        al2.header = al2.header.getNext();
        al1.header = al1.header.getNext();
    }
    return true;
}
    
}
