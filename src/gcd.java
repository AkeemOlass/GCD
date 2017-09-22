
import java.util.Scanner;
public class gcd {


    /**
     * GNU GENERAL PUBLIC LICENSE
     Version 3, 29 June 2007
     Copyright (C) 2014  Author Akeem Prince Olass.
     Everyone is permitted to copy and distribute verbatim copies
     of this license document, but changing it is not allowed.
     *

     */


    public static void main(String[] args){
        /**Initialize specnum to specify the number of integers*/
        int SpecNum;
        System.out.println("Specify the number of integers you want to find the greatest \n" +
                "common divisor for: " ) ;
        Scanner input = new Scanner(System.in);
        SpecNum =input.nextInt();
        int []  numbers = new int[SpecNum];
        /**Enter the values of integers specified*/
        System.out.println("Please Enter the values of ALL these numbers ");
        for (int i=0; i <= numbers.length-1; i++){
            numbers[i]= input.nextInt();

        }
        System.out.println("The greatest common divisor of these numbers is " + GCDofArray( numbers));

    }


    /**finds the gcd of two numbers in the array
     * This uses Euclid's gcd algorithm*/
    public static int gcdTwonum(int a, int b)
    {
        if (a == 0)
            return b;
        return gcdTwonum(b%a, a);
    }
    /** the GCD of any of two number is found by calling gcdTwonum method
     * the GCD of a group of numbers doesn't change
     * the gcd of two numbers is the same for one of the numbers and a different number,
     * else the gcd between that number and a different number becomes the new gcd
     */
    public static int GCDofArray(int... numbers){

        int result = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            result = gcdTwonum(numbers[i], result);
        }
        return result;

    }
}
