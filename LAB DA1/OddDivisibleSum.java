import java.util.*; 
public class OddDivisibleSum
{
    private static int sumDivisibles(int A, int B, int M) 
    {
        int sum = 0;
        for (int i = A; i <= B; i++) 
        if (i % M == 0 && i%2==1) 
            sum += i;
        return sum; 
    }
    public static void main(String[] args) 
    {
        int A = 200, B = 800, M = 5;
        System.out.print("The sum of all odd numbers between 200 and 800 which are divisible by 5 is: "+sumDivisibles(A, B, M) +"\n");
    }  
}
