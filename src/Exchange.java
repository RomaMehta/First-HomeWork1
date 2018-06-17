import java.util.Scanner;

class Exchange
{
    public static void main(String args[])
    {Scanner in = new Scanner(System.in);

        System.out.print("Enter x = ");
        double x = in.nextDouble();

        System.out.print("Enter y = ");
       double y = in.nextDouble();

        System.out.println("Before Exchange\nx = "+x+"\ny = "+y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Exchange\nx = "+x+"\ny = "+y);
    }
}
