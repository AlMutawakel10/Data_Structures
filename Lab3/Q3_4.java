    /* Concatenate two arrays to new array */
package Lab3;
import java.util.Arrays;
public class Q3_4 {
    public static void main(String[] args) {
        int al1 [] = {1,2,3,4,5};
        int al2 [] = {6,7,8,9,10};
        int al3 [] = new int [al1.length + al2.length];
        for (int i=0; i<al1.length; i++)
            al3 [i] =al1[i];
        for (int i=0; i<al2.length; i++)
        al3 [(al2.length) + i] = al2[i];
        System.out.println(Arrays.toString(al3));
        
        
        /* Equivalence Testing with Arrays */
        boolean check = false ;
        if (al1.length==al2.length){
        for ( int i=0; i<al1.length; i++){
        if (al1[i]==al2[i])
            check=true;
        else 
            check=false;
        }
        String Answer=(check==true)? "The Arrays is Equivalence" : "" + "The al1 & al2 is not Equivalence";
            System.out.println(Answer);
        }
        else 
            System.out.println("The al1 & al2 is not Equivalence");
    }
}
