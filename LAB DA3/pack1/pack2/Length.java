package pack1.pack2;

public class Length {
    public static int strength(String s){
        int count=0;
        String[] arr= s.split("(?!^)");
        for(String i:arr)
            count+=1;
        return(count);
    }
}
