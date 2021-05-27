import java.util.Scanner;
public class AsciiTable 
{  
    public static void main(String[] args)   
    {  
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter the character: ");
            char c=s.next().charAt(0);
            int asciivalue=c;    
            System.out.println("The ASCII value of " + c + " is: " + asciivalue);
            System.out.print("\n\n");
        }
        
    }  
}  
