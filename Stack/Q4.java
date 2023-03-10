package Stack;
import java.util.*;
public class Q4 {
    public static void clone(ArrayStack array){
        ArrayStack m = new ArrayStack(3);
        while(!array.isEmpty()){
            
            m.push(array.pop());
        }    
        while(!m.isEmpty()){
            m.pop() ;
        }    
        
    }
}
