abstract class Student{
    private String name,status,telephone;
    public Student(String name,String status,String telephone){
        this.name = name;
        this.status = status;
        this.telephone = telephone;
    }
    public abstract double amountPaid();
    public String toString(){
        return "\nName of Student : "+name +"\nStatus : "+status +"\nTelephone : "+telephone;
    }
}

class FullTimeStudent extends Student{
    public FullTimeStudent(String name,String status,String telephone){
        super(name,status,telephone);
    }
    public double amountPaid(){
        return 2000.00;
    }
    public String toString(){
        return super.toString() + " Amount Paid : $"+amountPaid();
    }
}

class PartTimeStudent extends Student{
    public PartTimeStudent(String name,String status,String telephone){
        super(name,status,telephone);
    }
    public double amountPaid(){
        return 200.00;
    }
    public String toString(){
        return super.toString() + " Amount Paid : $"+amountPaid();
    }
}

class Q4{
    public static void main (String[] args){
        PartTimeStudent s1 = new PartTimeStudent("Vibhu Kumar Singh","Part Time","8076570505");
        System.out.println(s1);
        FullTimeStudent s2 = new FullTimeStudent("Khushi Gupta","Full Time","9811395721");
        System.out.println(s2);
    }
}