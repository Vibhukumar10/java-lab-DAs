import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


class Student implements Serializable{
    String regno,name,proctor;
    double cgpa;
    Student(String name,String regno,String proctor,double cgpa)
    {
        this.name=name;
        this.regno=regno;
        this.proctor=proctor;
        this.cgpa=cgpa;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Registration number : "+ regno);
        System.out.println("Proctor : "+proctor);
        System.out.println("CGPA : "+cgpa);
        System.out.print("Grade : ");
        if(cgpa>=9)
            System.out.println("A");
        else if(cgpa<9 && cgpa>=7)
            System.out.println("B");
        else if(cgpa<7 && cgpa>5)
            System.out.println("C");
        else
            System.out.println("F");
    }
}

class StudentDisplay implements Serializable{
    StudentDisplay(int n) throws Exception{
        FileInputStream fin=new FileInputStream("student.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        Student[] s=new Student[n];
        for (int i = 0; i < n; i++) {
            s[i]=(Student) in.readObject();
            s[i].display();
        }
    }

}
public class Q6{
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of students : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        FileOutputStream fout = new FileOutputStream("student.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        Student[] s=new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student "+(i+1));
            System.out.print("Name : ");
            String name=sc.nextLine();
            System.out.print("Registration Number : ");
            String regno=sc.nextLine();
            System.out.print("Proctor : ");
            String proctor=sc.nextLine();
            System.out.print("CGPA : ");
            double cgpa=sc.nextDouble();
            sc.nextLine();
            s[i]=new Student(name,regno,proctor,cgpa);
            out.writeObject(s[i]);
        }
        new StudentDisplay(n);
    }
}
