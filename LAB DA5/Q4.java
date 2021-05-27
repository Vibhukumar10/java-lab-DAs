import java.util.Scanner;

public class Q4
{
    public static void main(String args[])
    {
        int options,age,couple1,couple2,gender;
        float discount;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Welcome to Southern Railways");
            System.out.println("Please select the below options.");
            System.out.println("1.Single");
            System.out.println("2.Couple");
            options = sc.nextInt();
            if(options==1) //singles
            {
                System.out.println("Please select the option");
                System.out.println("1.Male");
                System.out.println("2.Female");
                gender=sc.nextInt(); 
                if(gender==1) //male
                {
                    System.out.println("Please enter age");
                    age = sc.nextInt();
                    if(age>65)
                    {
                        discount=25;
                        System.out.println("You got 25% discount on your ticket");
                    }
                    else
                        throw new CustomException("You are not eligible for the consession");
                }
                else
                {
                    System.out.println("Please enter age");
                    age = sc.nextInt();
                    if(age>60)
                    {
                        discount=10;
                        System.out.println("You got 10% discount on your ticket");
                    }
                    else
                        throw new CustomException("You are not eligible for the consession");
                }
            }
            else if(options==2) // couples
            {
                System.out.println("Please enter male's age");
                couple1=sc.nextInt();
                System.out.println("Please enter female's age");
                couple2=sc.nextInt();
                if(couple1>21 && couple2>18)
                {
                    discount=5;
                    System.out.println("You both got 5% discount on your ticket");
                }
                else
                    throw new CustomException("You are not eligible for the consession");
            }
            else
            {
                System.out.println("Please enter proper option");
            }
        }
        catch(CustomException exp){
            System.out.println(exp) ;
        }
    }
}
