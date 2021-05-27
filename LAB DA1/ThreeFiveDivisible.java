import java.util.Scanner;
public class ThreeFiveDivisible
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        if(n%3==0 && n%5==0)
        {
            System.out.print(n+" is divisible by both 3 and 5.");
        }
        else
        {
            System.out.print(n+" is not divisible by both 3 and 5.");
        }
    }
}