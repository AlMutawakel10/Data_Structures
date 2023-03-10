package Lab4;
public class Q3 {
        public int size() {
        Node<Type> tmp = head;
        int size = 0;
        if (head == null) {
            return size;
        } 
        else {
        size++;
            while (tmp.next != null) {
            tmp = tmp.next;
            size++;
            }
        }
        return size;
}
}
