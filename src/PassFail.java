import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name = ");
        String name = sc.next();

        System.out.print("Enter Roll no. = ");
        int rollno = sc.nextInt();

        System.out.println("Marks");
        System.out.print("English = ");
        double a = sc.nextDouble();

        System.out.print("Maths = ");
        double b = sc.nextDouble();

        System.out.print("Science = ");
        double c = sc.nextDouble();

        if (a < 35) if (b < 35) if (c < 35){ System.out.print(" Fail ");}
        else {System.out.print(" Pass ");}

           }
}