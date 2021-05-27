import java.util.*;

interface CreditCardAPP{
    void getPersonalDetails();
    double calculatePerYearIncome();
    void PrintEligibility();
}
class IndianBank implements CreditCardAPP{

    @Override
    public void getPersonalDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter mob: ");
        int mob = sc.nextInt();
        System.out.println("Enter address: ");
        String add = sc.next();
        System.out.println("Enter nominee :");
        
        String nom = sc.next();
        System.out.println("Enter age : ");
        int  age = sc.nextInt();
        System.out.println("Enter email : ");
        String email = sc.next();
    }

    @Override
    public double calculatePerYearIncome() {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your Gross Salary: ");
        int GrossSalary=s.nextInt();
        double NetSalPerMonth = 0.8 * GrossSalary;
        double PerYearIncome = NetSalPerMonth * 12;
        return PerYearIncome;
    }

    @Override
    public void PrintEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EMI: ");
        double emi = sc.nextDouble();
        int EligibilityScore = 0;
        if(emi == 0 )
        {
            EligibilityScore = 3;
        }
        else if(emi<=20)
        {
            EligibilityScore = 2; 
        }
        else if(emi<=40 && emi>20)
        {
            EligibilityScore = 1;
        }
        else if(emi<=60 && emi>40)
        {
            EligibilityScore = 0; 
        }
    } 
}

public class Q5{
    public static void main(String args[]) {
        IndianBank a = new IndianBank();
        a.calculatePerYearIncome(); 
   }
}
