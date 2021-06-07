import java.util.*;

 class Q10 {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            TreeMap<Long,Integer> tm=new TreeMap<Long,Integer>();
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                long x=sc.nextLong();
                if(tm.containsKey(x))
                    tm.put(x,tm.get(x)+1);
                else tm.put(x,1);
            }
            Set<Map.Entry<Long,Integer>> s=tm.entrySet();
            Iterator<Map.Entry<Long,Integer>> itr=s.iterator();
            while(itr.hasNext()){
                Map.Entry<Long,Integer>m= (Map.Entry<Long,Integer>)itr.next();
                System.out.println("\n\nOutput:\n"+m.getKey()+":"+m.getValue());
            }
        }
    }  
}