// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: jGRASP

//import Math class with random
import java.lang.*;

public class RandomNumbers {

   public static void main(String[] Args) {
      
   // Part A: Generate a random integer between 20 and 80 (inclusive) - add 20 to the result of multiplication of 81, so we can include 80
   int randomA = 20 + (int) (Math.random() * 81);
   
   // Part B: Generate a random integer between -20 and 80 (inclusive), subtract 20 to the result of multiplication of 81 so we can include 80 as well
   int randomB = -20 + (int) (Math.random() * 81);
   
   // Part C: Generate a random integer between -50 and -20 (inclusive) - this was difficult to test, basically, -20 subtracts -50 and adds to 1, this makes
   //a value of up to 31, then the result is added to negative 50, which accounts for the negative values between -50 and -20, so this allows the number
   //range to fall between -50 and -20, the 1 one end is to allow for number inclusiveness of the maximum value of the number of the range, in this case, -20.
   int randomC = -50 + (int) (Math.random() * (-20 - -50 + 1));
   
   // Part D: Generate a random float between 0.0 and 21.9999 (inclusive), the double type allows values from 0.0 to 21.9999 to be printed because 22 would be excluded
   double randomD = Math.random() * 22;
   
   
    //Output part A
   System.out.println("a) A random integer between 20 and 80 (inclusive): \t\t\t " + randomA);
   
   //Output part B
   System.out.println("b) A random integer between -20 and 80 (inclusive): \t\t\t " + randomB);
   
   //Output part C
   System.out.println("c) A random integer between -50 and -20 (inclusive): \t\t\t " + randomC);
   
   //Output part D, I had to do print formatting to get it to output 4 places on the floating point
   System.out.printf("d) A random integer between 0.0 and 21.9999 (inclusive): \t %3.4f ", randomD);

   
   }

}