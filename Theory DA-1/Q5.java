public class Q5 {
    public static void main(String[] args) throws Exception{

        President p = new President();

        p.setAge(50);
        p.setDesignation("President");
        p.setSalary(50000);
        p.setNumberOfDepartments(5);
        p.show();

        System.out.println();

        Manager m = new Manager();

        m.setAge(50);
        m.setDesignation("Manager");
        m.setSalary(50000);
        m.setEmployeesWorkingUnder(50);
        m.show();
        
    }
}