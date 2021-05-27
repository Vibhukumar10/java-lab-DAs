import java.util.Scanner;

public class Q2 {
    static Scanner sc =new Scanner(System.in);
    static void marks() {
        System.out.println("Enter number of students: ");
        int n,cat,quiz;
        n =sc.nextInt();

        int[] q = new int[n];
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            try {
                System.out.println("Enter quiz marks:");
                quiz = sc.nextInt();
                System.out.println("Enter cat marks:");
                cat = sc.nextInt();
                if (quiz<0 || quiz>10 || cat<0 || cat > 100) {
                    throw new exc("Quiz  and CAT marks should be between 0-10 and 0-100 respectively");
                }
                else {
                    System.out.println("Accepted");
                    c[i] = cat;
                    q[i] = quiz;
                }
            } catch (Exception e) {
                System.out.println(e);

            }
        }

    }
    public static void main(String[] args) {
        marks();
    }
}
