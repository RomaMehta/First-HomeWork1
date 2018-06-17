import java.util.Scanner;
public class NumAlphSymb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Value = ");
        char val = sc.next().charAt(0);

        int num = (int)val; // to convert character into number

        // Using ASCII code
        if (num >= 65 && num <= 122){System.out.print("Entered value is an Alphabet");}
        else if (num >= 48 && num <= 57){System.out.print("Entered value is a Number");}
        else {System.out.print("Entered value is a Symbol");}


        }
}
