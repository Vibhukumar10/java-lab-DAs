import java.io.*; 
import java.util.*;
class NegativeAmountException extends Exception {
    NegativeAmountException(String s) {
        super(s);    
    } 
} 
public class Q6 {
    int accbal;    
    void deposit(int dep)throws NegativeAmountException {       
        if (dep < 0)          
            throw new NegativeAmountException("Negative deposit not allowed!");       
            else          
            accbal += dep;    
        }    
        void withdraw(int with)throws NegativeAmountException {
            if (with < 0 || accbal - with < 0)          
                throw new NegativeAmountException("Negative withdrawal not allowed!");       
            else          accbal -= with;    
        }    
        Q6() {
            accbal = 0;    
        }    
        Q6(int bal)throws NegativeAmountException  {
            if (bal < 0) 
                throw new NegativeAmountException("Negative balance not allowed!");       
            else          
                accbal = bal;    
        }    
    public static void main(String []args) {       
        try {          
            Scanner sc = new Scanner(System.in);          
            System.out.println("Create a new bank account with an empty balance or with a positive balance?");          
            int n = sc.nextInt();          
            if (n == 1) {             
                Q6 acc = new Q6();             
                System.out.println("Deposit or withdrawal?");             
                int i = sc.nextInt();             
                if (i == 0) {                
                    System.out.println("Enter deposit amount?");                
                    int dep = sc.nextInt();                
                    acc.deposit(dep);                
                    System.out.println("Balance = " + acc.accbal);             
                } else {                
                    System.out.println("Enter withdrawal amount?");                
                    int with = sc.nextInt();                
                    acc.withdraw(with);                
                    System.out.println("Balance = " + acc.accbal);             
                }
                } else if (n == 0) {             
                    System.out.println("Enter account balance:");             
                    int bal = sc.nextInt();             
                    Q6 acc = new Q6(bal);             
                    System.out.println("Deposit or withdrawal?");             
                    int i = sc.nextInt();             
                    if (i == 0) {                
                        System.out.println("Enter deposit amount?");                
                        int dep = sc.nextInt(); 
                        acc.deposit(dep);                
                        System.out.println("Balance = " + acc.accbal);             
                    } else {                
                        System.out.println("Enter withdrawal amount?");                
                        int with = sc.nextInt();                
                        acc.withdraw(with);                
                        System.out.println("Balance = " + acc.accbal);             
                    }          
                }       
            } catch (NegativeAmountException e) {          
                System.out.println(e);       
            }    
        } 
    }