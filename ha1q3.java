public class ha1q3
{
    public static void main(String[] args) 
    {
        int a = Integer.MAX_VALUE;//(2^31-1)
        System.out.println("not in ques.min value of integer "+Integer.MIN_VALUE);
        //print the value of a
        System.out.println(a);
        //it operates in cyclic order with MAX and MIN value as connector of cycle
        
        //pushes back by 1
        System.out.println(a+1);// -2147483648
        //first goes back to negative and then 2 is added to negative of a
        System.out.println(2-a);// -2147483645
        //first goes to negative cycle and moves forward by 2
        System.out.println(-2-a);// 2147483647
        //if we multiply by even number it will be -(even no.)
        System.out.println(2*a);// -2
        System.out.println(4*a);// -4
        //for odd multiple subtract the multiple from 2147483648
    }
}