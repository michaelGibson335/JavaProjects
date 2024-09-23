// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 1
// IDE: jGRASP


import java.util.Scanner; //import scanner class
public class SumDigits
{
 public static void main(String args[]) //program main method
 {
    Scanner s = new Scanner(System.in);
    System.out.print("Please enter 4-digits integer number: "); //prompt user for input of 4 digit integer number
    int numInput = s.nextInt(); //store user input in numInput variable
    
    int firstNum = numInput / 1000; // store first number of 4 digit input using division
    int secondNum = numInput % 1000 / 100; //store second number of 4 digit input using remainder then division
    int thirdNum = numInput % 100 / 10; //store third number of 4 digit input using remainder then division
    int fourthNum = numInput % 10; //store fourth number of 4 digit input using just remainder
    
    int sumOfDigits = firstNum + secondNum + thirdNum + fourthNum; //store result sum of individual numbers of 4 digit
    
    System.out.println("The input number is: \t" + numInput); //output what number the user input and line up with \t
    System.out.print("The sum of digits is: \t" + sumOfDigits); //output the result sum of digits and line up with \t
 
 
 }
} 