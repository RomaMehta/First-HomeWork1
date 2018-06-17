import java.util.Scanner;
        public class PositiveNegative {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print( "Enter a number = ");
                double a = sc.nextDouble();

                if (a>0){System.out.println("Positive");}
                else if (a<0){System.out.println("Negative");}
                else if (a==0){System.out.println("Zero");}

            }
}
