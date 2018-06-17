import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        System.out.print("c = ");
        double c = sc.nextDouble();

        System.out.print("d = ");
        double d = sc.nextDouble();

        System.out.print("e = ");
        double e = sc.nextDouble();

        double f = (a+b+c+d+e)/5;
        System.out.print("Average = " + f);


    }
}
