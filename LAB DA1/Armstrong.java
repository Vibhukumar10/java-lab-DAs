import java.util.Scanner;
public class Armstrong
{  
    public static void main(String[] args)  
    {  
        Scanner s=new Scanner(System.in);
        int c=0,a,temp;  
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        temp=n;  
        while(n>0)  
        {  
            a=n%10;  
            n=n/10;  
            c=c+(a*a*a);  
        }  
        if(temp==c)  
            System.out.println(temp+" is an armstrong number.");   
        else  
            System.out.println(temp+" is not an armstrong number.");   
    }  
}  
