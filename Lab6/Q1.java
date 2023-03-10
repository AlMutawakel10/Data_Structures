package Lab6;
public class Q1<E> extends DoublyLinkedList {
     public Node<E> middle(){
        if(header.getNext()==null) return null;
        Node<E> m = header;
        Node<E> n = trailer;
        Node<E> midd = null;
        while (m.getNext()!=null) { 
                m=m.getNext();
                n=n.getPrev();
                if(m==n)midd= n;
                else if(m.getNext()==n&&n.getPrev()==m)
                    midd= n;   
        }
        System.out.println(midd.getElement());  
        return null;
    }
    public static void main(String[] args) {
        Q1<Integer> a=new Q1();
        a.addFirst(10);
        a.addFirst(10);
        a.addFirst(20);
        a.addFirst(30);
        a.addFirst(40);
        a.addFirst(50);
        a.middle();

    }
}
