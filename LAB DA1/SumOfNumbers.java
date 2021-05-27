import java.util.Scanner;
public class SumOfNumbers
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();
        int sum=n*(n+1)/2;
        System.out.print("The sum of first "+n+" natural numbers is: "+sum);    
    }
}