import java.util.Scanner;
import java.lang.Exception;
class ConcessionException extends Exception{
    public ConcessionException(String s){
        super(s);
    }
}
class Q5 {
    static void age(int menage,int womenage) throws ConcessionException{
        if(menage>65){
            System.out.println("Concession given for the Old Age Man");
        }
        else if(womenage>65){
            System.out.println("Concession given for the Old Age Woman")
            ;
        }
        else if(menage>21 && womenage>18){
            System.out.println("Concession accessed for the couple");
        }
        else{
            throw new ConcessionException("Concession Denied!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter Age of Man: ");
        a=sc.nextInt();
        System.out.print("Enter Age of Woman: ");
        b=sc.nextInt();
        try{
            age(a,b);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}