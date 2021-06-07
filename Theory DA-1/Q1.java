import java.util.*;

public class Q1{
    static int sum(int arr[],int end)
    {
        int res=0;
        for(int i=0;i<end;i++)
        {
            res+=arr[i];
        }
        return res;
    }

    static int maxDiff(int w[],int n,int k)
    {
        Arrays.sort(w);
        if(k<=n/2)
        {
            return sum(w,n)-2*sum(w,k);
        }
        return sum(w,n)-2*sum(w,n-k);
    }
    public static void main(String args[]){
            int n,k;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            k=s.nextInt();
            int[] w=new int[n];
            for(int i=0;i<n;i++)
            {
                w[i]=s.nextInt();
            }
            System.out.print(maxDiff(w,n,k)+"\n");
    }
}