import java.io.*;
import java.util.*;

class Faculty implements Serializable {
    String emp;
    String name;
    int age;
    String address;
    long contact;
    String allergy;
    String date;

    Faculty(String emp, String name, int age, String address, long contact, String allergy, String date2) {
        this.emp = emp;
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
        this.allergy = allergy;
        this.date = date2;
    }

    void display() {
        System.out.println("Employee id: " + emp);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contact);
        System.out.println("Allergy: " + allergy);
        System.out.println("Date of Vaccination" + date);
        System.out.println();
    }
}

public class Q7{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter no. of faculties: ");
        n = sc.nextInt();
        Faculty[] f = new Faculty[n];
        Faculty[] faculty_new = new Faculty[n];
        FileOutputStream fout = new FileOutputStream("lol.txt");
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        FileInputStream fin = new FileInputStream("lol.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        for (int i = 0; i < n; i++) {
            System.out.println("Details of faculty " + (i + 1));
            System.out.print("Enter employee id: ");
            String Empid = sc.next();
            System.out.print("Enter Name: ");
            String Name = sc.next();
            System.out.print("Enter Age: ");
            int Age = sc.nextInt();
            System.out.print("Enter Address: ");
            String Address = sc.next();
            System.out.print("Enter Contact number: ");
            long Contact = sc.nextLong();
            System.out.print("Enter yes if Allergy: ");
            String Allergy = sc.next();
            System.out.print("Enter Date of vaccination: ");
            String date = sc.next();
            f[i] = new Faculty(Empid, Name, Age, Address, Contact, Allergy, date);
            oout.writeObject(f[i]);
            System.out.println();
        }
        System.out.println("Details of faculty with allergy: ");
        for (int i = 0; i < n; i++) {
            faculty_new[i] = (Faculty) oin.readObject();
            if (faculty_new[i].allergy.equals("yes")) {
                f[i].display();
            }
        }
        sc.close();
        oout.close();
        fin.close();
        System.out.println("Success!");
    }
}
