import java.util.*;

public class Password{
    public static void main(String[] args)
    {
        int length = 8;
        System.out.println(generatePassword(length));
    }

    static char[] generatePassword(int len){
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] password = new char[len];
        
        password[0]=Small_chars.charAt(rndm_method.nextInt(Small_chars.length()));
        for (int i = 0; i < len; i+=2)
        {
            password[i] = Small_chars.charAt(rndm_method.nextInt(Small_chars.length()));

        }
        for (int i = 1; i < len; i+=2)
        {
            password[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
  
        }
        return password;
    }
}