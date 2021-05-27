import java.util.Scanner;
public class Exponent
{
    private static int power(int x,int n)
    {
        int res=1;
        while(n>0)
        {
            if(n%2!=0)
            {
                res*=x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Number: ");
        int n=s.nextInt();
        System.out.print("Power: ");
        int p=s.nextInt();
        System.out.print("The result of "+n+"^"+p+" is: "+power(n,p));
    }
}