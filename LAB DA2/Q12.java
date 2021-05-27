import java.util.*;
public class Q12
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[3];
        System.out.print("Enter the array: ");
        for(int i=0;i<3;i++)
        {
            arr[i]=s.nextInt();
        }
        int temp;
        temp=arr[0];
        arr[0]=arr[2];
        arr[2]=temp;
        System.out.print("Resulting array: ");
        for(int i=0;i<3;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
