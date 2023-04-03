public class ha1q5
{



    
    public static void main(String[] args) 
    {
        //swapping the values of four variables without using a temporary variable
        int w = 1;
        int g = 2;
        int k = 3;
        int a = 4;
        System.out.println("The values of w,g,k,a before swapping are "+w+", "+g+", "+k+" & "+a+" respectively.");

        //w--g
        w = w+g;
        g = w-g;
        w = w-g;

        //g--k
        g = g+k;
        k = g-k;
        g = g-k;

        //k--a
        k = k+a;
        a = k-a;
        k = k-a;

        //g--w
        g = g+w;
        w = g-w;
        g = g-w;

        
        System.out.println("The values of w,g,k,a after swapping are "+w+", "+g+", "+k+" & "+a+" respectively.");

        //The temp. variable method is written as a seperate method and will be called here.
        System.out.println("Using a temporary varible.");
        swap();
    }
    static void swap()
    {
        //swapping the values of four variables  using a temporary variable
        int w = 1;
        int g = 2;
        int k = 3;
        int a = 4;
        int z;
        System.out.println("The values of w,g,k,a before swapping are "+w+", "+g+", "+k+" & "+a+" respectively.");

        //w--g
        z = w;
        w = g;
        g = z;

        //g--k
        z = g;
        g = k;
        k = z;

        //k--a
        z = k;
        k = a;
        a = z;

        //g--w
        z = g;
        g = w;
        w = z;

        
        System.out.println("The values of w,g,k,a after swapping are "+w+", "+g+", "+k+" & "+a+" respectively.");
    }
}