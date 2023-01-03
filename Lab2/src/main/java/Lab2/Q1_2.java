/* Write a Java method that Reverse an array using another array. */


package Lab2;
public class Q1_2 {

    public static void main(String[] args) {
       int al1[]=new int [5];
       int a=0;
       for (int i=0; i<5; i++)
       {
       al1 [i]=++a;
       }
       int al2[]=new int[5];
       int b=5;
       for (int i=0; i<5; i++)
       {
       al2 [i]=al1[--b];
       }
       System.out.println(" => The Results <= \n ");
        System.out.println(" array {1} ");
        for (int i=0; i<al1.length; i++)
        {
            System.out.println("array_1 [" +i+ "]="+al1[i]);
        }
        System.out.println(" \n array {2} ");
        for (int i=0; i<al2.length; i++)
        {
            System.out.println("array_2 [ " +i+ "]=" +al2[i]);
        }
        
        
        /* Write a Java method that Clone an array to a backup array. */
        
        int al3[]=new int [al2.length];
        for (int i=0; i<al3.length; i++)
        {
        al3[i]=al2[i];
        }
        System.out.println("\n array {3} ");
        for (int i=0; i<al2.length; i++)
        {
            System.out.println("array_3 [ " +i+ "]=" +al3[i]);
        }
    }
}