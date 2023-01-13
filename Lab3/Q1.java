    /* Cloning integer Arrays */
package Lab3;
public class Q1 {
    public static void main(String[] args) {
        int al1[]={1,2,3,4,5};
        int CopyArray[] = new int[al1.length];
        CopyArray=al1;
        System.out.println("Array Index = ");
        for (int i=0; i<al1.length; i++)
            System.out.print(al1[i] + " ");
        System.out.println(" The CopyArray Index");
        for(int i=0; i<CopyArray.length; i++)
            System.out.print(CopyArray [i] + " ");
    }
}
