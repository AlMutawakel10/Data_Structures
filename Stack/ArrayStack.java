package Stack;
public class ArrayStack <E> implements Stack<E>{

    
    private int t=-1;
    static final int cabacity=15;
    private E[] data;
    public ArrayStack(int c){
        data=(E[])new Object[c];
    }
    public ArrayStack(){
        this(cabacity);
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public void push(E e) {
        if(size()==data.length)
            throw new IllegalStateException("The stack is full");
        t++;
        data[t]=e;
    }

    @Override
    public E top() {
        if(isEmpty())return null;
                return data[t];    }

    @Override
    public E pop() {
        if(isEmpty())return null;
        E del=data[t];
        data[t]=null;
        t--;
        return del;
        
    }
    
    public void clone(ArrayStack array){
        ArrayStack S = new ArrayStack();
        while(!array.isEmpty())
            S.push(array.pop());
        while(!S.isEmpty())
            S.pop();
    }
    
}
