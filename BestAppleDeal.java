// Class: CS 5000
// Term: Fall 2024
// Name: Michael Gibson
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: jGRASP


import java.util.Scanner; //import scanner class

public class BestAppleDeal
{
 public static void main(String args[]) //program main method
 {
    Scanner userInput = new Scanner(System.in); //scanner class initialize 
    
    
    System.out.println("Please enter the small box weight. "); //prompt user for smallBox Weight
    
    double smallBoxWeight = userInput.nextInt(); //store smallBoxWeight input variable
     
    System.out.println("Please enter the small box price. "); //prompt user for smallBox Price
    
    double smallBoxPrice = userInput.nextInt(); //store smallBoxPrice input variable
     
    System.out.println("Please enter the large box weight. "); //prompt user for largeBox Weight
    
    double largeBoxWeight = userInput.nextInt(); //store largeBoxWeight input variable
     
    System.out.println("Please enter the large box price. "); //prompt user for largeBox price
    
    double largeBoxPrice = userInput.nextInt(); //store largeBoxPrice input variable
    
    //store price per lb calcualtions in variables for both small and large box for later comparision
    double smallBoxPriceLB = smallBoxPrice / smallBoxWeight;
    double largeBoxPriceLB = largeBoxPrice / largeBoxWeight;
    
    //convert double values back to int for proper output later
    int smallBoxWeightInt = (int)smallBoxWeight;
    int smallBoxPriceInt = (int)smallBoxPrice;
    int largeBoxWeightInt = (int)largeBoxWeight;
    int largeBoxPriceInt = (int)largeBoxPrice;
    
 
        
    //test if smallerbox price per lb is less than larger box, if less than, smallerbox is the better deal 
    if(smallBoxPriceLB < largeBoxPriceLB) {
         System.out.println("Small box weight: \t " + smallBoxWeightInt + " Pounds");
         System.out.println("Small box price: \t\t " + smallBoxPriceInt + " Dollars");
         System.out.println("Large box weight: \t " + largeBoxWeightInt + " Pounds");
         System.out.println("Large box price: \t\t " + largeBoxPriceInt + " Dollars");
         System.out.println("Judgment: \t\t\t\t The smaller box is a better deal. ");
         
    } 
    //test if largerrbox price per lb is less than smaller box, if less than, largerbox is the better deal 
    else if(smallBoxPriceLB > largeBoxPriceLB) {
         System.out.println("Small box weight: \t " + smallBoxWeightInt + " Pounds");
         System.out.println("Small box price: \t\t " + smallBoxPriceInt + " Dollars");
         System.out.println("Large box weight: \t " + largeBoxWeightInt + " Pounds");
         System.out.println("Large box price: \t\t " + largeBoxPriceInt + " Dollars");
         System.out.println("Judgment: \t\t\t\t The large box is a better deal. ");
    
    } 
    //test if smallerbox price per lb equal to larger box, if equal to, both boxes are same value
    else if(smallBoxPriceLB == largeBoxPriceLB) {
         System.out.println("Small box weight: \t " + smallBoxWeightInt + " Pounds");
         System.out.println("Small box price: \t\t " + smallBoxPriceInt + " Dollars");
         System.out.println("Large box weight: \t " + largeBoxWeightInt + " Pounds");
         System.out.println("Large box price: \t\t " + largeBoxPriceInt + " Dollars");
         System.out.println("Judgment: \t\t\t\t Both boxes are of the same value. ");
    }
       
   }
} 