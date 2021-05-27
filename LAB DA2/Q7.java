import java.util.*;
public class Q7 
{
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] num_array1=new int[n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            num_array1[i]=s.nextInt();
        }
        System.out.print("Enter the size of array: ");
        int n1;
        n1=s.nextInt();
        int[] num_array2=new int[n1];
        System.out.print("Enter the array: ");
        for(int i=0;i<n1;i++)
        {
            num_array2[i]=s.nextInt();
        }
        if(num_array1.length>=2 && num_array2.length>=2)
        {
            System.out.println(num_array1[0] == num_array2[0] || num_array1[num_array1.length-1] == num_array2[num_array2.length-1]);
        }
        else
        {
            System.out.println("Array lengths less than 2.");
        }
    }
}
