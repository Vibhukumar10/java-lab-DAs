import java.util.Scanner;

class Student
{
    String name;
    String reg;
    void disp()
    {
        System.out.println("NAME: "+name);
        System.out.println("REGISTRATION NUMBER: "+reg);
    }
}
class Exam extends Student
{
    int s1;
    int s2;
    int s3;
    int s4;
    int s5;
    int s6;
    void disp2()
    {
        super.disp();
        System.out.println("Subject1: "+s1);
        System.out.println("Subject2: "+s2);
        System.out.println("Subject3: "+s3);
        System.out.println("Subject4: "+s4);
        System.out.println("Subject5: "+s5);
        System.out.println("Subject6: "+s6);
    }
}
class Result extends Exam
{
    void disp3()
    {
        int t = super.s1+super.s2+super.s3+super.s4+super.s5+super.s6;
        super.disp2();
        System.out.println("Total marks: "+t);
    }
}
public class Q23 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Result A = new Result();
        System.out.print("Name: ");
        A.name = sc.next();
        System.out.print("Reg no: ");
        A.reg = sc.next();
        System.out.print("Marks in Subject1: ");
        A.s1 = sc.nextInt();
        System.out.print("Marks in Subject2: ");
        A.s2 = sc.nextInt();
        System.out.print("Marks in Subject3: ");
        A.s3 = sc.nextInt();
        System.out.print("Marks in subject4: ");
        A.s4 = sc.nextInt();
        System.out.print("Marks in Subject5: ");
        A.s6 = sc.nextInt();
        System.out.print("Marks in Subject6: ");
        A.s5 = sc.nextInt();
        System.out.println("++++++++++++++++++++++++");
        A.disp3();
    }
}