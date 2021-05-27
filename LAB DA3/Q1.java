import pack1.Words;
import pack1.pack2.Length;
import java.util.*;

class Q1{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter some Text: ");
        String s1 = sc.nextLine();
        System.out.print("Enter a Word: ");
        String s2 = sc.nextLine();
        int n1= Words.countNumWords(s1);
        int n2 = Length.strength(s2);
        System.out.println("Number of Words in Text is: "+n1);
        System.out.println("Length of thw Word is: "+n2);
    }
}
