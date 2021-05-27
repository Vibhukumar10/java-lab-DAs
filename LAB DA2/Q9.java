import java.util.*; 
public class Q9 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the array: ");
        int [] nums=new int[2];
        for(int i=0;i<2;i++)
        {
            nums[i]=s.nextInt();
        }
        if(nums[0] == 4 || nums[0] == 7)
            System.out.println("True");
        else
        System.out.println(nums[1] == 4 || nums[1] == 7);
    }
}
