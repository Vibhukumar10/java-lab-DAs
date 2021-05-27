import java.util.Scanner;
public class MultiplicationOfMatrices 
{
    public static void main(String args[]) 
    {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter the dimensions of Matrix A: ");
        int m=S.nextInt();
        int n=S.nextInt();
        System.out.print("Enter the dimensions of Matrix A: ");
        int r = S.nextInt();
        int s = S.nextInt();

        if(n!=r)
        {
            System.out.print("The given matrices cannot be multiplied.");
            //goto start;
            System.exit(0);
        }
        int arr1[][]=new int[m][n];
        int arr2[][]=new int[r][s];
        System.out.print("Enter the Matrix A: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=S.nextInt();
            }
        }

        System.out.print("Enter the Matrix B: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<s;j++)
            {
                arr2[i][j]=S.nextInt();
            }
        }

        int c[][]=new int[m][s];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<s;j++)
            {
                c[i][j]=0;
                for(int k=0;k<n;k++)
                {
                    c[i][j]+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
