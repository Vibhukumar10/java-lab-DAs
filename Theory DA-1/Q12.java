import java.lang.invoke.VolatileCallSite;
import java.util.Scanner;
class Polymorphism{
    static double Area(double r , double h)
    {
        return 3.14*2*r*(r+h);
    }
    static double Area(double r){
        return 4*3.14*r*r;
    }
    static double Area(double l , double b, double h){
        return 2*(l*b+b*h+h*l);
    }
    static double Volume(double r, double h){
        return 3.14*r*r*h;
    }
    static double Volume(double r){
        return 4*3.14*r*r*r/3;
    }
    static double Volume(double l, double b, double h){
        return l*b*h;
    }
}
public class Q12 {
    static Scanner sc =new Scanner(System.in);
    static void display(double r, String a, String b){
        System.out.println(a+ " of the "+b+" = "+r);
    }
    public static void main(String[] args) {
        Polymorphism a1 = new Polymorphism();
        Polymorphism a2 = new Polymorphism();
        Polymorphism a3 = new Polymorphism();
        System.out.print("Enter radius for Cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter height for Cylinder: ");
        double h = sc.nextDouble();
        double a;
        a = a1.Area(r,h);
        double v = a1.Volume(r, h);
        display(a, "area", "cylinder");
        display(v, "volume", "cylinder");
        System.out.print("Enter radius for Sphere: ");
        r = sc.nextDouble();
        a = a2.Area(r);
        v = a2.Volume(r);
        display(a, "area", "Sphere");
        display(v, "volume", "Sphere");
        System.out.print("Enter length for cuboid: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of cuboid: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of cuboid: ");
        h = sc.nextDouble();
        a = a2.Area(l,b,h);
        v = a2.Volume(l,b,h);
        display(a, "area", "cuboid");
        display(v, "volume", "cuboid");
    }
}