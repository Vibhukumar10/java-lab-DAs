public class President extends Employee{

    int age;
    int salary;
    String Designation;


    int numberOfDepartments;

    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setDesignation(String Designation){
        this.Designation = Designation;
    }
    public void setNumberOfDepartments(int numberOfDepartments){
        this.numberOfDepartments = numberOfDepartments;
    }
    public void show(){
        System.out.println("Age :- "+age);
        System.out.println("Salary :- "+salary);
        System.out.println("Designation :- "+Designation);
        System.out.println("Number of departments :- "+numberOfDepartments);
    }
}