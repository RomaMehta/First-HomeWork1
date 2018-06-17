import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String EvenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + EvenOdd);

    }
}