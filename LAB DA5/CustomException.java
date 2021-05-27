public class CustomException extends Exception{
    String str1;
    public CustomException(String str2)
    {
        str1=str2; 
    }
    public String toString()
    { 
        return (str1) ;
    }
}
