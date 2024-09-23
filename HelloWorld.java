// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 1
// IDE: jGRASP


import java.util.Scanner; //import scanner class
public class HelloWorld
{
 public static void main(String args[]) //program main method
 {
 Scanner s = new Scanner(System.in);
 System.out.print("Please enter your name: "); //prompt user for input
 String name = s.nextLine(); //read user input
 System.out.println("Hello " + name + "!"); //print out your message
 }
} 