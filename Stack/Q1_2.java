package Stack;
public class Q1_2 {
    public static Stack<Integer> rev(Stack<Integer> m, Stack<Integer> n){
        while (!m.isEmpty()) {
            n.push(m.pop());
            
        }
        return n;
    }
    //Q2. Give a recursive method for removing all the elements from a stack.

    public static Stack<Integer> recursive(Stack<Integer> S){
        while (!S.isEmpty()) {
            S.pop();
        }
        return S;
    }
    
    public static void main(String[] args) {
        Stack<Integer> m=new Stack<>();
        Stack<Integer> n=new Stack<>();
        for (int i = 1; i <= 5; i++) {

            m.push(i); 

        }
        System.out.println("befor stack => "+m);
        
        System.out.println("after stack => "+rev(m,n)); 
        System.out.println("Stack after removing all the elements => "+recursive(m));
    }
}
