import java.util.Scanner;

public class Q2 
{
    private static final String[] Registration = null;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input-\n");
        System.out.print("No of students: ");
        int n = sc.nextInt();
        System.out.println("");
        String[] Registration = new String[n];
        String[] Name = new String[n];
        float[] cgpa = new float[n];
        String[] Prog = new String[n];
        String[] School = new String[n];
        String[] Proc = new String[n];
        int i;
        for (i = 0; i < n; i++) 
        {
            System.out.println("Enter details of Student["+(i+1)+"]: ");
            System.out.print("Roll No: ");
            Registration[i] = sc.next();
            System.out.print("Name: ");
            Name[i] = sc.next();
            System.out.print("Cgpa: ");
            cgpa[i] = sc.nextFloat();
            System.out.print("Program Name: ");
            Prog[i] = sc.next();
            System.out.print("School Name: ");
            School[i] = sc.next();
            System.out.print("Proctor Name: ");
            Proc[i] = sc.next();
            System.out.print("\n");
        }
        System.out.println("\n\nPrinting-\n");
        for (i = 0; i < n; i++) 
        {
            System.out.println("Details of Student["+(i+1)+"]: ");
            System.out.println("Registration number = " + Registration[i]);
            System.out.println("Name = " + Name[i]);
            System.out.println("Cgpa = " + cgpa[i]);
            System.out.println("Program Name = " + Prog[i]);
            System.out.println("School Name = " + School[i]);
            System.out.println("Proctor Name = " + Proc[i]);
            System.out.print("\n");
        }
    }
}
