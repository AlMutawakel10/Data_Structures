package Lab4;
public class Q2 {
      private void find(){ // 
        if(head != null){
           SinglyLinkedList.Node temp = head;
           while(temp.next != null){
               System.out.println(temp.next.getElement());
               temp = temp.next;
           }
        }
        else
        System.out.println("The Linked is Empty");
    }

}
