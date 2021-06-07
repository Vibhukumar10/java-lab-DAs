public class Manager extends Employee{
    int employeesWorkingUnder;

    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setDesignation(String Designation){
        this.Designation = Designation;
    }
    public void setEmployeesWorkingUnder(int employeesWorkingUnder){
        this.employeesWorkingUnder = employeesWorkingUnder;
    }
    public void show(){
        System.out.println("Age :- "+age);
        System.out.println("Salary :- "+salary);
        System.out.println("Designation :- "+Designation);
        System.out.println("Number of employees under you :- "+employeesWorkingUnder);
    }
    
}