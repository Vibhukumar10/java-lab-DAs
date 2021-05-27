import java.util.*;
public class Q11
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
        if(arr[0]<arr[2])
        {
            System.out.print("Larger value between 1st and last element is: "+arr[2]);
        }
        else
        {
            System.out.print("Larger value between 1st and last element is: "+arr[0]);
        }
    }
}
