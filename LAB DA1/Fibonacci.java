import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,n1=0,n2=1;
        System.out.print("Enter the number of terms to print: ");
        n=s.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<n;i++)
        {
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}