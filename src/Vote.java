import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age = ");
        double age = sc.nextDouble();

        if (age>=18){System.out.println("You are Eligible to Vote");}
        else if (age<18){System.out.println("You are Not Eligible to vote");}
    }
}
