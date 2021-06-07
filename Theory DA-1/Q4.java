import java.util.Scanner;
class club{
    static Scanner sc = new Scanner(System.in);
    String name;
    int estb;
    int leagueTrophy;
    int UclTrophy;
    void GetBasics()
    {
        System.out.print("Enter the name: ");
        name = sc.next();
        System.out.print("When was "+name+ " Estabilished: ");
        estb =sc.nextInt();
        System.out.print("How many league trophies "+name+" has: ");
        leagueTrophy = sc.nextInt();
        System.out.print("How many Ucl Trophies "+name+" has: ");
        UclTrophy = sc.nextInt();
    }
}
class Player extends club{
    String p1,p2,p3;
    String highest_goal_scorer;
    int no_of_goals;
    void Getplayer()
    {
        System.out.print("Enter the 3 plyaer names ");
        p1 = sc.next();
        p2 =sc.next();
        p3 = sc.next();
        System.out.print("Highest goal scorer for "+name+ " is: ");
        highest_goal_scorer =sc.next();
        System.out.print("How many goals "+highest_goal_scorer+" scored for "+name+" : ");
        no_of_goals = sc.nextInt();
    }
}
class Recent extends Player{
    String Recent_trophy;
    String Country;
    String Current_club;
    void Getdetails()
    {
        System.out.print("Recent Trophy won by "+highest_goal_scorer+": ");
        Recent_trophy = sc.next();
        System.out.print("Country represented by "+highest_goal_scorer+ " is: ");
        Country =sc.next();
        System.out.print("Current club for "+highest_goal_scorer+" of "+name+" : ");
        Current_club = sc.next();
    }
    void disp()
    {
        System.out.println("name: "+name);
        System.out.println("Estabilished: "+estb);
        System.out.println("League Trophies: "+leagueTrophy);
        System.out.println("Ucl trophies: "+UclTrophy);
        System.out.print("3 players: "+p1+", "+p2+", "+p3);
        System.out.println("Highest Goal scorer for "+name+": "+highest_goal_scorer);
        System.out.println("Goals Scored by "+highest_goal_scorer+" for "+name+": "+no_of_goals);
        System.out.println("Recent Trophy won by "+highest_goal_scorer+": "+Recent_trophy);
        System.out.println("Country "+highest_goal_scorer+" represents: "+Country);
        System.out.println("Current Club for which "+highest_goal_scorer+" plays for: "+Current_club);
    }
}
public class Q4 {
    public static void main(String[] args) {
    Recent a1 = new Recent();
    Recent a2 = new Recent();
    a1.GetBasics();
    a1.Getplayer();
    a1.Getdetails();
    a1.disp();
    System.out.println("+++++++++++++++++++++++++");
    a2.GetBasics();
    a2.Getplayer();
    a2.Getdetails();
    a2.disp();
    }
}