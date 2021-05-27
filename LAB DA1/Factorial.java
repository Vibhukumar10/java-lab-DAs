import java.util.Scanner;
public class Factorial
{
    private static int Fact(int n)
    {
        int factorial=1;
        if(n==0 || n==1)
        {
            return 1;
        }
        for(int i=n;i>=2;i--)
        {
            factorial=factorial*i;
        }
        return factorial;
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();
        System.out.print("The factorial of "+n+" is: "+Fact(n));
    }
}