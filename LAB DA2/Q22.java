import java.util.Scanner;

public class Q22
{
    static int SumOfMatrix(int a[][],int n,int m)
    {
        int sum =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum = sum+a[i][j];
            }
        }
        return sum;
    }
    static float SumOfMatrix(float a[][],int n,int m)
    {
        float sum =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum = sum+a[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n1,m1;
        System.out.println("Enter number of rows and collumns for float matrix A[N][M]: ");
        System.out.print("Enter N: ");
        n1 = sc.nextInt();
        System.out.print("Enter M: ");
        m1 = sc.nextInt();
        float[][] A = new float[n1][m1];
        System.out.print("Enter float matrix A[N][M]:\n");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print("Enter element A["+i+"]["+j+"]: ");
                A[i][j] = sc.nextFloat();
            }
        }
        int n2,m2;
        System.out.println("Enter number of rows and collumns for integer matrix A[N][M]: ");
        System.out.print("Enter N: ");
        n2 = sc.nextInt();
        System.out.print("Enter M: ");
        m2 = sc.nextInt();
        int[][] B = new int[n2][m2];
        System.out.print("Enter integer matrix A[N][M]:\n");
        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<m2;j++)
            {
                System.out.print("Enter element B["+i+"]["+j+"]: ");
                B[i][j] = sc.nextInt();
            }
        }
        System.out.print("Float matrix A:\n");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.print("\n");
        }
        float x = SumOfMatrix(A,n1,m1);
        System.out.println("Sum of elements of float Matrix A["+n1+"]["+m1+"] = "+x);
        System.out.print("Integer matrix B:\n");
        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<m2;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.print("\n");
        }
        int y = SumOfMatrix(B,n2,m2);
        System.out.println("Sum of elements of integer Matrix B["+n2+"]["+m2+"] = "+y);
    }
}