// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: jGRASP

//import string and scanner classes
import java.util.*;
import java.lang.*;

public class StringMethods {
   public static void main(String[] Args) {
   
   //userInput object of scanner class for input
   Scanner userInput = new Scanner(System.in);
   
   //prompt to enter first string and store in string variable
   System.out.println("Enter your first string ");
   String string_1 = userInput.nextLine();
   
   //prompt to enter second string and store in another string variable
   System.out.println("Enter your second string ");
   String string_2 = userInput.nextLine();
   
   //Show user what they have input
   System.out.println("You have entered " + string_1 + " " + string_2 + "\n");
   
   // Part A: Determine the length of string_1
   int string_1Length = string_1.length();
   
   // Part B: Determine the length of string_1
   int string_2Length = string_2.length();
   
   // Part C: Determine if string_1 is equal to string_2
   boolean equalStrings = string_1.equals(string_2);
   
   // Part D: Determine the length of string_1
   String string_1Uppercase = string_1.toUpperCase();
   
   // Part E: Determine the length of string_1
   String string_2Lowercase = string_2.toLowerCase();
   
   // Part F: Determine the length of string_1
   String concatString1and2 = string_1 + " " + string_2;
   
   // Part G: get a valid substring of the string_1, the ending position is the length of the string minus 1 to take into account of varying string input lengths
   String validSubString = string_1.substring(0, string_1.length() - 1);
   
   //Output part A
   System.out.println("a) Length of String 1: \t " + string_1Length + " characters");
   
   //Output part B
   System.out.println("b) Length of String 2: \t " + string_2Length + " characters");
   
   //Output part C
   System.out.println("c) Concatenation: \t\t " + concatString1and2);
   
   //Output part D - I had to use an if decision structure to determine if equals is true, then outout "equal", else if it is false, then "NOT equal"
   if(equalStrings == true) {
      System.out.println("d) Equal Strings? \t\t equal");
   } else {
      System.out.println("d) Equal Strings? \t\t NOT equal");
   }
   
   //Output part E
   System.out.println("e) Uppercase String 1: \t " + string_1Uppercase);
   
   //Output part F
   System.out.println("f) Lowercase String 2: \t " + string_2Lowercase);
   
   //Output part G
   System.out.println("g) Valid substring: \t\t " + validSubString);
   
   }

}