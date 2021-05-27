import java.util.Scanner;

public class Q9i {
    static Scanner sc = new Scanner(System.in);

    static < E > void ReverseArray( E[] inputArray ) {
        int len =inputArray.length;
        System.out.println("\nReverse array:");
        for(int i=len-1;i>=0;i--) {
            System.out.printf("%s ", inputArray[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number of elements:");
        int n;
        n =sc.nextInt();
        Integer[] num = new Integer[n];
        Double[] dou = new Double[n];

        System.out.println("\nEnter integers: ");
        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(num[i]+" ");
        }
        ReverseArray(num);
        System.out.println("\nEnter doubles: ");
        for(int i=0;i<n;i++) {
            dou[i] = sc.nextDouble();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(dou[i]+" ");
        }
        ReverseArray(dou);
    }
}
