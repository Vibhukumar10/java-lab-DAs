import java.util.*;
interface CreditCardAPP
     {
         void getpersonalDetails();
         double CalculatePerYearIncome();
         int PrintEligibility();
         
     }
     
     class IndianBank implements CreditCardAPP
     {
         public void getpersonalDetails()
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter name: ");
             String name = sc.next();
             System.out.println("Enter mob: ");
             int mob = sc.nextInt();
             System.out.println("Enter address: ");
             String add = sc.next();
             System.out.println("Enter nominee :");
             
             String nom = sc.next();
             System.out.println("Enter age : ");
             int age = sc.nextInt();
             System.out.println("Enter email : ");
             String email = sc.next();
             
         }
         
         public double CalculatePerYearIncome()
         {
             Scanner sc= new Scanner(System.in);
             System.out.println("Enter gross salary ");
             double gs = sc.nextDouble();
             
             Double NetSalPerMonth = gs-(gs*0.2);
             double PerYearIncome = NetSalPerMonth*12;
             return PerYearIncome; 
         }
         
        public int PrintEligibility()
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter EMI: ");
             double emi = sc.nextDouble();
             int EligibilityScore = 0;
             double pyi = CalculatePerYearIncome();
             if(emi==0)
             {
                 EligibilityScore = 3;
             }
             else if(emi<=(0.2*pyi))
             {
                EligibilityScore = 2; 
             }
             else if(emi<=(0.4*pyi))
             {
                 EligibilityScore = 1;
             }
             else if(emi<=(0.6*pyi))
             {
                EligibilityScore = 0; 
             }
             return EligibilityScore;
             
         }
     }
     
      class SBI implements CreditCardAPP
     {
         public void getpersonalDetails()
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter name: ");
             String name = sc.next();
             System.out.println("Enter mob: ");
             int mob = sc.nextInt();
             System.out.println("Enter address: ");
             String add = sc.next();
             System.out.println("Enter nominee :");
             
             String nom = sc.next();
             System.out.println("Enter age : ");
             int age = sc.nextInt();
             System.out.println("Enter email : ");
             String email = sc.next();
             
         }
         
         public double CalculatePerYearIncome()
         {
             Scanner sc= new Scanner(System.in);
             System.out.println("Enter gross salary ");
             double gs = sc.nextDouble();
             
             Double NetSalPerMonth = gs-(gs*0.2);
             double PerYearIncome = NetSalPerMonth*12;
             return PerYearIncome;
         }
         
        public int PrintEligibility()
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter EMI: ");
             double emi = sc.nextDouble();
             int EligibilityScore = 0;
             double pyi = CalculatePerYearIncome();
             if(emi==0)
             {
                 EligibilityScore = 3;
             }
             else if(emi<=(0.2*pyi))
             {
                EligibilityScore = 2; 
             }
             else if(emi<=(0.4*pyi))
             {
                 EligibilityScore = 1;
             }
             else if(emi<=(0.6*pyi))
             {
                EligibilityScore = 0; 
             }
             return EligibilityScore;
             
         }
     }
     
     
      class KOTAK implements CreditCardAPP
     {
         public void getpersonalDetails()
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter name: ");
             String name = sc.next();
             System.out.println("Enter mob: ");
             int mob = sc.nextInt();
             System.out.println("Enter address: ");
             String add = sc.next();
             System.out.println("Enter nominee :");
             
             String nom = sc.next();
             System.out.println("Enter age : ");
             int age = sc.nextInt();
             System.out.println("Enter email : ");
             String email = sc.next();
             
         }
         
         public double CalculatePerYearIncome()
         {
             Scanner sc= new Scanner(System.in);
             System.out.println("Enter gross salary ");
             double gs = sc.nextDouble();
             
             Double NetSalPerMonth = gs-(gs*0.2);
             double PerYearIncome = NetSalPerMonth*12;
             return PerYearIncome;
         }
         
         public int PrintEligibility()
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter EMI: ");
             double emi = sc.nextDouble();
             int EligibilityScore = 0;
             double pyi = CalculatePerYearIncome();
             if(emi==0)
             {
                 EligibilityScore = 3;
             }
             else if(emi<=(0.2*pyi))
             {
                EligibilityScore = 2; 
             }
             else if(emi<=(0.4*pyi))
             {
                 EligibilityScore = 1;
             }
             else if(emi<=(0.6*pyi))
             {
                EligibilityScore = 0; 
             }
             return EligibilityScore;
             
         }
     }
     
     
     
public class HelloWorld
{
    public static void main(String []args){
        SBI a = new SBI();
        a.getpersonalDetails();
        System.out.println("Eligibility Score: "+a.PrintEligibility());
    }
}