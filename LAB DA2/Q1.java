import java.util.Scanner;
public class Q1
{  
    public static int getThirdLargest(int[] a, int total)
    {  
        int temp;  
        for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
    return a[total-3];  
    }  
    public static void main(String args[])
    {  
        System.out.print("Enter the size of array: ");
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Third Largest Element: "+getThirdLargest(a,n));
    }
}  
