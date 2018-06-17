import java.util.Scanner;
public class Grading {
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

        System.out.println("Total marks = " + (a+b+c));

        double d = a+b+c;
        double e = (d*100)/300;

        System.out.println("Percentage = " + (e) + "%");

        if(e<35) {System.out.println("FAIL");}
        else {System.out.println("PASS");}

        if(e>=35 && e<50){System.out.println("Grade = C");}
            else if(e>=50 && e<60){System.out.println("Grade = B");}
            else if(e>=60 && e<80){System.out.println("Grade = A");}
            else if (e>=80 && e<=100){System.out.println("Grade = A+");}



    }
}
