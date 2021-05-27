class Fibonacci{
    private int n=1,a=-1,b=1,c;
    synchronized void disp(){
        for(int i=0;i<=45;i++){
            if(n==31)
                try{
                    System.out.println("Fibonacci Generation Halted");
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    System.out.println("Caught interrupted exception");
                }
            c=a+b;
            System.out.println(n+" Fibonacci : "+c);
            a=b;
            b=c;
            n++;
        }
    }
}
class Natural{
    int n=1;
    boolean isPrime=true;
    synchronized void disp(){
        for(int i=0;i<15;i++)
        {
            System.out.println("natural: "+ n);
            n++;
        }
    }
}
class NaturalThread implements Runnable{
    Thread t;
    Natural p1;
    NaturalThread(){
        t=new Thread(this);
        t.setPriority(Thread.NORM_PRIORITY);
        t.start();
    }
    public void run(){
        p1=new Natural();
        p1.disp();
    }
}
class FiboThread implements Runnable{
    Thread t2;
    Fibonacci f;
    FiboThread(){
        t2=new Thread(this);
        t2.setPriority(9);
        t2.start();
    }
    public void run(){
        f=new Fibonacci();
        f.disp();
    }
}
class Q3
{
        public static void main(String args[]){
        FiboThread ft=new FiboThread();
        NaturalThread pt=new NaturalThread();
    }
}
