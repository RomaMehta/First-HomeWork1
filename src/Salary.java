import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Id = ");
        String id = sc.next();

        System.out.print("Employee Name = ");
        String name = sc.next();

        System.out.print("Basic Salary = ");
        double bs = sc.nextDouble();

        double hra = bs*10/100;
        System.out.println("HRA = " + hra);

        double da = bs*8/100;
        System.out.println("DA = " + da);

        double ta = bs*9/100;
        System.out.println("TA = " + ta);

        double pf = bs*20/100;
        System.out.println("PF = " + pf);

        double gs = bs + hra + ta + da - pf;
        System.out.println("Gross Salary = " + gs);


    }
}
