import java.util.Scanner;
public class la1q7
{
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the two values you want to swap :");
       int a = in.nextInt();
       int b = in.nextInt();
       in.close();
       System.out.println("The values of a and b before swapping are "+a+" and "+b+" respectively.");

       //swapping using a temporary variable.
       int z;
       z = a;
       a = b;
       b = z;
       System.out.println("The values of a and b after swapping are "+a+" and "+b+ " respectively.");
    }
}