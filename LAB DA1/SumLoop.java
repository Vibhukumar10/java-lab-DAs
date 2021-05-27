import java.util.Scanner;
public class SumLoop
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.print("1:Addition\n2:Exit\nEnter your choice: ");
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the numbers: ");
                    int a=s.nextInt();
                    int b=s.nextInt();
                    int sum=a+b;
                    System.out.print("Sum = "+sum+"\n\n");
                    break;
                case 2:
                    System.exit(0);
            }
        }   
    }
}
