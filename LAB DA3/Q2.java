import java.util.*;

interface Factortial {
  int factl(int n);
}

interface SumToN {
  int sumN(int n);
}

class Demo implements Factortial, SumToN {

  @Override
  public int factl(int n) {
    int P = 1;
    for (int i = 1; i <= n; ++i)
      P *= i;
    return P;
  }

  @Override
  public int sumN(int n) {
    int S = 0;
    for (int i = 1; i <= n; ++i)
      S += i;
    return S;
  }

}

public class Q2 {
  public static void main(String[] args) {
    Demo obj = new Demo();
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=s.nextInt();
    System.out.println("Factorial of "+n+" is: "+obj.factl(n));
    System.out.println("Sum of first "+n+" numbers is: "+obj.sumN(n));
  }
}
