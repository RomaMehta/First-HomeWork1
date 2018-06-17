import java.util.Scanner;

public class UpperLowercase {
    public static void main(String[] args) {
        char ch;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter any Alphabet in Uppercase = ");
        ch = sc.next().charAt(0);

        temp =(int)ch;
        temp = temp + 32;
        ch = (char)temp;

        System.out.println("Lowercase alphabet = " + ch);

    }
}
