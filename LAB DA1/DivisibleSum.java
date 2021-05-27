import java.util.*; 
public class DivisibleSum
{
    private static int sumDivisibles(int A, int B, int M) 
    {
        int sum = 0;
        for (int i = A; i <= B; i++) 
        if (i % M == 0) 
            sum += i;
        return sum; 
    }
    public static void main(String[] args) 
    {
        int A = 10, B = 50, M = 3;
        System.out.print("The Sum of numbers between 10 and 50 which are divisible by 3 is: "+sumDivisibles(A, B, M) +"\n");
    }  
}
