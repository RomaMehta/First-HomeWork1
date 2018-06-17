public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b = 1;

        System.out.print("Fibonacci Series :");

        int i = 1;
        while (i<=10){ System.out.print(a + " ");
        int d = a+b;
        a=b;
        b=d;
        i++; }


    }
}
