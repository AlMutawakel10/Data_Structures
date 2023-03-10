package Lab4;
public class Q5 {
     
    node = L.header;
    while( node.getNext() != null ) {
        node = node.getNext();
    }
    node.setNext(M.header.getNext());
    L.size = L.size + M.size;
    return L;
    
}
