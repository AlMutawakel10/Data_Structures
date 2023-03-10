package Lab4;
public class Q4 {
        public void rotate() { 
		if(this.size==0 || this.size==1) { 
			return;
		}
		// Make circular
		tail.setNext(this.head);
		tail = tail.getNext();
		
		// Circular
		head = tail.getNext();

		// Break circle
		tail.setNext(null);

	}

}
