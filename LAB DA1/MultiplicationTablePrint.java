import java.util.Scanner;
public class MultiplicationTablePrint 
{

    public static void main(String[] args) 
    {
        for(int j=1;j<16;j++)
        {
            System.out.print("The Multiplication Table for "+j+" is:\n");
            for (int i=0;i<10;i++)
            {
                System.out.println(j+ " x " + (i+1) + " = " + (j * (i+1)));
            }
            System.out.print("\n");
        }    
    }
}
