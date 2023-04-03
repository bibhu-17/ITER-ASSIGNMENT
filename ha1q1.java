public class ha1q1
{
    public static void main(String[] args) 
    {

        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        //num inside braces are added first
        System.out.println((2+3) + "bc");
        //num inside braces are added first
        System.out.println("bc" + (2+3));
        //2 and 3 will be treated as string
        System.out.println("bc" + 2 + 3);
    }
}