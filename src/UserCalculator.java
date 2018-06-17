import java.util.Scanner;
public class UserCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        double a = sc.nextDouble();

        System.out.print("Enter second number = ");
        double b = sc.nextDouble();

        System.out.print("Enter an Operator ( + , - , * , / ) =  ");
        char oper = sc.next().charAt(0);

        double result;

        if (oper =='+') {System.out.print("Result = " + (a+b));}
        else if (oper =='-'){ System.out.print("Result =" + (a-b));}
        else if (oper =='*'){System.out.print("Result = " + (a*b)); }
        else if (oper == '/'){System.out.print("Result = " + (a/b));}

    }
}
