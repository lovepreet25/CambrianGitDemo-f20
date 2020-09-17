import java.util.Scanner;

public class Intro{
    public static void main(String[] args){
        System.out.println("Hello World");
        /*
            int        whole numbers -2^32 2^32 -1
            float       decimals with 6-7 decimal places
            double      decimals with 15 decimal places
            long        whole numbers 9x10^18
            byte        -128, 127
            short       -37,768 37,767
            char        a single character
            boolean     true/ false     single bit 0 or 1

            String      NOT A PRIMATIVE. Hold a bunch of characters
        */

        // mixed_Case_with_Underscores
        // lower_case_with_underscores
                // popular in PHP and Python snake_case
        // lowerCamelCase
                // standard for most Java variables and methods
        // UpperCamelCase
                // standard for Java Classes
        // CAPITALS_WITH_UNDERSCORES
                // standard for Java constants
        // variables cannot start with a number or symbol
        // int _i is okay
        // int #1 is not okay
        // int 1stInt is not okay
        // int my1 is totally fine
        // avoid key words

        boolean myTruth = true;
        boolean myLie = false;
        float myFloat = 3.14159f; // Floats need an F at the end!

        System.out.println(myTruth);
        System.out.println(myLie);

		// regular math
        int a = 55, b = 123;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        int aSq = a*a;
        int bSq = b*b;
        int cSq = aSq + bSq;
        System.out.println(aSq + " * " + bSq + " = " + cSq);

		// Java struggles to divide integers. We call this integer division
		// and it will always be a problem when you least expect it.
		// That and trying to do math with repeating decimals
        int w;
        int x = 90;
        int y = 100;
        System.out.println("x / y = " + x / y );
        System.out.println("y / x = " +  y / x );
        System.out.println("1 / 10 = " + 1. / 10);
        System.out.println("1 / 10 = " + (double) 1 / 10);
        System.out.println("x / y = " + (double)x / y );
        System.out.println("y / x = " +  (double)y / x );
        //BE*typecasting*DMAS

        // modulus, modulo, mod, %
        System.out.println("what is mod? " + 10 % 5);
        System.out.println( 10 % 3);
        System.out.println("10 mod 2 = " + 10 % 2);
        System.out.println("10 mod 2 = " + 9 % 2);
        System.out.println("10 mod 2 = " + 8 % 2);
        System.out.println("10 mod 2 = " + 7 % 2);
        System.out.println("10 mod 2 = " + 6 % 2);
        System.out.println("10 mod 2 = " + 5 % 2);
        System.out.println("10.5 mod 1 = " + 10.5 % 1);

        if(b % 2 != 0){
            System.out.println("b (" + b + ") is odd");
        }
        else{
            System.out.println("b (" + b + ") is even");
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(a > b); // greater than
        System.out.println(a < b); // less than
        System.out.println(a >= b); // greater than or equal to
        System.out.println(a <= b); // less than or equal to
        System.out.println("a == b" + (a == b));
        System.out.println("a == myFloat " + (a == myFloat));
        a = 0;
        myFloat = 0f;
        System.out.println("a == myFloat " + (a == myFloat));


        String s = "Hello World";
        String string2 = "Hello World";
        System.out.println("s == string2 " + (s == string2));

        // fun names for Scanners: cin, keyb, rover, sc
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter a whole number ");
        int uInt = keyb.nextInt();
        keyb.nextLine(); //notice this
        System.out.println(uInt);

        System.out.print("Enter a decimal number ");
        float uFloat = keyb.nextFloat();
        keyb.nextLine(); //notice this
        System.out.println(uFloat);

        System.out.print("Enter a string ");
        String s5 = keyb.next();
        keyb.nextLine(); //notice this
        System.out.println(s5);

		// Without the keyb.next() in the previous lines, this next block won't work
		// because keyb.nextLine() collects up to the next new line character
		// which gets left over by things like .next(), .nextInt(), .nextFloat(), etc
        System.out.println("Enter your name");
        String uString = keyb.nextLine();
        System.out.println(uString);

		// If you need more information about if statements, please email me.
		// We were running a bit short on time and I didn't get a chance to 
		// look at the and && and or || operators  
        int myGrade = 56;
        if(myGrade < 60){
        	System.out.println("You should do better");
        }
        else if(myGrade < 80){
        	System.out.println("Hey, that's pretty good!");
        }
        else {
            // the false case for everything
        }

        keyb.close(); // this is an "optional" line for Scanners
    }
}
