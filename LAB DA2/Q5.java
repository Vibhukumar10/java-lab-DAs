import java.util.*;
class Q5
{
    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.print("1. Decimal to Binary\n2. Binary to Decimal\n3.Exit\nEnter choice: ");
            int n;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            switch(n)
            {
                case 1:
                    DecimalToBinary();
                    break;
                case 2:
                    BinaryToDecimal();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
        
    }

    public static void DecimalToBinary()
    {
        int num;
        System.out.println("Decimal to Binary");
        System.out.print("Enter Decimal Number: ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        long binary = convertDecimalToBinary(num);
        System.out.println("\n" + num + " = " + binary);
    }
    public static long convertDecimalToBinary(int n) 
    {
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;
        while (n!=0) 
        {
            remainder = n % 2;
            System.out.println("Step " + step++ + ": " + n + "/2");
            System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }

    public static void BinaryToDecimal()
    {
        // long num = 110110111;
        System.out.print("Enter Binary Number: ");
        Scanner s=new Scanner(System.in);
        long num = s.nextLong();
        int decimal = convertBinaryToDecimal(num);
        System.out.println("Binary to Decimal");
        System.out.println(num + " = " + decimal);
    }
    
    public static int convertBinaryToDecimal(long num) 
    {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) 
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}
