package Lab5;
public class Q3 {
       public boolean equals(CircularlyLinkedList<E> List1,CircularlyLinkedList<E> List2) {
    if (List1.size() != List2.size()) {
        return false;
    }

    Node<E> al1 = List1.head;
    Node<E> al2 = List2.head;

    while (al1 != null) {
        if (!al1.getElement().equals(al2.getElement())) {
            return false;
        }

        al1 = al1.getNext();
        al2 = al2.getNext();
    }

    return true;
}
}
