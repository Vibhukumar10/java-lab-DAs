import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("");
        boolean leap=false;
        System.out.print("Enter the year: ");
        int x=s.nextInt();
        if(x%4==0)
        {
            leap=true;
            if(x%100==0 && x%400!=0)
            {
                leap=false;
            }
        }
        if(leap==true)
        {
            System.out.println(x+" is a leap year.");
        }
        else
        {
            System.out.println(x+" is not a leap year.");
        }
    }
}