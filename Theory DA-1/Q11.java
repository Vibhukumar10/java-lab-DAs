import java.util.*;

class Q11
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int c = 0; c<t; c++)
		{
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int arr1[] = new int[N];
		    int arr2[] = new int[M];
		    int count = 0;
		    
		    for(int i = 0; i<N; i++)
		    {
		        arr1[i] = sc.nextInt();
		    }
		    
		    for(int i = 0; i<M; i++)
		    {
		        arr2[i] = sc.nextInt();
		    }
		    
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		   int i = 0,j = 0;
		   
		    while(i<N && j<M)
		    {
		            if(arr1[i]<arr2[j])
		            {
		                i++;
		            }
		            else if(arr2[j]<arr1[i])
		            {
		                j++;
		            }
		            else
		            {
		                count++;
		                i++;
		                j++;
		            }
		    }
		    System.out.println("\n"+"Output: "+count+"\n");
		}
	}
}