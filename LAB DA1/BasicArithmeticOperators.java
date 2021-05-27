import java.util.Scanner;
public class BasicArithmeticOperators
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

        int add;
        add = x + y;
        System.out.println("Addition : "+add);

        int sub;
        sub = x - y;
        System.out.println("Subtraction : "+sub);

        int mul;
        mul = x * y;
        System.out.println("Multiplication : "+mul);

        float div;
        div = (float) x / y;
        System.out.println("Division : "+div);

        int mod;               
        mod = x % y;
        System.out.println("Modulo : "+mod);
    }
}