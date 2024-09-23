// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: jGRASP


import java.util.Scanner; //import scanner class
public class PalindromeNumber
{
 public static void main(String args[]) //program main method
 {
    Scanner userInput = new Scanner(System.in); //scanner class initialize 
    
    System.out.println("Please enter a 5 digit number to be tested if Palindrome. "); //prompt user for 5 digit input 
    
    int palindromeInput = userInput.nextInt(); //store palindrome input in variable
    
    //use mathematical division and modulus to extract the numbers in the 5 digit and store in int variables
    int value1 = palindromeInput / 10000;
    int value2 = palindromeInput % 10000 / 1000;
    int value3 = palindromeInput % 1000 / 100;
    int value4 = palindromeInput % 100 / 10;
    int value5 = palindromeInput % 10;
        
    //test if palindrome is 5 digits if less than 10k or greater than 99999, then it outputs invalid    
    if(palindromeInput < 10000 || palindromeInput > 99999) {
         System.out.println("Input value: \t " + palindromeInput);
         System.out.println("Judgment: \t\t Invalid input, must be 5 digits number.");
    }
    //use nested if else selection to test if values stored in variables value1, etc match for outer digits(first and last digit)
    //if outer digits match, then move into inner digits, 2nd and 4th
    //if 2nd and 4th match
    //then test if middle digit matches itself
    //then output if it is palindrome or not depending on whether conditions are met
    else if(value1 == value5) {
         if(value2 == value4) {
            if (value3 == value3) {
               System.out.println("Input value: \t " + palindromeInput);
               System.out.println("Judgment: \t\t Palindrome");
               
            }
            else {
               System.out.println("Input value: \t " + palindromeInput);
               System.out.println("Judgment: \t\t Not Palindrome");
            }
         }
         else {
         System.out.println("Input value: \t " + palindromeInput);
         System.out.println("Judgment: \t\t Not Palindrome");
    }

    } else {
         System.out.println("Input value: \t " + palindromeInput);
         System.out.println("Judgment: \t\t Not Palindrome");
    }
    
}   
}