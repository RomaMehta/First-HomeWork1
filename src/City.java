import java.util.Scanner;
public class City {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alphabet in lowercase = ");
        char alpha = sc.next().charAt(0);

        if (alpha =='a') {System.out.print( "Amsterdam");}
        else if (alpha == 'b'){System.out.print("Bombay");}
        else if (alpha == 'c'){System.out.print("Chicago");}
        else if (alpha == 'd'){System.out.print("Dangyang");}
        else if (alpha == 'e'){System.out.print("Edinburgh");}
        else if (alpha == 'f'){System.out.print("Frankfurt");}
        else{System.out.print("Invalid Entry");}

    }
}
