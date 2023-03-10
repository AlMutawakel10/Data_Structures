package Lab4;
public class Q1 {
        public boolean equals(Object m) {
        if (m == this) return true;
        if (!(m instanceof SinglyLinkedList)) return false;
        SinglyLinkedList list = (SinglyLinkedList) m; 
        if (list.size()!= m.size()) return false;
        Node al1 = this.head ; 
        Node al2 = list.head(); 
        while (al1 != null && al2!= null) {
        if (!al1.getElement( ).equals(al2.getElement( ))) return false; 
        al1 = al1.getNext( );
        al2 = al2.getNext( );
    }
        return true; 
 }
}
