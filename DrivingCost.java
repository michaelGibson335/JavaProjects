// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 1
// IDE: jGRASP


import java.util.Scanner; //import scanner class
public class DrivingCost
{
 public static void main(String args[]) //program main method
 {
    Scanner s = new Scanner(System.in); //scanner class initialize 
    System.out.print("Please enter the distance travelled in miles: "); //prompt user for trip distance miles
    double distanceMiles = s.nextDouble(); //store distance miles input in variable
    System.out.print("Please enter your vehicle's MPG: "); //prompt user for 
    double fuelMPG = s.nextDouble(); //store fuel miles per gallon in variable
    System.out.print("Please enter the cost of gas per gallon: "); //prompt user for price per gallon input
    double pricePerGallon = s.nextDouble(); //store price per gallon input in variable
    
    double tripCost = (distanceMiles / fuelMPG) * pricePerGallon; //calculate trip cost with formula
    
    //output distance miles, fuelMPG, price per Gallon and calculated trip cost
    System.out.println("The distance (miles): \t\t\t" + distanceMiles);
    System.out.println("Fuel efficiency (mpg): \t\t\t" + fuelMPG);
    System.out.println("Price per gallon (dollars): \t$" + pricePerGallon);
    System.out.println("The trip cost (dollars): \t\t$" + tripCost);
 }
} 