public class Primenos {
    public static void main(String args[]) {
        int s = 1;
        int m = 3;
        System.out.println("First 100 prime numbers are = ");
        System.out.println(2);
        for ( int i = 2 ; i <=100 ;)
        {for ( int j = 2 ; j <= Math.sqrt(m) ; j++ )
        {if ( m%j == 0 ) {s = 0;
        break; }
        }
        if ( s != 0 )
        {System.out.println(m);i++;}
            s = 1;
            m++;
        }
    }
}

