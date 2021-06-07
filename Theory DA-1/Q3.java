import java.util.*;
class Medicine {
    Date manufactureDate;
    int shelfMonthDuration;
}
class MildMedicine extends Medicine{
    String typeMedicine;
    public void setDate(Date manufactureDate){
        this.manufactureDate = manufactureDate;
    }
    public void setDuration(int shelfMonthDuration){
        this.shelfMonthDuration = shelfMonthDuration;
    }
    public void setType(String typeMedicine){
        this.typeMedicine = typeMedicine;
    }
    public void show(){
        System.out.println("manufacture date :- "+manufactureDate);
        System.out.println("Shelf life in months :- "+shelfMonthDuration);
        System.out.println("Type :- "+typeMedicine);
    }
}
class HighDoseMedicine extends Medicine{
    String emergencyLevel; // critical,severe,high
    public void setDate(Date manufactureDate){
        this.manufactureDate = manufactureDate;
    }
    public void setDuration(int shelfMonthDuration){
        this.shelfMonthDuration = shelfMonthDuration;
    }
    public void setEmergeny(String emergencyLevel){
        this.emergencyLevel = emergencyLevel;
    }
    public void show(){
        System.out.println("manufacture date :- "+manufactureDate);
        System.out.println("Shelf life in months :- "+shelfMonthDuration);
        System.out.println("Severity :- "+emergencyLevel);
    }
}
public class Q3{
    public static void main(String args[]){
        MildMedicine medicine1 = new MildMedicine();
        HighDoseMedicine medicine2 = new HighDoseMedicine();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2020, 06, 29, 59, 59, 59);
        Date date1 = calendar1.getTime();
        medicine1.setDate(date1);
        medicine1.setDuration(15);
        medicine1.setType("Homeopathy");
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2020, 05, 21, 59, 59, 59);
        Date date2 = calendar2.getTime();
        medicine2.setDate(date2);
        medicine2.setDuration(12);
        medicine2.setEmergeny("critical");
        System.out.println("For modicine 1 :- ");
        medicine1.show();
        System.out.println("");
        System.out.println("For modicine 2 :- ");
        medicine2.show();
    }
}