
package Lab2;
    import java.util.ArrayList;
    import java.util.Random;
    
public class Q3 {
    public ArrayList<String> foods=new ArrayList<> ();
    {
    foods.add("Pizza");
    foods.add("Rice");
    foods.add("Chicken");
    foods.add("Rice");
    }
    
    public String removeentry() {
    int size=foods.size();
    Random rn=new  Random();
    int a=rn.nextInt(size);
    
        System.out.println(foods.get(a));
        foods.remove(a);
        a=a-1;
        
        System.out.println(foods.get(a));
        foods.remove(a);
        a=a-1;
        
        System.out.println(foods.get(a));
        foods.remove(a);
        
        System.out.println(foods.get(a));
        foods.remove(a);
        return "Done";
    }
}
