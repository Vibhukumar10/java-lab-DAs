import java.util.Scanner;
public class OperationsWithoutThirdVariable
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

        x = x + y;
        System.out.println("Addition : "+x);

        x = x - y;
        System.out.println("Subtraction : "+x);

        x = x * y;
        System.out.println("Multiplication : "+x);

        x =  x / y;
        System.out.println("Division : "+x);
              
        x = x % y;
        System.out.println("Modulo : "+x);
    }
}