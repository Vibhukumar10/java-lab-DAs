import java.util.Scanner;
import java.util.Arrays;
class emplo
{
    int salary;
    String name;
    String id;
    String DO;
    emplo(int a, String b,String c,String d)
    {
        this.salary = a;
        this.name =b;
        this.id =c;
        this.DO =d;
    }
    void disp()
    {
        System.out.print("Name: "+name+" id: "+id+" Date of joining: "+DO+" Salary: "+salary);
        System.out.print("\n");
    }
}

public class Q21 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n;int m;
        String a;
	String b;
	String c;
	int num=0;
        System.out.println("Number of students: ");
        n =sc.nextInt();
        emplo[] arr =new emplo[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee "+(i+1)+":");
            
            System.out.print("Name: ");
            a =sc.next();
            System.out.print("id: ");
            b =sc.next();
            System.out.print("Date of joining: ");
            c =sc.next();
	    System.out.print("Salary: ");
            m =sc.nextInt();
            arr[i] =new emplo(m,a,b,c);
        }
        emplo[] arr2 = new emplo[n];
        for (int i=0;i<n;i++)
        {
            if(arr[i].salary<100000)
            {
                arr2[num] = arr[i];
                num++;
            }
        }
        for(int i=0;i<num;i++)
        {
            arr2[i].disp();
        }
    }
}