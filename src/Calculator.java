public class Calculator {

    // this method is for addition
    public static void addition (int a,int b,int c){
        System.out.println(+a+ " + " +b+ " + " +c+ " = " + (a+b+c));
    }

    //This method is for subtraction
    public static void subtraction (int d,int e,int f){
        System.out.println(+d+" - "+e+" - "+f+" = " + (d-e-f));
    }
    // This method is for multiplication
    public static void multiplication (int a,int b){
        System.out.println(+a+" * "+b+" = " + (a*b));
    }
    // This method is for division
    public static void division (int c,int d){
        System.out.println(+c+" / "+d+" = " + (c/d));
    }
    // This method is for square of a number
    public static void square (int a){
        System.out.println("Square of "+a+" = " + (a*a));
    }
    // This method is for cube of a number
    public static void cube (int b){
        System.out.println("Cube of "+b+" = " + (b*b*b));
    }

    public static void main(String[] args) {
        addition (2,4,6);
        subtraction (10,5,3);
        multiplication (2,2);
        division (10,5);
        square (9);
        cube (3);



    }

}

