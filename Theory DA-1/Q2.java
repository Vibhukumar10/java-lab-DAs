import java.util.*;
import java.lang.String;

public class Q2{

    static int weight(String s1){
        int sum=0;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            sum+=c-'a'+1;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String s1=s.nextLine();
        System.out.print("Enter the second word: ");
        String s2=s.nextLine();
        System.out.println("\nDifference in weights: "+Math.abs(weight(s1)-weight(s2)));
    }
}