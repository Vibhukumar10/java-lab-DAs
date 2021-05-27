import java.util.Scanner;

public class Q20 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        int x = 0, y = 0, z = 0;
        arr[0] = new int[12];
        arr[1] = new int[10];
        arr[2] = new int[8];
        int sum = 0;
        double p;
        System.out.println("CAT 1 attendance:");
        for (int i = 0; i < 12; i++) 
        {
            arr[0][i] = sc.nextInt();
            x = x + arr[0][i];
        }
        System.out.println("CAT 2 attendance:");
        for (int i = 0; i < 10; i++) {
            arr[1][i] = sc.nextInt();
            y = y + arr[1][i];
        }
        System.out.println("term end attendance:");
        for (int i = 0; i < 8; i++) 
        {
            arr[2][i] = sc.nextInt();
            z = z + arr[2][i];
        }
        System.out.println("attendence array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        sum =x+y+z;
        p =(double) (sum*100)/30;
        System.out.println("Present day:" +sum);
        System.out.println("Present days percentage: "+p);
    }
}