// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: jGRASP

public class Pattern {

   public static void main(String[] Args) {
      
      //set outer loop variable to 0
      int outerLoopCount = 0;
      
      //outer while loop set to less than 6, because there are max 6 integers and 6 loops
       while (outerLoopCount < 6) {
            
            //set first inner loop to 0
            int innerLoopCount1 = 0;
            
            //This is the innerloop to print the leading spaces
            //inner loop count is incremented once for every pass
            while (innerLoopCount1 < outerLoopCount) {
                System.out.print("  ");
                innerLoopCount1++;
            }
            
            //set innerloop2 to 1
            int innerLoopCount2 = 1;
            
            //This inner loop actually prints the numbers on the line
            while (innerLoopCount2 <= 6 - outerLoopCount) {
                System.out.print(innerLoopCount2 + " ");
                innerLoopCount2++;
            }
           
            //this prints a new line for visual purposes
            System.out.println();
            
            //increment the outer loop
            outerLoopCount++;
   
   }
 }
}