import java.util.Scanner;
public class ClassName
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Class number: ");
        int n=s.nextInt();
        switch(n)
        {
            case 604:
                System.out.print("Class Name: Java Programming");
                break;
            case 605:
                System.out.print("Class Name: Python Programming");
                break;
            default: 
                System.out.print("Invalid Input");
        }
    }
}