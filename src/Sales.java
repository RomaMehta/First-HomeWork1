import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sales ID = ");
        String id = sc.next();

        System.out.print("Enter Seller's Name = ");
        String name = sc.next();

        System.out.print("Basic Salary = ");
        double bs = sc.nextDouble();

        System.out.print("Sales Amount = ");
        double sa = sc.nextDouble();

        if (sa >= 50000) {System.out.print("Sales Commission =" + sa*35/100);}
        else if (sa >= 30000) {System.out.print("Sales Commission = " + sa*20/100);}
        else if (sa >= 20000) {System.out.print("Sales Commission = " + sa*10/100);}
        else if (sa >= 10000) {System.out.print("Sales Commission = " + sa*5/100);}
        else if (sa < 10000) {System.out.print("Sales Commission = " + sa*2/100);}
    }
}