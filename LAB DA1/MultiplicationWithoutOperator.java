import java.util.Scanner;
public class MultiplicationWithoutOperator
{
   public static void main(String args[])
   {   
        Scanner s = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the two numbers:-");
        System.out.print("Enter the first number : ");
        int x = s.nextInt();
        System.out.print("Enter the second number : ");
        int y = s.nextInt();
        int z=0;

        while(x!=0)
        {
            z+=y;
            x--;
        }
        System.out.print("Multiplication: "+z);
   }
}