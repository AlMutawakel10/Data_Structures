    /* Cloning Objects Arrays */
package Lab3;
public class Q2 {
    String name;
    int id;
    public Q2(String a, int b) {
    this.name = a;
    this.id = b;
    }
    @Override 
    public String toString(){
    return "{name : " + name + ",Id : " + id + "}";
    }
    public static void main(String[] args) {
        Q2[] al1 = new Q2 [2];
        al1 [0] = new Q2 ("Ali" , 501 );
        al1 [1] = new Q2 ("Mohammed" , 502 );
        Q2[] al2 = new Q2 [al1.length];
        al2 = al1;
        for (int i=0; i<al2.length; i++) {
            System.out.println(al2[i].toString());
        }
        
    }
}
