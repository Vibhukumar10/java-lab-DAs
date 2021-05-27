import java.util.Scanner;
public class Swapping
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        System.out.print("a = ");
        int a=s.nextInt();
        System.out.print("b = ");
        int b=s.nextInt();
        System.out.print("\nBefore Swapping:\na = "+a+"\nb = "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.print("\n\nAfter Swapping:\na = "+a+"\nb = "+b);
    }
}