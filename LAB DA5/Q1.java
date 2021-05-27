public class Q1 
{
   public static void main(String[] args) 
   {
       String input = args[0];
       int start = Integer.parseInt(args[1]);
       int end = Integer.parseInt(args[2]);
      
       System.out.println("Input string is : "+input);
       System.out.println("Start index is : "+start);
       System.out.println("End index is : "+end);
       if(end<start) {
           System.out.println("Error! Ending index is less than Starting index");
           return ;
       }else if(end>input.length()) {
           System.out.println("Error! Index is out of bound!");
           return ;
       }
      
       String SubString = input.substring(start,end+1);
       String reverse="";
       for(int i=SubString.length()-1;i>=0;i--) {
           reverse += SubString.charAt(i);
       }
      
       System.out.println("\nOutput is : "+reverse);
   }
}
