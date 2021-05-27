import java.util.*;
 public class Q6 
 {
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        System.out.println (nums.length >= 2 && nums[0] ==  nums[nums.length-1]);
    }
}
