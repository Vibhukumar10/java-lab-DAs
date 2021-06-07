class Even{
    private int c=0,n=0;
    synchronized void display(){
        for(int i=0;i<=36;i++){
            if(n==36)
            try{
                System.out.println("Even Generation Halted[36 numbers are printed]");
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("Caught interrupted exception");
            }
            System.out.println(" Even number: "+c);
            c = c+2;
            n= n+2;
        }
    }
}
class Odd{
    int n=1;
    synchronized void display(){
        for(int i=1;i<=45;i= i+2)
        {
            System.out.println("odd number: "+i );
        }
    }
}
class OddThread implements Runnable{
    Thread t;
    Odd p1;
    OddThread(){
        t=new Thread(this);
        t.setPriority(Thread.NORM_PRIORITY);
        t.start();
    }
    static void dispt(){
        Thread t2 = Thread.currentThread();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Thread id: "+t2.getId()+" :: Thread Name: "+t2.getName());
    }
    public void run(){
    p1=new Odd();
    dispt();
    p1.display();
    }
}
class EvenThread implements Runnable{
    Thread t2;
    Even f;
    EvenThread(){
    t2=new Thread(this);
    t2.setPriority(9);
    t2.start();
    dispt();
    }
    static void dispt(){
        Thread t2 = Thread.currentThread();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Thread id: "+t2.getId()+" :: Thread Name: "+t2.getName());
    }
    public void run(){
        f=new Even();
        dispt();
        f.display();
    }
}
class Q7{
    public static void main(String args[]){
        EvenThread ft=new EvenThread();
        OddThread pt=new OddThread();
    }
}