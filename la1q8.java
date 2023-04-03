
public class la1q8
{
    public static void main(String[] args) 
    {
        int a = 7;
        int b = 10;
        
       System.out.println("The values of a and b before swapping are "+a+" and "+b+" respectively.");

       //swapping without using temporary variable.
       
       a = a+b;//a=10+7=17
       b = a-b;//b=17-10=7
       a = a-b;//a=17-7=10
       System.out.println("The values of a and b after swapping are "+a+" and "+b+ " respectively.");
    }
}