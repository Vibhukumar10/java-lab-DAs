import java.util.Scanner;
class Q17 
{
    static int MAX = 100;
    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
            {
                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
    static void printSecondaryDiagonal(int mat[][], int n)
    {
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
            {
                if ((i + j) == (n - 1)) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        System.out.print("Enter the dimensions of square matrix: ");
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[][] a=new int[n][n];
        System.out.print("Enter the matrix: \n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        printPrincipalDiagonal(a, n);
        printSecondaryDiagonal(a, n);
    }
}
