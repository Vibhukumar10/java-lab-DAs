import java.util.*;
 
public class Q3
{
     static int[] rearrange(int[] new_arra, int n)
    {
        int temp[] = new int[n];
        int small_num = 0, large_num = n-1;
        boolean flag = true;
        for (int i=0; i < n; i++)
        {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
            flag = !flag;
        }
        return temp;
    }
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
        // int nums[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result[];
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));
        result = rearrange(nums,nums.length);
        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));
     
    }
}
