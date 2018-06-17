import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Alphabet = ");
        char alph = sc.next().charAt(0);

        if (alph == 'a' || alph == 'A' || alph == 'e' || alph == 'E' || alph == 'i' || alph == 'I' || alph == 'o' || alph == 'O' || alph == 'u' || alph == 'U')
        {System.out.print("Entered Alphabet is a Vowel");}
        else{System.out.print("Entered Alphabet is a Consonant");}
// did not understand how to do the 'Error ' bit so left it.

    }
}
