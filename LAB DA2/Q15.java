import java.util.*;
public class Q15
{
    public static void main(String args[])
    {
        int n,m;
        Scanner s=new Scanner(System.in);
        System.out.print("Matrix Addition:\nEnter the number of rows: ");
        n=s.nextInt();
        System.out.print("Enter the number of columns: ");
        m=s.nextInt();
        int[][] mat1=new int[n][m];
        int[][] mat2=new int[n][m];
        System.out.print("\n\nEnter Matrix[1]: \n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat1[i][j]=s.nextInt();
            }
        }
        System.out.print("\n\nEnter Matrix[2]: \n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat2[i][j]=s.nextInt();
            }
        }
        System.out.print("\nResult:\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat1[i][j]+mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
}